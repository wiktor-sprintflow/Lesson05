package numberinfo;

class ShowNumberDetails {

    void showNumberInfo(Number number) {
        System.out.println("Liczba " + number.getNumber() + " jest: \n" +
                number.isEvenOrOdd() + "\n" +
                number.isPositiveOrNegative() + "\n" +
                number.numberCheck());
    }
}
