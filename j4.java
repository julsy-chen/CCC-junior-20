import java.util.Scanner;

/*
 * Inputs: T (the text that may or may not contain a cyclic shift of S), S (a string)
 * Outputs yes if T does contain a cyclic shift of S
 * else, the program will output no if T doesn't contain a cyclic shift of S
 */

public class j4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        char temp = ' ';
        boolean exists = false;

        String T = sc.nextLine();
        char[] check = T.toCharArray();
        String S = sc.nextLine();
        char[] variations = S.toCharArray();

        char[] phrase = new char[S.length()];

        // processing
        for (char ch : check) { // creating the phrases in T
            temp = phrase[0];
            for (int i = 0; i < phrase.length - 1; i++) {
                phrase[i] = phrase[i + 1];
            }
            phrase[phrase.length - 1] = ch;

            String phraseString = new String(phrase);

            if (phrase[0] != ) {
                for (int i = 1; i < variations.length; i++) { // creates the cyclic shifts
                    temp = variations[0];
                    for (int j = 0; j < variations.length - 1; j++) {
                        variations[j] = variations[j + 1];
                    }
                    variations[variations.length - 1] = temp; // for the last letter
                    
                    // convert to string
                    String shift = new String(variations);
                    
                    // test if the two strings are equivalent to each other
                    if (phraseString == shift) {
                        exists = true;
                        break;
                    }
                }
            }
        }

        // output
        if (exists == true) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        sc.close();
    }
}
