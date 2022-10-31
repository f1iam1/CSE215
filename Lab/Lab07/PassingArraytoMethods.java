public class PassingArraytoMethods {
    public static void main(String[] args) {
        int[] myarray = { 1, 2 };
        System.out.println("array is " + myarray[0] + " , " + myarray[1]);

        swap(myarray[0], myarray[1]);
        System.out.println("array is " + myarray[0] + " , " + myarray[1]);

        swapArrayElement(myarray);
        System.out.println("array is " + myarray[0] + " , " + myarray[1]);
    }

    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("values during method excecution => num1: " + num1 + ", num2: " + num2);
    }

    public static void swapArrayElement(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}