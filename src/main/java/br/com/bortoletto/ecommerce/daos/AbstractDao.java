package br.com.bortoletto.ecommerce.daos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.collections4.CollectionUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;

public abstract class AbstractDao<E extends Serializable, I extends Serializable> implements Dao<E, I> {

	protected enum OrderBy {
		ASC, DESC
	}

	@PersistenceContext
	private EntityManager em;
	private Class<E> entityClass;

	public AbstractDao(Class<E> entityClass) {
		this.entityClass = entityClass;
	}

	public E findById(I id) {
		return em.find(entityClass, id);
	}

	public E save(E entity) {
		em.persist(entity);
		return entity;
	}

	public void delete(E entity) {
		em.remove(entity);
	}

	public E update(E entity) {
		return em.merge(entity);
	}

	@SuppressWarnings("unchecked")
	public List<E> findAll() {
		return em.createQuery(String.format("from %s", entityClass.getName())).getResultList();
	}

	/**
	 * Realiza um filtro na tabela de acordo com os campos preenchidos da
	 * entidade
	 * 
	 * @param entity
	 *            filtro
	 * @param page
	 *            pode ser null
	 * @param pageSize
	 *            pode ser null
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<E> findByExample(E entity, Integer page, Integer pageSize) {
		Criteria c = getSession().createCriteria(entity.getClass());
		c.add(Example.create(entity));
		if (page != null && pageSize != null) {
			int firstResult = (page - 1) * pageSize;
			int maxResults = firstResult + pageSize;
			c.setFirstResult(firstResult);
			c.setMaxResults(maxResults);
		}
		return c.list();
	}

	/**
	 * Realiza um filtro na tabela de acordo com os campos preenchidos da
	 * entidade possibilita uma busca ordenada
	 * 
	 * @param entity
	 *            filtro
	 * @param ordem
	 *            ASC ou DESC
	 * @param orderByPropertyNames
	 *            Propriedades do orderBy
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<E> findByExampleOrdered(E entity, OrderBy ordem, List<String> orderByPropertyNames) {
		Criteria c = getSession().createCriteria(entity.getClass());
		c.add(Example.create(entity));
		if (ordem != null && CollectionUtils.isNotEmpty(orderByPropertyNames)) {
			for (String property : orderByPropertyNames) {
				c.addOrder(OrderBy.ASC.equals(ordem) ? Order.asc(property) : Order.desc(property));
			}
		}
		return c.list();
	}

	protected EntityManager getEntityManager() {
		return this.em;
	}

	protected Session getSession() {
		return this.em.unwrap(Session.class);
	}
}
