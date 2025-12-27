package collection;
import java.util.Scanner;
import java.util.ArrayList;
public class test2 {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("本田雅阁");
        list.add("大众速腾");
        list.add("大众帕萨特");
        String result=list.set(1,"帕拉梅拉");
        System.out.println(list);
        String get=list.get(1);
        System.out.println(get);
    }
}
