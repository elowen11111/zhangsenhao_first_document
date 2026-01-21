package Exercise.hsp;

import java.util.Random;
import java.util.Scanner;

public class ThisTest1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("欢迎来玩石头剪刀布");
        System.out.println("请输入您的选择:0剪刀1石头2布3退出");
        int winCount=0;
        int loseCount=0;
        int sameCount=0;
        while(true){
            //用户输入值
            int userChoice=sc.nextInt();
            if(userChoice==3){
                break;
            }
            if(userChoice!=2&&userChoice!=1&&userChoice!=0){
                System.out.println("输入错误，请重新输入");
                continue;
            }
            //电脑生成伪随机数
            int computerChoice=r.nextInt(3);
            System.out.println(computerChoice);
            if(computerChoice==userChoice){
                System.out.println("平局");
                sameCount++;
            }else if((userChoice==0&&computerChoice==2)||(userChoice==1&&computerChoice==0)||(userChoice==2&&computerChoice==1)){
                System.out.println("您赢了");
                winCount++;
            }else{
                System.out.println("您输了");
                loseCount++;
            }
        }
        if(winCount==0&&loseCount==0&&sameCount==0){
            System.out.println("游戏结束");
        }else{
            System.out.println("游戏结束");
            System.out.println("赢的次数\t输的次数\t平局的次数");
            System.out.println(winCount+"\t"+loseCount+"\t"+sameCount+"\t");
        }
    }

}
