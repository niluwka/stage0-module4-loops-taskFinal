package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1 ; i <= cathetusLength; i++) {
            for (int m = 1; m <= cathetusLength - i ;m++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1 ; k--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
