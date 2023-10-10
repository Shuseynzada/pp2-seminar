package week4.ex5;

public class Main {
    public static void main(String[] args) {
        int roll1 = (int)Math.ceil(Math.random()*12);
        int point;
        System.out.println(roll1);
        if(roll1 == 7 || roll1 == 11) System.out.println("Win");
        else if(roll1 == 2 || roll1 == 3 || roll1 == 12) System.out.println("Lose");
        else{
            while(roll1 != 7){
                point = roll1;
                roll1 = (int)Math.ceil(Math.random()*12);
                System.out.println(roll1);
                if(roll1 == point){
                    System.out.println("Win");
                    break;
                }
                if(roll1 == 7) System.out.println("seven out");
            }
        }
    }   
}
