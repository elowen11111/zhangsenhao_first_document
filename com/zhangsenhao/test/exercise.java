package com.zhangsenhao.test;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[][][] sum=new int[19][19][19];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int l=0;l<n;l++){
                    if(arr[i]!=arr[j]&&arr[j]!=arr[l]){
                        sum[i][j][k]=arr[i]+arr[j]+arr[l];
                    }
                }
            }
        }
//        public static
    }
}