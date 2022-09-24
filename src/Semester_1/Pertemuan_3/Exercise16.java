package Semester_1.Pertemuan_3;

public class Exercise16 {
    public static void main(String[] args) {
        int number = 42;
        for (int i = 2; i <= 1000; i++) {
            number = number * 37 % 103;
        }
        int number2 = number * number;
        System.out.println("results = " + number2);
    }
}
