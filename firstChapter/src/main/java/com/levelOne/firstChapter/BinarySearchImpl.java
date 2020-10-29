package com.levelOne.firstChapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Bean
@Component
public class BinarySearchImpl{

    //Dependency
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor){
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        //Sort Array

        //Search the Array

        //Return the result
        return 3;
    };

}
