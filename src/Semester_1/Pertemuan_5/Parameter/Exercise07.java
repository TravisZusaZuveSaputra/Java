package Semester_1.Pertemuan_5.Parameter;

public class Exercise07 {
    public static void main(String[] args) {
        printSquare(3, 6);
    }

    public static void printSquare (int min, int max) {
        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }

            for (int j = 0; j < i - min; j++) {
                System.out.print(min + j);
            }
            System.out.println();
        }
    }
}
