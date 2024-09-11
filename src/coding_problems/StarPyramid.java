package coding_problems;

public class StarPyramid {

    public static void main(String[] args) {
        printStarRightAngle(5);
        printStarTriangle(5);
    }

    public static void printStarRightAngle(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printStarTriangle(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = row - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i * 2 - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
