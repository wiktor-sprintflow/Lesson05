package numberinfo;

public class NumberApp {
    public static void main(String[] args) {

        ShowNumberDetails showNumberDetails = new ShowNumberDetails();

        showNumberDetails.showNumberInfo(21);
        System.out.println();
        showNumberDetails.showNumberInfo(-14);
    }
}