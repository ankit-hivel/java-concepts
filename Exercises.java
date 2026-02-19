import static java.lang.Math.min;

public class Exercises {
    static long factorial(int num){
        if (num == 1) return 1;
        return num * factorial(num - 1);
    }

    static int getLastDigit(int num){
        return num % 10;
    }

    static long calculateLCM(int num1, int num2) {
        long lcm = 1;
        while(num1 > 1 && num2 > 1){
            for(int i = 2; i <= min(num1,num2); i++){
                if (num1 % i == 0 && num2 % i == 0){
                    lcm = lcm * i;
                    num1 = num1 / i;
                    num2 = num2 / i;
                    break;
                } else if (num1 % i == 0) {
                    lcm = lcm * i;
                    num1 = num1 / i;
                    break;
                } else if (num2 % i == 0) {
                    lcm = lcm * i;
                    num2 = num2 / i;
                    break;
                }
            }
        }
        while (num1 > 1){
            for (int i = 2; i <= num1; i++){
                if (num1 % i == 0){
                    lcm = lcm * i;
                    num1 = num1 / i;
                    break;
                }
            }
        }
        while (num2 > 1){
            for (int i = 2; i <= num2; i++){
                if (num2 % i == 0){
                    lcm = lcm * i;
                    num2 = num2 / i;
                    break;
                }
            }
        }
        return lcm;
    }

    public static void main(String[] args) {
        int n = 5;
        // factorial of a number
        System.out.printf("Factorial of %d is %d\n", n, factorial(n));
        // last digit of a number
        n = 23527;
        System.out.printf("Last digit of %d is %d\n", n, getLastDigit(n));

        // LCM of a number
        int num1 = 23;
        int num2 = 41;
        System.out.printf("LCM of %d & %d is %d\n", num1, num2, calculateLCM(num1, num2));
    }
}
