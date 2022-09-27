package Semester_1.Pertemuan_5.Strings;

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = console.next();
        process(name);
    }
    public static void process(String name) {
        if (name.equals("Whitaker")) {
            System.out.println("You must e really awesome.");
        }
        name = name.replace("a", "e");
        name = name.toUpperCase();
        name = name.substring(0, 3);
        System.out.println(name + " has " + name.length() + " letters");
    }
}
