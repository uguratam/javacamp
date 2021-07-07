package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLogggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {

	   // todo: Srping Ioc ile ��z�lecek
		ProductService productService = new ProductManager(new AbcProductDao(),
				new JLogggerManagerAdapter());
		Product product = new Product(1, 2, "Elma", 12, 50);
		productService.add(product);
	}

}
