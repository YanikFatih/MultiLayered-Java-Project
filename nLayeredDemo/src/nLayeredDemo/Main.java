package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {

		//test
		//Spring IoC kullanýlacak
		
		ProductService productService = new ProductManager(new AbcProductDao());
		
		Product product = new Product(1,2,"Notebook", 20, 60);
		productService.add(product);
	}

}
