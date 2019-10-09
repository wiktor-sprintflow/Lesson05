package numberinfo;

class ShowNumberDetails {

    private Number number = new Number();

    void showNumberInfo(double value) {

        System.out.println("Liczba " + value+ " jest: \n" +
                number.isEvenOrOdd(value) + "\n" +
                number.isPositiveOrNegative(value) + "\n" +
                number.numberCheck(value));
    }
}
