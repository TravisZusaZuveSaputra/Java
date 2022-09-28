package Semester_1.Pertemuan_5.Scanner;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("low? ");
        int low = console.nextInt();
        
        System.out.print("high? ");
        int high = console.nextInt();
        
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
