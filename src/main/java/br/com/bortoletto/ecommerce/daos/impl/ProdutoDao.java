package br.com.bortoletto.ecommerce.daos.impl;

import java.util.List;

import javax.enterprise.context.RequestScoped;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.hibernate.type.BigDecimalType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import br.com.bortoletto.ecommerce.daos.AbstractDao;
import br.com.bortoletto.ecommerce.dtos.ProdutoListagemDto;
import br.com.bortoletto.ecommerce.entities.Produto;
import br.com.bortoletto.ecommerce.utils.DaoUtils;

/**
 * Classe DAO que representa a tabela Produto
 * 
 * @author Vitor Bortoletto Junior 3 de dez de 2016
 */
@RequestScoped
public class ProdutoDao extends AbstractDao<Produto, Integer> {

	/**
	 * 
	 */
	public ProdutoDao() {
		super(Produto.class);
	}

	/**
	 * Busca os produtos mais vendidos paginado
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<ProdutoListagemDto> findMaisVendidos(Integer page, Integer pageSize) {
		StringBuilder hql = new StringBuilder();

		hql.append(
				" SELECT count(*) as quantidadeVendida, p.id as id, p.nome as nome, p.preco as preco, ip.url_imagem as urlImagem ");
		hql.append(" FROM ");
		hql.append(" 	produto p ");
		hql.append("     INNER JOIN imagem_produto ip ON ip.id_produto = p.id ");
		hql.append("     INNER JOIN carrinho_produto cp ON cp.id_produto = p.id ");
		hql.append("     INNER JOIN carrinho c ON c.id = cp.id_carrinho ");
		hql.append("     INNER JOIN encomenda e ON e.id_carrinho = c.id ");
		hql.append(" WHERE ");
		hql.append(" 	ip.imagem_principal ");
		hql.append(" GROUP BY ");
		hql.append(" 	p.id, p.nome, p.preco, ip.url_imagem ");
		hql.append(" ORDER BY ");
		hql.append(" 	quantidadeVendida DESC ");

		Query query = this.getEntityManager().unwrap(Session.class).createSQLQuery(hql.toString()).addScalar("id", IntegerType.INSTANCE)
				.addScalar("nome", StringType.INSTANCE).addScalar("preco", BigDecimalType.INSTANCE).addScalar("urlImagem", StringType.INSTANCE);
		DaoUtils.paginateQuery(query, page, pageSize);
		query.setResultTransformer(Transformers.aliasToBean(ProdutoListagemDto.class));
		return query.list();
	}
	
	/**
	 * Busca os produtos mais vendidos paginado
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public Integer findMaisVendidosCount() {
		StringBuilder hql = new StringBuilder();

		hql.append(" SELECT count(*)");
		hql.append(" FROM ");
		hql.append(" 	produto p ");
		hql.append("     INNER JOIN imagem_produto ip ON ip.id_produto = p.id ");
		hql.append("     INNER JOIN carrinho_produto cp ON cp.id_produto = p.id ");
		hql.append("     INNER JOIN carrinho c ON c.id = cp.id_carrinho ");
		hql.append("     INNER JOIN encomenda e ON e.id_carrinho = c.id ");
		hql.append(" WHERE ");
		hql.append(" 	ip.imagem_principal ");
		hql.append(" GROUP BY ");
		hql.append(" 	p.id, p.nome, p.preco, ip.url_imagem ");
		hql.append(" ORDER BY ");
		hql.append(" 	quantidadeVendida DESC ");

		Query query = this.getEntityManager().unwrap(Session.class).createSQLQuery(hql.toString());
		return query.getFirstResult();
	}

	public Produto findByTipoProduto() {
		// TODO Auto-generated method stub
		return null;
	}

}
