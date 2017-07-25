package br.com.bortoletto.ecommerce.entities.factory;

import java.util.Iterator;

import br.com.bortoletto.ecommerce.entites.decorator.Bacon;
import br.com.bortoletto.ecommerce.entites.decorator.Cebolinha;
import br.com.bortoletto.ecommerce.entites.decorator.MolhoBranco;
import br.com.bortoletto.ecommerce.entites.decorator.MolhoVermelho;
import br.com.bortoletto.ecommerce.entites.decorator.Ovo;
import br.com.bortoletto.ecommerce.entites.decorator.Pasta;
import br.com.bortoletto.ecommerce.entites.decorator.QueijoRalado;

public class DecoratorFactory {

	private DecoratorFactory() {
		//
	}

	public static Pasta decoratorPasta(Iterator<String> itens, Pasta pasta) {

		Pasta novaPasta = pasta;

		while (itens.hasNext()) {
			String item = itens.next();
			if (item.equals("Bacon")) {
				novaPasta = new Bacon(novaPasta);
			} else if (item.equals("Cebolinha")) {
				novaPasta = new Cebolinha(novaPasta);
			} else if (item.equals("Molho Branco")) {
				novaPasta = new MolhoBranco(novaPasta);
			} else if (item.equals("Molho Vermelho")) {
				novaPasta = new MolhoVermelho(novaPasta);
			} else if (item.equals("Ovo")) {
				novaPasta = new Ovo(novaPasta);
			} else if (item.equals("Queijo Ralado")) {
				novaPasta = new QueijoRalado(novaPasta);
			}

		}
		pasta.setDescricao(novaPasta.getDescricao());

		return pasta;

	}

}
