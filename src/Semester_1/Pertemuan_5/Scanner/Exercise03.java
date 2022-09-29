package Semester_1.Pertemuan_5.Scanner;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        String terpanjang = "";
        boolean seri = false;

        System.out.print("How many people? ");
        int orang = user_input.nextInt();

        for (int i = 1; i <= orang; i++) {
            System.out.print("name #" + i + "? ");
            String sekarang = user_input.next();

            if(sekarang.length() == terpanjang.length()) {
                seri = true;
            } 
            if (sekarang.length() > terpanjang.length()) {
                seri = false;
                terpanjang = sekarang;
            }
        }
        String all = terpanjang.substring(0, 1).toUpperCase() + terpanjang.substring(1).toLowerCase();
        System.out.println(all + "'s name is longest");

        if (seri) {
            System.out.println("There was a tie!");
        }
    }
}
