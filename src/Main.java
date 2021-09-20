public class Main {
    public static void main(String[] args) {
        sum3And5Challenge(0);
    }

    public static void sum3And5Challenge(int count) {
        for (int n = 1; n <= 1000; n++) {
            if ((n % 3 == 0) && (n % 5 == 0)){
                count ++;
                System.out.println("The number " + n + " is divisible by 3 and 5.");
                if (count == 5){
                    System.out.println("Exiting for loop.");
                    break;
                }
            }
        }
        System.out.println("Count of numbers = " + count);
    }
}
