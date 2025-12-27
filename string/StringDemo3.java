package string;
import java.util.Scanner;
public class StringDemo3 {
    public static void main(String[] args){
        //请输入您的手机号
        Scanner sc=new Scanner(System.in);
        String phoneNumber=sc.next();
        String start=phoneNumber.substring(0,3);
        String end=phoneNumber.substring(7);
        String result=start+"****"+end;
        System.out.println(result);
        //请输入您的身份证号码
        String idNumber=sc.next();
        String year=idNumber.substring(6,10);
        String month=idNumber.substring(10,12);
        String day=idNumber.substring(12,14);
        char sex=idNumber.charAt(16);
        int sexNumber=sex-'0';
        System.out.println("您的出生年份是"+year+"年");
        System.out.println("您的出生月份是"+month+"月");
        System.out.println("您的出生那天是"+day+"日");
        if(sexNumber%2==0){
            System.out.println("您的性别是女");
        }else{
            System.out.println("您的性别是男");
        }
        String talk="你玩得真好，下次不要再玩了，CNM,TMD,SB";
        String[] arr={"TMD","SB","CNM","MLGB"};
        for(int i=0;i<arr.length;i++){
            talk=talk.replace(arr[i],"***");
        }
        System.out.println(talk);
        }
    }


