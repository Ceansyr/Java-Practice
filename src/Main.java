public class Main {
    public static void main(String[] args) {
        double a = 20.00d;
        double b = 80.00d;
        double c = ((a + b) * 100) % 40 ;
        boolean d = (c == 0.00d) ? true : false;

        System.out.println("Result of this operation is : " + d );

        if (!d) {
            System.out.println("got some remainder");
        }
    }
}