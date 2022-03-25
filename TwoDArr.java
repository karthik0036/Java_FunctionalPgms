package com.bridge;

import java.util.Scanner;

public class TwoDArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();
        
        System.out.println("Enter array elements : ");
        int twoD[][] = new int[rows][columns];
        
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<columns;j++) {
        		twoD[i][j]=sc.nextInt();
        	}
        }
        System.out.print("\n Data you entered : \n");
        // Loop through all rows
        for (int[] x : twoD) {
        	// Loop through all columns of current row
            for (int y : x) {

                System.out.print(y + "        ");
            }
            System.out.println();
        }
        sc.close();

	}

}
