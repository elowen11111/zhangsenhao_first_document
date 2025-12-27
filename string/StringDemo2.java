package string;
import java.util.Queue;
import java.util.Scanner;
public class StringDemo2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int money=sc.nextInt();
        while(true){
            if((money>=0)&&(money<=9999999)){
                break;
            }else{
                System.out.println("输入错误");
            }
        }
        String moneyStr="";
        while(true){
            int ge=money%10;
            String capitalNumber=getCapitalNumber(ge);
            moneyStr=capitalNumber+moneyStr;
            money=money/10;
            if(money==0){
                break;
            }
        }
        int count=7-moneyStr.length();
        for(int i=0;i<count;i++){
            moneyStr="零"+moneyStr;
        }
        String result="";
        String[] arr={"佰","拾","万","千","佰","拾","元"};
        for(int i=0;i<moneyStr.length();i++){
            char c=moneyStr.charAt(i);
            result=result+c+arr[i];

        }
        System.out.println(result);
    }

    public static String getCapitalNumber(int number){
        String[] arr={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }


}
