package nLayeredDemo;

import nLayeredDemo.busiess.abstracts.ProductService;
import nLayeredDemo.busiess.concretes.ProductManager;
import nLayeredDemo.core.JloggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProducDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo: Spring IoC ile çözülecek.
		ProductService productService = new ProductManager(new AbcProducDao(), new JloggerManagerAdapter());
		
		Product product = new Product(1, 2, "Elma", 12, 50);
		productService.add(product);

	}

}