package Exercise.hsp;

public class ChongZai {
    public static void main(String[] args){
        System.out.println(showScore("张三",103,92,108));
    }
    public static String showScore(String name,double...scores){
        double totalScore=0;
        for(int i=0;i<scores.length;i++){
            totalScore+=scores[i];
        }
        return name+"成绩为"+totalScore;
    }
}
