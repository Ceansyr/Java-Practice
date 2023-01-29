public class primeNumber {

    public static void main(String[] args) {
        //prime();
        sumOfNumbers();
    }

    public static boolean isPrime (int number){
        if (number < 2){
            return false;
        }
        for (int divisor = 2; divisor <= (number/2); divisor++){
            if (number%divisor == 0){
                return false;
            }
        }
        return true;
    }
    public static void prime(){
        if (isPrime(11) == true){
            System.out.println("it is a prime number");
        } else {
            System.out.println("it's not a prime number");
        }
    }
    public static int sumOfNumbers (){
        int count = 0;
        int sum = 0;
        for (int i=1 ; count<5 && i<=1000; i++){
            if (i%15 == 0){
                System.out.println("Number " + i + " is divisible by both 3 and 5.");
                sum += i;
                count++;
            }
        }
        System.out.println("Sum of these 5 numbers is " + sum );
        return 0;
    }
}
