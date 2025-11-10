//Name: Anand Raj
//Date: 10/30/2025
//This programs draws shapes using loops

public class Generator {
    public static void stars(int rows) {
        String star = "*";
        while (rows > 0) {
            System.out.println(star);
            rows--;
            System.out.println("*");
            star += "**";
        }
    }

    public static void triangle(int rows) {
        int num = 1;
        while (rows > 0) {
            int counts = num;
            do {
                System.out.print(num);
                counts--;
            } while (counts > 0);
            rows--;
            System.out.println("");
            num += 1;
        }
    }

    public static void odds(int start) {
        for (int i = start; i >= 1; i--) {
            if (i % 2 != 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print(i);
                }
                System.out.println(); 
            }
        }
    }

    public static void eo(int maxE) {

        char startChar = (maxE % 2 == 0) ? 'O' : 'E';
        for (int i = 1; i <= maxE; i++) {
            char currentChar = (i % 2 != 0) ? startChar : (startChar == 'O' ? 'E' : 'O');
            for (int j = 0; j < i; j++) {
                System.out.print(currentChar);
            }
            System.out.println();
        }
        
        for (int i = maxE - 1; i >= 1; i--) {
            char currentChar = (i % 2 != 0) ? startChar : (startChar == 'O' ? 'E' : 'O');
            for (int j = 0; j < i; j++) {
                System.out.print(currentChar);
            }
            System.out.println();
        }
    }

    public static void pyramid(int rows) {
        for (int i = 1; i <= rows; i++) { 
            int numToPrint = i;
            int numTimes = 2 * (rows - i) + 1; 

            for (int j = 0; j < numTimes; j++) {
                System.out.print(numToPrint);
            }
            System.out.println(); 
        }
    }
    public static void main() {
        
    }
}

