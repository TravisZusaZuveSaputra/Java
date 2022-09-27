package Semester_1.Pertemuan_4;

public class Exercise02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; ++i) {
            for (int stars = 1; stars <= -2 * i + 9; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
