package string;
import java.util.Scanner;
public class StringDemo5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String sa=sc.next();
        String sb=sc.next();
        System.out.println(check(sa,sb));
    }
    public static boolean check(String sa,String sb){
        for(int i=0;i<sa.length();i++){
            sa=exchange(sa);
            if(sa.equals(sb)){
                return true;
            }
        }
        return false;
    }
    public static String exchange(String s){
        char first =s.charAt(0);
        String end=s.substring(1);
        return end+first;
    }
    //还有一种将第一个字符放在最后的方法
    public static String rotate(String str){
        char[] arr=str.toCharArray();
        char first =arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;
        String result=new String(arr);
        return result;
    }
}
