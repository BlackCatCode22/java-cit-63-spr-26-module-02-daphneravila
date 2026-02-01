import java.util.Scanner;
public class MaddnessWithMethods {
    public static void main(String[] args) {
        int num1 = getAnIntFromTheUser();
        int num2 = getAnIntFromTheUser();
        compareTwoInts(num1, num2);
        int sum = sumTwoInts(num1, num2);
        System.out.println("The sum is: " + sum);
    }
        public static int getAnIntFromTheUser() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            return number;
        }
        public static void compareTwoInts(int first, int second) {
            if (first > second) {
                System.out.println(first + " is larger than " + second);
            }
            else if (second > first) {
                System.out.println(second + "is larger than " + first);
            }
            else {
                System.out.println("They are equal!");
            }
            }
        public static int sumTwoInts(int first, int second)

    {
        int total = first + second;
        return total;
    }


        }
