package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 1;
        int result = 1;
        if (power < 0) {
            System.out.println("too much power");
        } else if (power == 0) {
            System.out.println(1);
        } else {
            System.out.println(1);
            while (counter <= power) {
                result = result * 2;
                System.out.println(result);
                counter++;
            }
        }
    }
}
