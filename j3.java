import java.util.Scanner;

/* 
 * First input determines the number of drops of paint on the canvas (the number of inputs)
 * Next inputs are the coordinates of the drops of paint
 * Outputs the coordinates of the bottom left and top right coordinates that make the smallest frame that contain all of the paint droplets
 */

public class j3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // variables
        String temp = "";
        int val = 0;

        int xMax = 0;
        int xMin = 100;
        int yMax = 0;
        int yMin = 100;

        // input
        // number of inputs
        int paintNum = Integer.parseInt(sc.nextLine());

        // paint droplet coordinates
        for (int i = 0; i < paintNum; i++) {
            String coord = sc.nextLine();
            char[] charArray = coord.toCharArray();

            // getting number for comparing x vals
            for (char ch : charArray) {
                if (ch != ',') {
                    temp += ch; // adding the digits into a string until the space character
                } else {
                    val = Integer.parseInt(temp);
                    if (xMax < val) {
                        xMax = val;
                    } else if (xMin > val) {
                        xMin = val;
                    }
                    break;
                }
            }

            // getting number for comparing y vals
            if (coord.length() == 5) { // both x and y values are double digit
                temp = Character.toString(charArray[3]) + Character.toString(charArray[4]);
                val = Integer.parseInt(temp);
                if (yMax < val) {
                    yMax = val;
                } else if (yMin > val) {
                    yMin = val;
                }
            } else if (coord.length() == 4) { // one of either x or y values is a single digit and the other is a double digit
                if (val >= 10) { // this means that x is a double digit therefore y is a single digit
                    temp = Character.toString(charArray[3]);
                    val = Integer.parseInt(temp);
                    if (yMax < val) {
                        yMax = val;
                    } else if (yMin > val) {
                        yMin = val;
                    } 
                } else { // this means that x is a single digit therefore y is a double digit
                    temp = Character.toString(charArray[2]) + Character.toString(charArray[3]);
                    val = Integer.parseInt(temp);
                    if (yMax < val) {
                        yMax = val;
                    } else if (yMin > val) {
                        yMin = val;
                    } 
                }
                
            } else { // both x and y values are single digit
                temp = Character.toString(charArray[2]);
                val = Integer.parseInt(temp);
                if (yMax < val) {
                    yMax = val;
                } else if (yMin > val) {
                    yMin = val;
                }
            }

            // resetting variables
            temp = "";
        }

        System.out.println((xMin - 1) + "," + (yMin - 1));
        System.out.println((xMax + 1) + "," + (yMax + 1));
        sc.close();
    }
}
