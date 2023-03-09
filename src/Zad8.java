import java.util.Scanner;
import static java.lang.Math.*;

public class Zad8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj Przyprostokątne a i b");
        System.out.println("a: ");
        double a = input.nextDouble();
        System.out.println("b: ");
        double b = input.nextDouble();
        double c = sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("Przeciwprostokatna wynosi:  = %1.3f",c);
        input.close();
    }
}
