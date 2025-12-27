package com.zhangsenhao.test.com.arrar;
import java.util.Scanner;
public class encrypt {
    //数字的加密
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int tmp=number;
        int count=0;
        while(number>0){
            int ge;
            number/=10;
            count++;
        }
        int[] arr=new int[count];
        int index=0;
        while(tmp>0){
            int ge=tmp%10;
            arr[index]=ge;
            tmp/=10;
            index++;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]+=5;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]%10;
        }
        for (int i = 0, j=arr.length-1; i <j; i++,j--) {
            int tmp1=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        //数字解密
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int tmp1=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp1;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=0&&arr[i]<=4){
                arr[i]+=10;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]-=5;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
