package Semester_1.Pertemuan_5.Scanner;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.println("University admission program");
        
        System.out.print("What is your GPA? ");
        double GPA = console.nextDouble();
        
        System.out.print("What is your SAT score? ");
        int SAT = console.nextInt();
        
        if(GPA < 1.8) {
            System.out.println("Your GPA is too low.");
        } 
        else if (SAT < 900) {
            System.out.println("Your SAT is too low.");
        }
        else {
            System.out.println("You were Accepted!");
        }
    }
}
