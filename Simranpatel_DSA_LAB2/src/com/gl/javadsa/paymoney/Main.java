package com.gl.javadsa.paymoney;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of transactions :");
        int transactionArraySize = in.nextInt();
        int[] transactions = new int[transactionArraySize];
       
 
        System.out.println("Enter the transaction values:");    
        for (int index = 0; index < transactionArraySize; index ++) {
            transactions[index] = in.nextInt();
        }              
       
        System.out.print("Enter the number of targets (instances) to be achieved:");
        int targetInstanceSize = in.nextInt();
       
        for (int count = 1; count <= targetInstanceSize; count ++) {
 
            System.out.println();
            System.out.print("Enter the target value :");
            int dailyTarget = in.nextInt();
 
            System.out.println("Processing transactions with target value -> "
                                        + dailyTarget);
           
            TargetDeterminator determinator = new TargetDeterminator(transactions, dailyTarget);
           
            determinator.determine();
           
        }
       
        if(in !=null) {
            in.close();
        }
    }

}
