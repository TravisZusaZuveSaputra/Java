package Semester_1.Pertemuan_4;

public class Exercise01 {
    public static void main(String[] args) {
        for (int i = 10; i <= 10; i--) {
            if (i > 1) {
                System.out.println(i + " bottles pf beer on the wall, " + i + " bottles of beer");
                System.out.println("Take one down, pass it around, " + (i - 1) + " bottles of beer on the wall");
                System.out.println();
            }
            else if (i == 1) {
                System.out.println(i + " bottles pf beer on the wall, " + i + " bottles of beer");
                System.out.println("Take one down, pass it around, " + (i - 1) + " bottles of beer on the wall");
            }
        }
    }
}
