package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {

		//test
		//Spring IoC will be used
		
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Notebook", 20, 60);
		productService.add(product);
	}

}
