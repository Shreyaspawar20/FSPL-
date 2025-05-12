// Q1. Write a program to print "Hello World".
    class Vote{
    public static void main(String args[])
    {
	
		System.out.println("Hello World !");
	}

    }   


// Q2. Write a program to take Name and Age as input and print them.
    import java.util.scanner;
	public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        scanner.close();
    }
	}
	
// Q3. Write a program to take User ID as input and print Jake's name & age if the ID matches.
    import java.util.Scanner;

    public class UserLookup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String validUserId = "jake123";
        String name = "Jake";
        int age = 25;

        System.out.print("Enter User ID: ");
        String inputId = scanner.nextLine();

        if (inputId.equals(validUserId)) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } else {
            System.out.println("User ID not found.");
        }

        scanner.close();
    }
    }
	
	
// Q4. Write a program to take Age as input, increment it by 1, and print the result.
    import java.util.Scanner;

    public class AgeIncrementer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        age = age + 1;

        System.out.println("Next year, you will be: " + age);

        scanner.close();
    }
}
// Q5. Write a program to find and print the largest of three numbers.
    import java.util.Scanner;

    public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
//Q6. Write a program to add 2 and 3 and print the result.
    public class AddTwoNumbers {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
//Q7. Write a program to take two numbers as input, add them, and print the sum.
    import java.util.Scanner;

    public class AddTwoNumbers {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}
//Q8. Write a program to take two numbers as input, multiply them, and print the result.
    import java.util.Scanner;

    public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int product = num1 * num2;

        System.out.println("The product is: " + product);

        scanner.close();
    }
}
//Q9. Write a program to take two numbers as input, subtract them, and print the difference.
    import java.util.Scanner;

    public class SubtractTwoNumbers {
    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int difference = num1 - num2;

        System.out.println("The difference is: " + difference);

        scanner.close();
    }
}
//Q10. Write a program to convert Fahrenheit to Celsius.
    import java.util.Scanner;

    public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");

        scanner.close();
    }
}
//Q11. Write a program to find the Area and Circumference of a Circle.
    import java.util.Scanner;

    public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.printf("Area of the circle: %.2f%n", area);
        System.out.printf("Circumference of the circle: %.2f%n", circumference);

        scanner.close();
    }
}