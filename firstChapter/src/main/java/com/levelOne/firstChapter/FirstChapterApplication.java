package com.levelOne.firstChapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstChapterApplication {

	//What are beans?
	//What are dependencies of a bean?
	//Where to search for beans?


	public static void main(String[] args) {
		//Dont need to create since Spring handles the beans
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());

		//Application Context handles all the beans for us. We dont need to use new or anything.
		ApplicationContext applicationContext = SpringApplication.run(FirstChapterApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new  int[] {124, 6}, 3);
		System.out.println(result);

	}

}
