package com.zhangsenhao.test;
import java.util.Random;
    public class exercise1 {
    public static void main(String[] args)
    {
        Random r=new Random();
        int[] arr=new int[]{1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            int randomnumber=r.nextInt(arr.length);
            int tmp=arr[i];
            arr[i]=arr[randomnumber];
            arr[randomnumber]=tmp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}