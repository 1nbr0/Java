package fr.myschool.arraysort;

import java.util.Iterator;

public class Sorter {
	public static void main(String[] args) {

		System.out.println("Hello ArraySortLab");

		int[] arrayToSort = {56, 12, 32, 1, 99, 72, 24};

		displayArray(arrayToSort);
		
//		System.out.println("BubbleSort ");
//		bubbleSort(arrayToSort);
		
//		System.out.println("SelectionSort ");
//		selectionSort(arrayToSort);
		
		System.out.println("InsertionSort ");
		insertionSort(arrayToSort);
		displayArray(arrayToSort);
	}
	
	static void bubbleSort(int[] values) {
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values.length-1; j++) {
				if (values[j] > values[j + 1]) {
					int temp = values[j];
					values[j] = values[j + 1];
					values[j + 1] = temp;
				}		
			}
		}
	}

	static void displayArray(int[] values) {
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}
	

	static void selectionSort(int[] values) {
		for (int i = 0; i < values.length; i++) {
			int Smallsub = i;
			for (int j = i + 1; j < values.length; j++) {
				if (values[j] < values[Smallsub]) {
					Smallsub = j;
				}
			}
			int temp = values[i];
			values[i] = values[Smallsub];
			values[Smallsub] = temp;
		}
		
	}
	
	static void insertionSort(int[] valuesInsert) {
		for (int i = 0; i < valuesInsert.length; i++) {
			int j = i;
			while (j >= 1 && valuesInsert[j] < valuesInsert[j - 1]) {
				int temp = valuesInsert[j];
				valuesInsert[j] = valuesInsert[j - 1];
				valuesInsert[j - 1] = temp;
				j = j - 1;
			}
		}
		
	}



}
