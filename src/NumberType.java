import java.util.Scanner;

public class NumberType {

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int reversed = 0, original = num;
        while (num > 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num = num / 10;
        }
        return original == reversed;
    }

    // Method to check if a number is a neon number A positive integer whose
    // sum of digits of its square is equal to the number itself is called a neon number.
    //e.g:-(9)^2=81;8+1=9 is neon no.
    public static boolean isNeon(int num)
    {
        int square = num * num;
        int sumOfDigits = 0;
        while (square > 0)
        {
            int digit = square % 10;
            sumOfDigits =sumOfDigits + digit;
            square /= 10;
        }
        return sumOfDigits == num;
    }

    // Method to check if a number is an Armstrong number
    //153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = (int)Math.log10(num) + 1;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to check if a number is odd
    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    // Method to check if a number is a strong number
    public static boolean isStrong(int num) {
        int original = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
            num /= 10;
        }
        return sum == original;
    }

    // Method to check if a number is a spy number
    //A positive integer is called a spy number if the sum and product of its digits are equal.
    //Sum=1+1+2+4=8        and         Product=1*1*2*4=8
    public static boolean isSpy(int num) {
        int original = num;
        int sum = 0;
        int product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product && original != 0;
    }

    // Method to check if a number is a happy number

    public static boolean isHappy(int num) {
        while (num != 1 && num != 4) {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }
            num = sum;
        }
        return num == 1;
    }

    // Method to check if a number is a sunny number
    /*
    A number is called a sunny number if the number next to the given number is a perfect square.
     In other words,
     a number N will be a sunny number if N+1 is a perfect square.
     */
    public static boolean isSunny(int num) {
        int nextPerfectSquare = (int)Math.sqrt(num) + 1;
        int square = nextPerfectSquare * nextPerfectSquare;
        return square == num;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("Palindrome: " + isPalindrome(num));
        System.out.println("Neon: " + isNeon(num));
        System.out.println("Armstrong: " + isArmstrong(num));
        System.out.println("Prime: " + isPrime(num));
        System.out.println("Even: " + isEven(num));
        System.out.println("Odd: " + isOdd(num));
        System.out.println("Strong: " + isStrong(num));
        System.out.println("Spy: " + isSpy(num));
        System.out.println("Happy: " + isHappy(num));
        System.out.println("Sunny: " + isSunny(num));
    }
}
