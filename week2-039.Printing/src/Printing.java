public class Printing {

    public static void printStars(int amount) {
        int stars = 0;
        while (stars < amount) {
            System.out.print("*");
            stars = stars + 1;
        }
        System.out.println("");

    }

    public static void printSquare(int sideSize) {
        int stars = 0;
        while (stars < sideSize) {
            printStars(sideSize);
            stars = stars + 1;
        }

    }

    public static void printRectangle(int width, int height) {
        int stars = 0;
        while (stars < height) {
            printStars(width);
            stars = stars + 1;
        }
    }

    public static void printTriangle(int size) {
        int stars = 1;
        while (stars <= size) {
            printStars(stars);
            stars = stars + 1;
        }
    }


    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
