package practice;
import java.util.Scanner;
public class test941 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int V=sc.nextInt();
        int[] value=new int[N];
        int[] volume=new int[N];
        for(int i=0;i<N;i++){
            value[i]=sc.nextInt();
            volume[i]=sc.nextInt();
        }
        int bagValue=0;
        int bagVolume=0;
        double[] proportion=new double[N];
        for(int i=0;i<N;i++){
            proportion[i]=(double)value[i]/volume[i];
        }
        for(int i=0;i<N-1;i++){
            for(int j=0;j<N-1-i;j++){
                if(proportion[j]>proportion[j+1]){
                    double tmp=proportion[j];
                    proportion[j]=proportion[j+1];
                    proportion[j+1]=tmp;
                }
            }
        }

    }
}

