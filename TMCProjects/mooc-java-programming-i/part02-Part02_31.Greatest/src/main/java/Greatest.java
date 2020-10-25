
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int num = number1;
        if (num < number2) {
            num = number2;
        }
        if (num < number3) {
            num = number3;
        }
        return num;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
