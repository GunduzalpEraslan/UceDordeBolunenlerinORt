import java.util.Scanner;

public class ucedordeebolunenler {
    public static void main(String[] args) {
        int number, n = 0;
        double total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("enter a number : ");
        number = input.nextInt();

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i% 4 == 0) {
                System.out.println(i);
                total += i;
                n++;
            }
        }
        System.out.println("Average of numbers : " + total / n);
    }
}