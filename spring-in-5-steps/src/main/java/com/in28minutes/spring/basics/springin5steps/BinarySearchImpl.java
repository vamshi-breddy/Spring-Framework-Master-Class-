package com.in28minutes.spring.basics.springin5steps;

public class BinarySearchImpl {

	private SortAlgorithm sortalgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortalgorithm) {
		super();
		this.sortalgorithm = sortalgorithm;
	}




	public int binarySearch(int[] numbers,int numberToSearchFor) {
	int[] sortedNumbers=sortalgorithm.sort(numbers);
	System.out.println(sortalgorithm);
	
	//search the array 
	return 3;
}
}
