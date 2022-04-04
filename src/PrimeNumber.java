import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        boolean isPrime = num >= 2; //we want all positive numbers

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }

            if (isPrime) {
                System.out.println(num + " is Prime");
            } else {
                System.out.println(num + " is NOT Prime");
            }

        }
    }


