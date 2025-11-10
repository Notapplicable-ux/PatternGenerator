//Name: Anand Raj
//Date: 10/30/2025
//This programs draws shapes using loops

public class Generator {
    public static void stars(int rows) {
        String star = "*";
        while (rows > 0) {
            System.out.print(star);
            rows--;
            System.out.println("");
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
        // for loop
        int counts = start;
        int num = start;
        for (int i = start; i > 0; i--) {
            counts = num;
            if (i % 2 == 1) {
                do {
                    System.out.print(i);
                    counts--;
                } while (counts > 0);
                System.out.println("");
            }
            num--;
        }
    }

    
    
    public static void main(String[]args) {
        stars(7);
        //triangle(9);
        //odds(9);
        //eo(5);
        //pyramid(5);
        }
    }
