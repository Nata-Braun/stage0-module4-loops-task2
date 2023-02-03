package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 2;
        int divider = 2;

        while (number <= printToInclusive) {
            divider = 2;
            while (divider <= number) {// перебор делителей от 2 до корня числа
                if (number % divider != 0) { // если число не делится без остатка
                    divider++;
                } else {
                    if (divider == number) {
                        System.out.println(number);
                    }

                    break;
                }
            }

            number++;
        }
    }
}

