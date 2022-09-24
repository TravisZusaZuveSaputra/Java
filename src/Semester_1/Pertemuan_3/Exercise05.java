package Semester_1.Pertemuan_3;

public class Exercise05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; ++i) {
            for (int j = 1; j <= (i * 2 + (i + 5)); ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
