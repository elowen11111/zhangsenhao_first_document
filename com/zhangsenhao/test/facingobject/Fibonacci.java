package com.zhangsenhao.test.facingobject;

public class Fibonacci {
    public static void main(String[] args){
        System.out.println("对应的斐波那契数="+f(7));
    }
    public static int f(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return f(n-1)+f(n-2);
    }
}
