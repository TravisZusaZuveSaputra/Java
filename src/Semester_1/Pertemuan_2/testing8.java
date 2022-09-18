package Semester_1.Pertemuan_2;

public class testing8 {
    public static void main(String[] args) {
        s_egg();
        break1();
        p_egg();
        break1();
        p1_egg();
        break1();
    }
    public static void s_egg() {
        top();
        bot();
    }
    public static void p_egg() {
        top();
        bot();
        line();
    }
    public static void p1_egg() {
        top();
        line1();
        bot();
        line();
    }
    public static void top() {
        System.out.println("  ______  ");
        System.out.println(" /      \\");
        System.err.println("/        \\");
    }
    public static void bot() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }
    public static void line1() {
        System.out.println("|  STOP  |");
    }
    public static void line() {
        System.out.println("+--------+");
    }
    public static void break1() {
        System.out.println();
    }
}
