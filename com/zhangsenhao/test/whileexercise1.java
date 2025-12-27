package com.zhangsenhao.test;
import java.sql.SQLOutput;
import java .util .Scanner;
public class whileexercise1  {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();
      if(number<0){
          number=-number;
      }
      int cnt=0;
      while(number>0){
          cnt+=number%10;
          number/=10;
      }
        System.out.println(cnt);
    }
}
