package numberinfo;

public class NumberApp {
    public static void main(String[] args) {

        Number number1 = new Number(21);
        Number number2 = new Number(-14);

        ShowNumberDetails numberDetails = new ShowNumberDetails();

        numberDetails.showNumberInfo(number1);
        System.out.println();
        numberDetails.showNumberInfo(number2);
    }
}