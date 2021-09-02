package com.co.pa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int []array = new int[n];

	    for(int i = 0; i < n; i++)
            array[i] = scanner.nextInt();

        bubbleSort(array);
    }

    public static void bubbleSort(int []array){
        for(int i = 0; i < (array.length - 1); i++){
            for(int j = 0; j < (array.length - 1) - i; j++){
                if(array[j] > array[j + 1]){
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        print(array);
    }

    public static void print(int []array){
        for(int i = 0; i < array.length; i++){
            System.out.println("array[" + i + "]= " + array[i]);
        }
    }
}
