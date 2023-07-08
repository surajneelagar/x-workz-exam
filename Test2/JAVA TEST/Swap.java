public class Swap {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("a = " + num1 + " \n"+"B = " + num2);

    }
}
