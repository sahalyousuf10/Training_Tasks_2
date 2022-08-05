import java.util.Scanner;
public class Prime_Numbers {

    public static void main(String[] args) {

        System.out.println("Enter the number to check prime number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println();
        int i, half = 0;
        boolean b = false;

        half = number / 2; // Divide the number by 2 because if we check the number by itself then we can't find that it is prime or not because every prime number is divided by itself

        if (number == 0 || number == 1) { // Check if the number is 0 and 1
            System.out.println(number + " is not prime number"); // If the number is 0 or 1 then it will not be a prime number

        } else {
            for (i = 2; i <= half; i++) { // start from 2 and go till number/2
                if (number % i == 0) {   // first check the given number % 2 is equal to 0, then increment than check again till number/2

                    System.out.println(number + " is not prime number"); // if the statement is true then it will not be a prime number
                    b = true;
                    break;
                }
            }
            if (b == false) {
                System.out.println(number + " is prime number");
            } // then it will be a prime number
        }

        b = false;

        System.out.println("Prime Numbers till: " + number);

        for (i = 0; i <= number; i++) //loop till the given number
        {
            if (i == 0 || i == 1) { // Check if the number is 0 and 1
                b = true;  // if the number is 0 or 1 then set boolean as true
            } else {

                b = false;
                for (int j = 2; j < i; j++) { //start from 2 and go till number
                    if (i % j == 0) {
                        b = true;  // if the statement is true then set boolean as true
                        break;
                    }
                }
                if (b == false) // if boolean is false then it is a prime number
                    System.out.println(i);
            }
        }
    }
}
