package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1 ; i <= cathetusLength; i++) {
            for (int m = 1; m <= cathetusLength - i ;m++) {
                    System.out.print(" ");
            }
            for (int k = i; k >= 1 ; k--) {
                System.out.print( k);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print( j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
