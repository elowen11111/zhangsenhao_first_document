package Exercise.hsp;

public class HanoiTower {
    public static void main(String[] args){
    move(3,'A','B','C');
    }
//表示要移动的个数,a,b,c分别表示A塔，B塔，C塔
    public static void move(int num,char a,char b,char c){
        if(num==1){
            System.out.println(a+"->"+c);
        }else{
            //如果有两个盘，可以看成两个，最下面的和最上面的盘
            //先移动上面所有的盘到b，借助c
            move(num-1,a,c,b);
            //把最下面的这个盘移动到c
            System.out.println(a+"->"+c);
            //再把b塔的所有盘，移动到c，借助a
            move(num-1,b,a,c);
        }
    }

}
