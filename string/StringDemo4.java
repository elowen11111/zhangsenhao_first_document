package string;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        String result=new StringBuilder().append(str).reverse().toString();
        if(str.equals(result)){
            System.out.println("当前字符是对称字符串");
        }else{
            System.out.println("当前字符不是对称字符串");
        }
        int[] arr={1,2,3};
        String res=arrToString(arr);
        System.out.println(res);
    }
    public static String arrToString(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
