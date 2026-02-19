public class TableUsingMethod {
    static void printTable(int num){
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", num, i, num * i);
        }
    }

    public static void main(String[] args) {
        int num = 13;
        printTable(num);
    }
}
