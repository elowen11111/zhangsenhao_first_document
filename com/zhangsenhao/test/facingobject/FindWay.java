package com.zhangsenhao.test.facingobject;

import java.sql.SQLOutput;

public class FindWay {
    public static void main(String[] args) {
        int[][]map=new int[8][7];
        //给迷宫设置墙壁
        for(int i=0;i<7;i++){
            map[0][i]=1;
            map[7][i]=1;
        }
        for(int i=0;i<8;i++){
            map[i][0]=1;
            map[i][6]=1;
        }
        map[3][1]=1;
        map[3][2]=1;
//使用递归调用的方法找路
        boolean findway=find( map, 1,1);
        System.out.println("findway");
        //打印迷宫
        for(int i=0;i<8;i++){
            for(int j=0;j<7;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
    //0表示可以走,1表示是障碍物,2表示可以走，3表示走过，但是走不通，是死路
    public static boolean find(int[][] map,int i,int j){
        if(map[6][5]==2){
            return true;
        }else{
            if(map[i][j]==0){
                map[i][j]=2;
                if(find(map,i+1,j)){
                    return true;
                }else if(find(map,i,j+1)){
                    return true;
                }else if(find(map,i-1,j)){
                    return true;
                }else if(find(map,i,j-1)){
                    return true;
                }else{
                    map[i][j]=3;
                    return false;
                }
            }else{
                return false;
            }
        }
    }
}
