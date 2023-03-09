import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj temperature w stopniach celsjusza: ");
        double ctemp = input.nextDouble();
        double ftemp = ctemp * 1.8 + 32;
        System.out.println("Temperatura C:" + ctemp);
        System.out.printf("Temperatura F = %1.1f",ftemp);
        input.close();
    }
}
