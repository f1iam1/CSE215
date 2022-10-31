public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("1 int max: " + findMax(10, 20));
        System.out.println("1 int 1 double max: " + findMax(20, 55.3));
        System.out.println("2 double max: " + findMax(33.3, 6.34));
        System.out.println("3 double max: " + findMax(33.3, 6.34, 40.2));
    }

    public static int findMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }

        else {
            return num2;
        }
    }

    public static double findMax(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        }

        else {
            return num2;
        }
    }

    public static double findMax(double num1, double num2, double num3) {
        // if (num1 > num2 && num1 > num3) {
        // return num1;
        // } else if (num3 > num2 && num1 < num3) {
        // return num3;
        // } else {
        // return num2;
        // }

        return findMax(findMax(num1, num2), num3);
    }
}
