package com.one.day;

import java.util.Random;
import java.util.Scanner;

public class K_demensionArray {

	public static void main(String[] args) {
		
		
			Scanner sc = new Scanner(System.in);
			System.out.print("���� ũ�⸦ �Է��Ͻÿ� : ");
			int num = sc.nextInt();
			int sum;
System.out.println("=== 5�� ��� ��� ===");
			int[][] arr = new int[3][num];

			for(int i=0; i<arr.length; i++) {
				sum=0;

				for(int j=0; j<num; j++) {
					arr[i][j]= new Random().nextInt(100)+1;
					sum +=arr[i][j];


					if((j ==(num-1)) && sum%5==0) {
						for(int v=0; v<num; v++) {
							System.out.print(arr[i][v] + " ");
						}
						System.out.println();
					}




				}
			}
			System.out.println("==== ��ü ��� ====");
			for(int i =0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]);

					if(j!= arr[i].length-1) {
						System.out.print(", ");
					}
				}
				System.out.println();
			}
		}
	



}
