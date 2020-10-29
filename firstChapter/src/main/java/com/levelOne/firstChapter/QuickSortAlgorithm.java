package com.levelOne.firstChapter;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
    //Not actually implementing the algorithm.
    public int[] sort(int[] numbers){
        return numbers;
    }
}
