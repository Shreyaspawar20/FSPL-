import java.util.Scanner;

public class assignmentTwo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	         1. Check if a number is even or odd
	         System.out.print("Enter a number: ");
	         int num = sc.nextInt();
	         if (num % 2 == 0)
	             System.out.println(num + " is Even");
	         else
	            System.out.println(num + " is Odd");

	         2. Check if a number is prime or not
	         System.out.print("Enter a number: ");
	         int num = sc.nextInt();
	         boolean isPrime = true;
	         if (num <= 1) isPrime = false;
	         else {
	             for (int i = 2; i <= num / 2; i++) {
	                 if (num % i == 0) {
	                     isPrime = false;
	                     break;
	                 }
	             }
	         }
	         System.out.println(num + (isPrime ? " is Prime" : " is Not Prime"));

	         3. Print numbers from 1 to 20
	         for (int i = 1; i <= 20; i++) {
	             System.out.print(i + " ");
	         }

	         4. Print numbers from 1 to 10, excluding 5 and 6
	         for (int i = 1; i <= 10; i++) {
	             if (i == 5 || i == 6) continue;
	             System.out.print(i + " ");
	         }

	         5. Print the table of 5
	         for (int i = 1; i <= 10; i++) {
	             System.out.println("5 x " + i + " = " + (5 * i));
	         }

	         6. Print "Hello" five times
	         for (int i = 0; i < 5; i++) {
	             System.out.println("Hello");
	         }

	         7. Print any multiplication table for a given number
	        System.out.print("Enter number: ");
	        int n = sc.nextInt();
	        for (int i = 1; i <= 10; i++) {
	        System.out.println(n + " x " + i + " = " + (n * i));
	        }

	         8. Print the reverse of 1234
	         int num = 1234;
	         int rev = 0;
	         while (num != 0) {
	             int digit = num % 10;
	             rev = rev * 10 + digit;
	             num /= 10;
	         }
	         System.out.println("Reversed: " + rev);

	         9. Check if 121 is a palindrome
	         int num = 121, temp = num, rev = 0;
	         while (num != 0) {
	             rev = rev * 10 + (num % 10);
	             num /= 10;
	         }
	         if (temp == rev)
	             System.out.println(temp + " is Palindrome");
	         else
	             System.out.println(temp + " is Not Palindrome");

	         10. Check if a given number is a palindrome
	         System.out.print("Enter number: ");
	         int num = sc.nextInt(), temp = num, rev = 0;
	         while (num != 0) {
	             rev = rev * 10 + (num % 10);
	             num /= 10;
	         }
	         if (temp == rev)
	            System.out.println("Palindrome");
	         else
	             System.out.println("Not Palindrome");

	         11. Check if 153 is an Armstrong number
	         int num = 153, temp = num, sum = 0;
	         while (num != 0) {
	             int digit = num % 10;
	             sum += digit * digit * digit;
	             num /= 10;
	         }
	         if (temp == sum)
	             System.out.println(temp + " is Armstrong");
	         else
	             System.out.println(temp + " is Not Armstrong");

	         12. Check if a given number is an Armstrong number
	         System.out.print("Enter number: ");
	         int num = sc.nextInt(), temp = num, sum = 0;
	         while (num != 0) {
	             int digit = num % 10;
	             sum += digit * digit * digit;
	             num /= 10;
	         }
	         if (temp == sum)
	             System.out.println("Armstrong");
	         else
	             System.out.println("Not Armstrong");

	         13. Print all Armstrong numbers from 1 to 1000
	         for (int i = 1; i <= 1000; i++) {
	             int temp = i, sum = 0, num = i;
	             while (num != 0) {
	                 int d = num % 10;
	                 sum += d * d * d;
	                 num /= 10;
	             }
	             if (temp == sum)
	                 System.out.println(temp);
	         }

	         14. Print all palindrome numbers from 1 to 100
	         for (int i = 1; i <= 100; i++) {
	             int num = i, rev = 0, temp = num;
	             while (num != 0) {
	                 rev = rev * 10 + (num % 10);
	                 num /= 10;
	             }
	             if (temp == rev)
	                 System.out.print(temp + " ");
	         }

	    }
	}