package com.zhangsenhao.test;

import java.util.Scanner;

public class exercise_2025_12_7date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        do{
            if(arr.length==1){
                System.out.println("无法继续删除");
                break;
            }
            int[] arr1=new int[arr.length-1];
            for(int i=0;i<arr.length-1;i++){
                arr1[i]=arr[i];
            }
            arr=arr1;
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println("您是否要继续删除:y/n");
            char sigal=sc.next().charAt(0);
            if(sigal=='n'){
                break;
            }
        }while(true);
    }
}