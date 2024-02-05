import java.util.Scanner;

/*
 * Barney the dog has his happiness determined by the amount of treats he gets
 * His happiness meter can be determined by the formula: 1 * S + 2 * M + 3 * L
 * The first line of input is for S, second line of input is for M, third line of input is for L
 * If the equation is equal or higher to 10, then Barney is happy and will output "happy", else the program will output "sad"
 */

public class j1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        int l = Integer.parseInt(sc.nextLine());

        if (1 * s + 2 * m + 3 * l >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }

        sc.close();
    }
}