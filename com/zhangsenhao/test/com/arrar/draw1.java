package com.zhangsenhao.test.com.arrar;
import java.util.Random;
public class draw1 {
    public static void main(String args[]){
        int[] bonus=new int[]{2,588,888,1000,10000};
        int[] newarr=new int[5];
        for(int i=0;i<bonus.length; ){
            Random r=new Random();
            int index=r.nextInt(5);
            int number=bonus[index];
            boolean flag=exisetence(newarr,number);
            if(!flag){
                newarr[i]=number;
                i++;
            }
        }
        for(int i=0;i<newarr.length;i++){
            System.out.println(newarr[i]);
        }
    }
    public static boolean exisetence(int[] arr,int number){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number){
                return true;
            }
        }
        return false;
    }
}
