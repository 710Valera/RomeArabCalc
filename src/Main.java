// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(calc(input));;
    }

    public static String calc(String input) {
        boolean isRome;
        int x;
        int y;
        int result = 0;
        String[] stroke = input.split("[+/*-]");

        if (isValidRome(stroke[0]) && isValidRome(stroke[1])) {
            isRome = true;
            x = romeToArab(stroke[0]);
            y = romeToArab(stroke[1]);}
        else if (isValidArab(stroke[0]) && isValidArab(stroke[1])) {
            isRome = false;
            x = Integer.parseInt(stroke[0]);
            y = Integer.parseInt(stroke[1]); }
        else throw new RuntimeException();

        if(input.contains("+")){
            result = x+y;
        }
        else if(input.contains("-")){
            result = x-y;
        }
        else if(input.contains("*")){
            result = x*y;
        }
        else if(input.contains("/")){
            result = x/y;
        }
        return isRome ? arabToRome(result) : Integer.toString(result);
    }
    public static boolean isValidArab(String s){
        return s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || s.equals("6") ||
                s.equals("7") || s.equals("8") || s.equals("9") || s.equals("10") ? true : false ;
    }
    public static boolean isValidRome(String s){
        return s.equals("I") || s.equals("II") || s.equals("III") || s.equals("IV") || s.equals("V") || s.equals("VI") ||
                s.equals("VII") || s.equals("VIII") || s.equals("IX") || s.equals("X") ? true : false ;
    }
    public static String arabToRome(int i){
        return romeNumber[i-1];}
    public static int romeToArab(String number){
        for(int i=0; i<100; i++){
            if(number.equals(romeNumber[i])){
                return i+1;}
        }
        return -1;}
    public static String[] romeNumber = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "IL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
}

