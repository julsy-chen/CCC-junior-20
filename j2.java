import java.util.Scanner;

/*
 * Inputs: P(a number of people), N(number of people that had the disease on day 0), R(number of people infected each day)
 * Calculates the number of people that are infected everyday until..
 * Outputs the day that the number of people infected is larger than P
 */

public class j2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        int r = Integer.parseInt(sc.nextLine());

        int counter = 0;
        int infected = 0;

        while (infected < p) {
            counter++;
            infected = infected + n * r;
            n = n * r;
        }

        System.out.println(counter);

        sc.close();
    }
}