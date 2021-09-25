package com.bridgelabz.SumOfThree;

import java.util.Scanner;

public class SumOfThree {
	private int number;
	private int[] arr;

	public SumOfThree() {
		System.out.println("object is being created");
	}

	public void setNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of integers");
		this.number = sc.nextInt();
	}
	public void setArr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("assigning the value of Arr");
		this.arr = new int[this.number];
		System.out.println("taking input in array");
		for(int i =0 ; i < this.number ; i++) {
			arr[i] = sc.nextInt();
		}
	}
	public int getNumber() {
		return this.number;
	}
	public int[] getArr() {
		return this.arr;
	}

	public void findTriplets() {
		int counter =0;
		for(int i =0; i < this.number -2 ; i++) {
			for(int j = i+1 ; j< this.number -1 ;j++) {
				for (int k = j+1; k< this.number; k++) {
					if((this.arr[i]+this.arr[j]+this.arr[k]) == 0) {
						counter++;
						System.out.println("("+ this.arr[i] + "," + this.arr[j] + "," + this.arr[k] +")");
					}

				}
			}
		}
		System.out.println("total distinct triplets are : "+ counter);
	}

}
