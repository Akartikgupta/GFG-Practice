public class CounT_digit {
    public static void main(String[] args) {
        int number = 3564;
        int count = 0;
        while (number > 0) {
            int last = number % 10;
            number = number / 10;
            count++;
        }
        System.out.println(count);
    }
}