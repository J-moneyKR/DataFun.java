import java.util.Arrays;
import java.util.List;
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
        switch (favint) {
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
                Scanner scanaylized = new Scanner(System.in);
                System.out.println("You got to give me your favroite character");
            char charactrer = scanaylized.next().charAt(0);
            if (Character.isUpperCase(charactrer)) { // from interner is uppercase
                System.out.println("This number is a uppercase character");
            }
            else if (Character.isLowerCase(charactrer)) { //from internet is lowercase
                System.out.println("This is a lowercase number");
            }
            //is digit was looked up on the interent
            else if (Character.isDigit(charactrer)) {
                System.out.println("This is a number ");
            }
            else{
                System.out.println("This is not a letter or a number from the english language");
                }
            // I used the internet to look up how to make a list in java
        List<Character> vowellist = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U', 'y', 'Y');
            //looked up the .containes thing from the internet
            if (vowellist.contains(charactrer)){
                System.out.println("This is a vowel");
            } else {
                System.out.println("This is not a vowel");
            }
            //This part was looked up form the internet by casting it
            int valueofChar = (int) charactrer;
            System.out.println("The ascii and or unicode value which is from the int of all of coding is " + valueofChar);
            if ((valueofChar >= 65 && valueofChar <= 90) || (valueofChar >= 97 && valueofChar <= 122)){
                int value = (int) charactrer;
                // switch statment with logic for each one inside
            } else {
                System.out.println("This is not a letter in the english alphabet");

            }

    }
    }