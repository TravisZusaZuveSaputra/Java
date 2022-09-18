package Semester_1.Pertemuan_2;

public class testing7 {
    public static void main(String[] args) {
        top();
        break1();
        mid();
        break1();
        bottom();
    }
    public static void top() {
        fstars();
        nstars();
        tstars();
    }
    public static void mid() {
        top();
        pstars();
        tstars();
        top();
    }
    public static void bottom() {
        top();
        fstars();
        pstars();
        pstars();
        fstars();
        fstars();
    }
    public static void fstars() {
        System.out.println("    *****    ");
    }
    public static void nstars() {
        System.out.println("  *********  ");
    }
    public static void tstars() {
        System.out.println("*************");
    }
    public static void pstars() {
        System.out.println("* | | | | | *");
    }
    public static void break1() {
        System.out.println();
    }
}
