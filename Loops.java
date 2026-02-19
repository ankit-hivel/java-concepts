public class Loops {
    public static void main(String[] args) {
        // sum of n numbers
        int n = 123;
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum += i;
        }
        System.out.printf("Sum upto %d is %d", n, sum);
    }
}
