public class CharClass {
    static void classify(char ch){
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("it's a lowercase character");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("it's a UPPERCASE character");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("it's a digit");
        }else{
            System.out.println("invalid character");
        }
    }

    public static void main(String[] args) {
        System.out.println("checking 4");
        classify('4');
        System.out.println("checking g");
        classify('g');
        System.out.println("checking K");
        classify('K');
        System.out.println("checking Z");
        classify('Z');
        System.out.println("checking 0");
        classify('0');
    }
}
