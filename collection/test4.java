package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class test4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            User u=new User();
            System.out.println("请输入用户id:");
            String id=sc.next();
            System.out.println("请输入用户名:");
            String username=sc.next();
            System.out.println("请输入用户密码:");
            String password=sc.next();
            u.setUsername(username);
            u.setId(id);
            u.setPassword(password);
            list.add(u);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getId()+"--"+list.get(i).getUsername()+"--"+list.get(i).getPassword());
        }
        String foundId=sc.next();
        boolean flag=contains(list ,foundId);
        if( flag){
            System.out.println("找到了");
        }else{
            System.out.println("没有找到");
        }
    }
    public static boolean contains(ArrayList<User> list,String id){
        for(int i=0;i<list.size();i++){
            User u=list.get(i);
            String uid=u.getId();
            if(uid.equals(id)){
                return true;
            }
        }
        return false;
    }
}