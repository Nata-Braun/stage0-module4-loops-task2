package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 1;
        int result = 1;
        System.out.println(1);
        while (counter<=printToInclusive){
            result=result*counter;
            System.out.println(result);
            counter++;
        }
    }
}
