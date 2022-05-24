package com.nexsoft.array;

import java.util.Arrays;

public class SampleArray3 {

	public static void main(String[] args) {
		int data[] = {64, 25, 12, 22, 11};
		int max = data[0];
		int min = data[0];
		/*
		//Cari max di array
		for(int i = 0; i < data.length; i++) {
			if(max < data[i]) {
				max = data[i];
			}
		}
		System.out.println("Max : " + max);
		
		//Cari min di array
		for(int i = 0; i < data.length; i++) {
			if(min > data[i]) {
				min = data[i];
			}
		}
		System.out.println("Min : " + min);
		*/
		System.out.println("Before sort");
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
		// Sort Ascending
		System.out.println("\nAfter sort");
		for(int i = 0; i < data.length; i++) {
			int index = i;
			for(int j = i + 1; j < data.length; j++) {
				System.out.println(data[j]);
				System.out.println(data[index]);
				if(data[j] < data[index]) {
					System.out.println("hasil if " + data[j]);
					index = j;
				}
			}
			int temp = data[index];
			data[index] = data[i];
			data[i] = temp;
			System.out.println(Arrays.toString(data));
			
		}
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		/*
		// Sort Descending
		System.out.println("\nAfter sort");
		for(int i = 0; i < data.length; i++) {
			int index = i;
			for(int j = i + 1; j < data.length; j++) {
				if(data[j] > data[index]) {
					index = j;
				}
			}
			int temp = data[index];
			data[index] = data[i];
			data[i] = temp;
		}
				
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		*/
	}

}
