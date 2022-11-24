import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (x = 1; x <= n; x++) {
            for (y = 0; y < x; y++) {
                System.out.print("  ");
                System.out.print(x);
            }
            System.out.println();
        }
    }
}