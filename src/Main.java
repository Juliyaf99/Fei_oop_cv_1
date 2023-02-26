
public class Main {
    public static int cisla(int a,int b) {
        if (a > b) {
            return 1;
        }
        if (a < b) {
            return -1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = cisla(a,b);
        System.out.println("Hello world!\n");
        System.out.println(c);

    }
}