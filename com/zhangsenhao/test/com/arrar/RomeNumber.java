package com.zhangsenhao.test.com.arrar;
import java.util.Scanner;
public class RomeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str;
        while(true){
            System.out.println("请输入数字");
            str=sc.next();
            boolean flag=check(str);
            if( flag){
                break;
            }else{
                System.out.println("输入错误");
                continue;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int num=c-'0';

            sb.append(change(num));
        }
        System.out.println(sb.toString());
    }
    public static boolean check(String str){
        if(str.length()>9){
            return false;
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>'9'||c<'0'){
                return false;
            }
        }
        return true;
    }
    public static String change(int number){
        String[] rome={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return rome[number];
    }
    //change方法还可以写成这样
    public static String changLuoMa(int number){
        String str=switch(number){
            case '0'->"";
            case '1'->"I";
            case '2'->"III";
            case '4'->"IV";
            case '5'->"V";
            case '6'->"VI";
            case '7'->"VII";
            case '8'->"VIII";
            case '9'->"IX";
            default ->str="";
        };
        return str;
    }

}
