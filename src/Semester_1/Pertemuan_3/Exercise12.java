package Semester_1.Pertemuan_3;

public class Exercise12 {
    public static void main(String[] args) {
        
        int a = 1;
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print("-");
            }
            for (int j = 0; j <= a; j++) {
                System.out.print(a);
            }

            a += 2;

            for (int j = 0; j <= 5 - i; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
