package string;

import java.sql.SQLOutput;
import java.util.zip.DeflaterOutputStream;

public class stringDemo1 {
   public static void main(String[] args) {
       String s1="abc";
       String s2=new String();
       String s3=new String("我要月薪过万");
       char[] ch={'a','b','c','d'};
       String s4=new String(ch);
       byte[] by={97,98,99,100};
       String s5=new String(by);
       boolean res1=s1.equals(s3);
       boolean res2=s2.equalsIgnoreCase(s3);
   }
}
