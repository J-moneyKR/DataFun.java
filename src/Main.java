import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Give me your favoirte integer and it has to be a int ");
        Scanner scanaylize = new Scanner(System.in);
        Integer favint = scanaylize.nextInt();
        if (favint >= 0){
            System.out.println("The number is postive or cero");

        } else {
            System.out.println("This intger is negative ");
        }
        if (favint > 1000 ){
            System.out.println("This number is bigger than 1000");
        } else if (favint > 100) {
            System.out.println("This number is bigger than 100");
        } else if (favint > 10) {
            System.out.println("This number is bigger than 10");
        } else {
            System.out.println("This number is too small tye shi ");
        }
        //This part got looked on the internet tye shi
        if (favint % 2 == 0 ){
            System.out.println("This number even tye shi");
        } else {
            System.out.println("This number odd tye shi");
        }
        // Most of this is not my own work and I had to use a torutiral to find out what a swithc is
        switch (favint){
            case 10:
                System.out.println("This number is a neon");
                break;
            case 2:
                System.out.println("This number is a helium");
                break;
            case 18:
                System.out.println("This number is a argon");
                break;
            case 36:
                System.out.println("This number is a Kryponite ");
                break;
            case 54:
                System.out.println("This number is a Xenon ");
                break;
            case 86:
                System.out.println("This number is a radon ");
                break;
            default:
                System.out.println("This number is NOT a noble gas tye shi");
        }


    }
}