import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        String s="Jan Nowak 150 25,3";
        Scanner input=new Scanner(s);
        String s1 = input.next();
        String s2 = input.next();
        int a = input.nextInt();
        double b = input.nextDouble();
        System.out.printf("%s %s %.2f\n",s2,s1,a*b);
        input.close();
    }
}
