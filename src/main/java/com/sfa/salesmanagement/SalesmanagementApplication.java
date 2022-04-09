package com.sfa.salesmanagement;

import com.sfa.salesmanagement.entities.Category;
import com.sfa.salesmanagement.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SalesmanagementApplication implements CommandLineRunner{

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(SalesmanagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Eletronicos");
		Category cat2 = new Category(2L, "Televisoes");

		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
	}

}
