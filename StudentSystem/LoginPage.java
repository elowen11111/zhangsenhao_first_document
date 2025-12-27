package StudentSystem;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class LoginPage {
    public static void main(String[] args){
        //主页面打印
        System.out.println("欢迎来到到学生管理系统");
        System.out.println("请选择操作1登录  2注册  3忘记密码 4退出");
        //初始化集合
        ArrayList<User> list=new ArrayList<>();
        //用户选择操作
        Scanner sc=new Scanner(System.in);
        loop:while(true){
            String choose=sc.next();
            switch(choose){
                case "1":{
                    System.out.println("请输入用户名");
                    String username=sc.next();
                    boolean exist= UsernameExist( username,list);
                    if(!exist){
                        System.out.println("用户名未注册，请先注册");
                        break;
                    }
                    int cnt=0;
                    while (cnt <= 3) {
                        System.out.println("请输入密码");
                        String inputPassword=sc.next();
                        boolean passwordRight= PasswordRight(inputPassword,list,username);
                        if(passwordRight){
                            break;
                        }
                        cnt++;
                    }
                    if(cnt==4){
                        System.out.println("该用户已被锁定,请联系管理处");
                        break;
                    }
                    while(true){
                        String coding=CreatCode();
                        System.out.println("验证码是"+coding);
                        String inputCode=sc.next();
                        if(!(inputCode.equals(coding))){
                            System.out.println("验证码错误");
                            continue;
                        }
                        break;
                    }
                    System.out.println("登录成功");
                    //登录
                    break ;
                }
                //注册
                case "2":{
                    String username=registerFuntion(list);//输入用户名
                    if(username.equals("0")){
                        break;

                    }
                    User u=new User();
                    u.setUsername(username);//设置用户名
                    String userPassword=getUserPassword();//输入密码
                    u.setPassword(userPassword);//设置密码
                    String uIDNumber=getUserIDnumber();//获得身份证号码
                    u.setIdNumber(uIDNumber);//设置身份证号码
                    String uphoneNumber= getUserPhoneNumber();//获得手机号
                    u.setPhoneNumber(uphoneNumber);//设置手机号
                    list.add(u);//把该用户存到列表当中
                    System.out.println("注册成功");
                    break ;

                }
                case "3":{
                    //忘记密码
                    System.out.println("请输入用户名");
                    String username=sc.next();
                    boolean exist =UsernameExist(username,list);
                    if(!exist){
                        System.out.println("用户名未注册，请先注册");
                        break;
                    }
                    System.out.println("请输入身份证号码");
                    String inputIDnumer=sc.next();
                    System.out.println("请输入手机号码");
                    String inputphoneNumber=sc.next();
                    boolean phone=PhoneNumberRight( inputphoneNumber, list, username);
                    boolean IDnumber=IDNumberRight(inputIDnumer, list, username);
                    if(phone&&IDnumber){
                        System.out.println("请输入要修改的密码");
                        String password=sc.next();
                        for(int i=0;i<list.size();i++){
                            User u1=list.get(i);
                            if(u1.getUsername().equals(username)){
                                u1.setPassword(password);
                            }
                            System.out.println("修改成功");
                            break;
                        }
                    }else{
                        System.out.println("账号信息不匹配，修改失败");
                        break;
                    }
                    break ;
                }
                case "4" :{
                    break loop;
                }
                default:{
                    System.out.println("输入错误，请重新输入");

                }
            }
        }
    }
    //实现注册功能
    //得到用户名
    public static String registerFuntion(ArrayList<User> list){
        Scanner sc=new Scanner(System.in);

            System.out.println("请输入您的用户名");
            String uname=sc.next();
            boolean existing=usernameContains(list,uname);//判断用户名是否存在
            boolean len=usernameLen(uname);
            boolean content=usernameContent( uname);
            if(existing){
                System.out.println("用户名已存在");
                return "0";
            }
            if(!len){
                System.out.println("用户名长度必须在3~15位之间");
                return "0";
            }
            if(!content){
                System.out.println("用户名不合法");
                return "0";
            }
        return uname;
    }
    //查找是否存在的功能，即用户名在list中是否存在
    public static boolean usernameContains(ArrayList<User> list,String uname){
        for(int i=0;i<list.size();i++){
            //创建一个新的学生类
            User u=list.get(i);
            String name=u.getUsername();
            if(name.equals(uname)){
                //遍历找到一个相同的，返回true
                return true;
            }
        }
        //遍历完了都还没有找到，返回false
        return false;
    }
    //判断用户名的长度是否符合要求
    public static boolean usernameLen(String uname){
        int len=uname.length();
        if(len>15||len<3){
            return false;
        }
        return true;
    }
    //判断用户名是否字母加数字的组合
    public static boolean usernameContent(String uname){
        boolean flag=false;
        boolean number=false;
        for(int i=0;i<uname.length();i++){
            char c=uname.charAt(i);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c<='9'&&c>='0')){
                flag=true;
            }
            //当有一个字符不合法时就返回
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                number=true;
            }
        }
        if(flag&&number){
            return true;
        }
        return false;
    }
    //让用户输入密码，看密码正不正确
    public static String getUserPassword(){
        Scanner sc=new Scanner(System.in);
        String password="";
        while(true){
            System.out.println("请输入密码");
            String password1=sc.next();
            System.out.println("请再次输入密码");
            String password2=sc.next();
            if(password1.equals(password2)){
                System.out.println("密码设置成功");
                password=password1;
                break;
            }else{
                System.out.println("前后两次密码不一样，请重新输入");
            }
        }
        return password;
    }
    //让用户输入手机号
    public static String getUserPhoneNumber(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入手机号码");
            String phoneNumber=sc.next();
            int len=phoneNumber.length();
            if(len!=11){
                System.out.println("手机号格式不正确，请重新输入");
                continue;
            }
            char first=phoneNumber.charAt(0);
            if(first=='0'){
                System.out.println("手机号格式不正确，请重新输入");
                continue;
            }
            boolean composition=phoneNumberComposition(phoneNumber);
            if(!composition){
                System.out.println("手机号格式不正确，请重新输入");
                continue;
            }
            if((composition)&&(first!='0')&&(len==11)){
                return phoneNumber;
            }
        }
    }
    //看一下用户的手机号码是不是全部都是数字
    public static boolean phoneNumberComposition(String phoneNumber){
        boolean flag=true;
        for(int i=0;i<phoneNumber.length();i++){
            if(phoneNumber.charAt(i)<'0'||phoneNumber.charAt(i)>'9'){
                flag=false;
            }
        }
        return flag;
    }
    //看一下用户输入的身份证号码是否正确
    public static String getUserIDnumber(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入您的身份证号码");
            String IDnumber=sc.next();
            int len=IDnumber.length();
            if(len!=18){
                System.out.println("身份证号码格式不正确，请重新输入");
                continue;
            }
            char first=IDnumber.charAt(0);
            if(first=='0'){
                System.out.println("身份证号码格式不正确，请重新输入");
                continue;
            }
            boolean composition=IDnumberComposition(IDnumber);
            if(!composition){
                System.out.println("身份证号码格式不正确，请重新输入");
                continue;
            }
            if((composition)&&(first!=0)&&(len==18)){
                return IDnumber;
            }
        }
    }
    //判断用户输入的身份证号码有没有非法字符
    public static boolean IDnumberComposition(String IDnumber){
        boolean head=true;
        for(int i=0;i<IDnumber.length()-1;i++){
            if(IDnumber.charAt(i)>'9'||IDnumber.charAt(i)<'0'){
                head=false;
            }
        }
        char lastChar=IDnumber.charAt(IDnumber.length()-1);
        boolean foot=false;
        if((lastChar=='x')||(lastChar=='X')||(lastChar>='0'&&lastChar<='9')){
            foot=true;
        }
        if(head&&foot){
            return true;
        }
        return false;
    }
    //定义一个方法,让用户输入用户名，然后再判断用户名是否存在
    public static boolean UsernameExist(String username,ArrayList<User> list){
        boolean flag=false;
            for(int i=0;i<list.size();i++){
                User u1=list.get(i);
                if(u1.getUsername().equals(username)){
                    flag=true;
                }
            }
        return flag;
    }
    //生成一个验证码
    public static String CreatCode(){
        Random r=new Random();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<4;i++){
            int number=r.nextInt(52);
            sb.append(SelectNumber(number));
        }
        int last=r.nextInt(10);
        sb.append(last);

        for(int i=0;i<5;i++){
            int index=r.nextInt(5);
            char c=sb.charAt(i);
            sb.setCharAt(i,c);
        }
        return sb.toString();
    }
    //创造一个数组，对应随机生成的数字
    public static char SelectNumber(int number){
        char[] letter=new char[52];
        for(int i=0;i<26;i++){
            letter[i]=(char)('a'+i);
        }
        for(int i=26;i<52;i++){
            letter[i]=(char)('A'+i-26);
        }
        return letter[number];
    }
    //判断用户输入的密码是否和该用户的密码一致
    public static boolean PasswordRight(String inputPassword,ArrayList<User> list,String username){

        for(int i=0;i<list.size();i++){
            User u1=list.get(i);
            if(u1.getUsername().equals(username)){
                String password=u1.getPassword();
                if(password.equals(inputPassword)){
                    return true;
                }
            }
        }
        return false;
    }
    //判断用户输入的身份证号码是否和该用户的密码一致
    public static boolean IDNumberRight(String inputIDnumber,ArrayList<User> list,String username){

        for(int i=0;i<list.size();i++){
            User u1=list.get(i);
            if(u1.getUsername().equals(username)){
                String IDnumber=u1.getIdNumber();
                if(IDnumber.equals(inputIDnumber)){
                    return true;
                }
            }
        }
        return false;
    }
    //判断用户输入的手机号码是否和该用户的手机号码一致
    public static boolean PhoneNumberRight(String inputphoneNumber,ArrayList<User> list,String username){

        for(int i=0;i<list.size();i++){
            User u1=list.get(i);
            if(u1.getUsername().equals(username)){
                String phoneNumber=u1.getPhoneNumber();
                if(phoneNumber.equals(inputphoneNumber)){
                    return true;
                }
            }
        }
        return false;
    }
}
