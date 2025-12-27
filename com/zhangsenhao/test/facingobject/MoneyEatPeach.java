package com.zhangsenhao.test.facingobject;

public class MoneyEatPeach {
    public static void main(String[] args) {
        System.out.println(num(1));
    }
    public static int num(int day){
        if(day==10){
            return 1;
        }else if(day>=1&&day<=9){
            return (num(day+1)+1)*2;
        }else{
            return -1;
        }
    }
}
