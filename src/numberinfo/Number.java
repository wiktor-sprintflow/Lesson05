package numberinfo;

class Number {
    private double number;

    Number(double number) {
        this.number = number;
    }

    double getNumber() {
        return number;
    }

    String isPositiveOrNegative() {
        if (number > 0) {
            return ("Dodatnia");
        } else if (number < 0) {
            return ("Ujemna");
        } else return ("Jest zerem");
    }

    String isEvenOrOdd() {
        if (number % 2 == 0) {
            return "Parzysta";
        } else {
            return "Nieparzysta";
        }
    }

    String numberCheck() {
        if (number * 6 % 9 == 0) {
            return (number * 6 + " jest podzielna przez 6");
        } else {
            if (Math.pow(number, 2) < 100) {
                return (Math.pow(number, 2) + " jest mniejsza od 100");
            } else {
                return (Math.pow(number, 2) + " nie jest mniejsza od 100");
            }
        }
    }
}