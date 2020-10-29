package com.levelOne.firstChapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstChapterApplication {

	//What are beans?
	//What are dependencies of a bean?
	//Where to search for beans?


	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		int result = binarySearch.binarySearch(new  int[] {124, 6}, 3);
		System.out.println(result);
		//SpringApplication.run(FirstChapterApplication.class, args);
	}

}
