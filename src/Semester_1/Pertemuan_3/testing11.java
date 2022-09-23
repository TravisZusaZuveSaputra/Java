package Semester_1.Pertemuan_3;

public class testing11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 0; j < 2 * i - 2; j++) {
                System.out.print("\\");
            }
            for (int j = 0; j < -4 * i + (4 * 7 + 2); j++) {
                System.out.print("!");
            }
            for (int j = 0; j < 2 * i - 2; j++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
