package week2;

public class RollingDie {
    public static void main(String[] args) {
        int roll = (int)Math.ceil(Math.random()*8);

        switch(roll){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            case 5,6:
                System.out.println(5);
                break;
            case 7,8:
                System.out.println(6);
                break;
            default:
                break;
        }
    }
}
