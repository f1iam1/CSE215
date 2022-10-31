public class MethodOverloadingSummation {
    public static void main(String[] args) {
        System.out.println("2 int sum = " + sum(5, 5));
        System.out.println("3 int sum = " + sum(5, 5, 5));
        System.out.println("5 int sum = " + sum(5, 5, 5, 5, 5));
        System.out.println("2 int 2 double sum = " + sum(5, 5, 5.1, 5.1));
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return sum(num1, num2) + num3;
    }

    public static int sum(int num1, int num2, int num3, int num4, int num5) {
        return sum(num1, num2) + sum(num3, num4) + num5;
    }

    public static double sum(int num1, int num2, double num3, double num4) {
        return sum(num1, num2) + num3 + num4;
    }
}
