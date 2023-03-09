import java.io.File;//plik
import java.io.IOException;//wyjątki
import java.util.Scanner;


public class Zad10 {
    public static void main(String[] args) throws IOException {
        File f = new File("dane.txt");
        Scanner input = new Scanner(f);
        String s1 = "", s2 = "";
        int a = 0;
        double b = 0.0;
        while (input.hasNext()) {
            s1 = input.next();
            s2 = input.next();
            a = input.nextInt();
            b = input.nextDouble();
        }
        System.out.printf("%s %s %.2f\n", s2, s1, a * b);
        input.close();
    }
}
