import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        String tab[] = {"pon", "wt", "sr", "czw", "pt", "sob", "nied"};
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        int m = input.nextInt();
        int y = input.nextInt();
        int z = 0, c = 0;
        if (m == 1 || m == 2) {
            z = y - 1;
            c = 0;
        } else {
            z = y;
            c = 2;
        }
        int dt = ((23 * (m / 9)) + d + 4 + y + (z / 4) - (z / 100) + (z / 400) - c) % 7;
        System.out.println(tab[dt-1]);
    }
}
