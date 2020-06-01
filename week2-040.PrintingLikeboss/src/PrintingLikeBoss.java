public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int stars = 1;
        while (stars <= amount) {
            System.out.print("*");
            stars++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int stars = 1;
        while (stars <= amount) {
            System.out.print(" ");
            stars++;
        }
    }

    public static void printTriangle(int size) {
        int stars = 1;
        while (stars <= size) {
            printWhitespaces(size-stars);
            printStars(stars);
            stars++;
        }
    }

    public static void xmasTree(int height) {
        int stars = 1;
        int stand = 0;
        int whiteSpaces = height - 2;
        while (stars <= height) {
            printWhitespaces(height - stars);
            printStars(stars + (stars - 1));
            stars++;
        }
        while (stand < stand+1) {
            printWhitespaces(whiteSpaces);
            printStars(3);
            stand++;
            if (stand == 2) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}