package Semester_1.Pertemuan_5.Strings;

import java.util.*;

public class Exercise3 {
    public static Scanner user_input;
    public static void main(String[] args) {
        user_input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        System.out.println(format(user_input.nextLine()));
    }
    public static String format(String input) {
        String fn, ln;
        fn = input.substring(0, 1).toUpperCase();
        ln = input.substring(input.indexOf(" ") + 1, input.length());
        return ln + ", " + fn + ".";
    }
}