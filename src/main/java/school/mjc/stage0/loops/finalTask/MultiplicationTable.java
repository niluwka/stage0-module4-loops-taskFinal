package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for (int i = 1; i <= 10; i++) {
           int x = i * numberTableToPrint;
           System.out.println(i + " x " + numberTableToPrint + " = " + x);
        }
    }
}
