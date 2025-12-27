package com.zhangsenhao.test;

import java.util.Scanner;
//注意：jdk120以上版本使用case 1->{}
public class cycleexercise {
    public static void main(String[] args) {

           Scanner sc=new Scanner(System.in);
           int number=sc.nextInt();
           boolean isprime=true;
           for(int i=2;i<number;i++){
               if(number%i==0){
                   isprime=false;
                   System.out.println("不是素数");
                   break;
               }
               }
           if(isprime){
               System.out.println("是素数");
           }
           }
    }

