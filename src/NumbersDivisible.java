
public class NumbersDivisible {
    public static void main(String[] args) {


        int j = 0;
        int number = 100;
        while (number < 1001) {
            if (number % 6 == 0 || number % 5 == 0) {
                System.out.println(number + ", ");
                number++;
                j++;
            }
            if (j % 10 == 0 && j != 0) {
                System.out.println();
                j++;
            } else {
                number++;
            }
        }
    }
}
