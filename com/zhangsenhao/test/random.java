package com.zhangsenhao.test;
import java .util .Random;
public class random {
   public static void main(String[] args){
       Random r=new Random();
       int randomnum=r.nextInt(100 )+1;
//       范围是1~100
        System.out.println(randomnum);
   }
}
