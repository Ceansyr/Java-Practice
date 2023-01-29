public class forLoop {
    public static void main(String[] args) {
        for (double counter = 7.5; counter <= 10; counter += 0.25){
            calcInterest(counter);
        }
    }

    public static double calcInterest (double interestRate){
        double interest = (interestRate * 1);
        System.out.println("Interest on $100 with interest rate of " + interestRate + "% is $" + interest );
        return 0;
    }

}
