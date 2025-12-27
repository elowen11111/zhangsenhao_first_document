package com.zhangsenhao.test.com.arrar;
import java.util.Random;
import java.util.Scanner;
public class unionLotto {
    public static void main(String[] args){
        int[] arr=new int[7];
//        Random r=new Random();
        creatnumber(arr);//生成随机的号码
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //让用户输入买的号码
        int[] userarr=new int[7];
        ueserbuynumber(userarr);
        //比较用户号码与中奖号码
        compare(arr,userarr);
    }
    public static void creatnumber(int[] arr){
        Random r=new Random();
        for(int i=0;i<arr.length-1;i++){
            arr[i]=r.nextInt(33)+1;
        }
        arr[arr.length-1]=r.nextInt(16)+1;
    }
    public static void ueserbuynumber(int[] userarr){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<userarr.length-1; ){
            System.out.println("请输入第"+(i+1)+"个号码");
            userarr[i]=sc.nextInt();
            if(userarr[i]<=33&&userarr[i]>=1){
                i++;
            }else{
                System.out.println("输入错误，请重新输入");
            }
        }
        System.out.println("请输入第"+userarr.length+"个号码");

           while(true){
               userarr[userarr.length-1]=sc.nextInt();
               if(userarr[userarr.length-1]>=1&&userarr[userarr.length-1]<=16){
                   break;
               }else{
                   System.out.println("输入错误，请重新输入");
               }
           }
    }
    public static void compare(int[] arr,int[] userarr){
        int countRed=0;
        int countBlue=0;
        for(int i=0;i<userarr.length-1;i++){
            int numberRed=userarr[i];
            for(int j=0;j<arr.length-1;j++){
                if(numberRed==arr[j]){
                    countRed++;
                    break;
                }
            }
        }
        int numberBlue=userarr[userarr.length-1];
        if(numberBlue==arr[arr.length-1]){
            countBlue++;
        }
        //判断结束，开始输出
        if(countRed==6&&countBlue==1){
            System.out.println("恭喜你，中奖1000万");
        }else if(countRed==6&&countBlue==0){
            System.out.println("恭喜你，中奖500万");
        }else if(countRed==5&&countBlue==1){
            System.out.println("恭喜你，中奖3000");
        }else if((countRed==4&&countBlue==1)||countRed==5&&countBlue==0){
            System.out.println("恭喜你，中奖200");
        }else if((countRed==4&&countBlue==0)||(countRed==3&&countBlue==1)){
            System.out.println("恭喜你，中将10元");
        }else if((countRed==1&&countBlue==1)||(countRed==2&&countBlue==1)||(countRed==0&&countBlue==1)){
            System.out.println("恭喜你，中将5元");
        }else{
            System.out.println("谢谢惠顾");
        }
    }
}
