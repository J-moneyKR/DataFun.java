// Jack Fryer
// Friday, November 15, 2024
// This program's function is to serve as a demonstration of my skills related to java if else and switch statements
// Along with the ability to think logically.
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Give me your favoirte integer and it has to be a int ");
        Scanner scanaylize = new Scanner(System.in);
        Integer favint = scanaylize.nextInt();
        if (favint >= 0){
            System.out.println("The number is postive or zero");

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
            System.out.println("This number is too small");
        }
        //This part got looked on the internet tye shi
        if (favint % 2 == 0 ){
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
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
                System.out.println("This number is NOT a noble gas");
        }
                Scanner scanaylized = new Scanner(System.in);
                System.out.println("You got to give me your favorite character");
            char charactrer = scanaylized.next().charAt(0);
            if (Character.isUpperCase(charactrer)) { // from interner is uppercase
                System.out.println("This number is a uppercase letter");
            }
            else if (Character.isLowerCase(charactrer)) { //from internet is lowercase
                System.out.println("This is a lowercase letter");
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
            int valueUpper = valueofChar - 64;
                int valueLower = valueofChar - 96;
            System.out.println("The ascii and or unicode value is " + valueofChar);
            if ((valueofChar >= 65 && valueofChar <= 90) || (valueofChar >= 97 && valueofChar <= 122)){
                if (valueofChar >= 64 && valueofChar <= 90)
                    if (valueLower == 1){
                        System.out.print("It is the " + valueUpper + "st letter of the alphabet");
                    }else if (valueLower == 2){
                        System.out.print("It is the " + valueUpper +"nd letter of the alphabet");
                    }else if (valueLower == 3){
                        System.out.print("It is the " + valueUpper +"rd letter of the alphabet");
                    }else{
                        System.out.print("It is the " + valueUpper + "th letter of the alphabet");
                    }    
                if (valueofChar >= 96 && valueofChar <= 122)
                    if (valueLower == 1){
                        System.out.print("It is the " + valueLower + "st letter of the alphabet");
                    }else if (valueLower == 2){
                        System.out.print("It is the " + valueLower +"nd letter of the alphabet");
                    }else if (valueLower == 3){
                        System.out.print("It is the " + valueLower +"rd letter of the alphabet");
                    }else{
                        System.out.print("It is the " + valueLower + "th letter of the alphabet");
                    }        
                        
                
                

            } else {
                System.out.println("This is not a letter in the english alphabet");

            }

    }
