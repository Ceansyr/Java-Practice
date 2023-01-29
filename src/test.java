public class test {
    public static void main(String[] args) {
        checkNumber(12);
        toMilesPerHour(75.114d);
        printConversion(1.5);
    }
    //int number = 12;
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static void toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("-1");
        } else {
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            System.out.println(milesPerHour);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + "km/h=" + milesPerHour + "mi/hr");
        }
    }
}
