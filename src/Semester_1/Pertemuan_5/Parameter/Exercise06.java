package Semester_1.Pertemuan_5.Parameter;

public class Exercise06 {
    public static void main(String[] args) {
        printGrid(4, 6);
    }
    
    public static void printGrid(int baris, int kolom) {
        for (int i = 1; i <= baris; i++) {
            int num = i;
            System.out.print(i);
            
            for (int j = 1; j < kolom; j++) {
                num += baris;
                System.out.print(" " + num);
            }
            System.out.println();
        }
    }
}
