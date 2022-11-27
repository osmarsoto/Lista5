import java.util.Scanner;

public class List5ex1 {
    public static void main(String[] args) {

        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (x = 1; x <= n; x++) {
            for (y = 0; y < x; y++) {
                System.out.print("  ");
                System.out.print(y);
            }
            System.out.println();
        }
    }
}