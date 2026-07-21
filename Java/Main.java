import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l = 0;
        while (true) {
            try {
                System.out.print("Length: ");
                l = Double.parseDouble(scanner.nextLine());
                if (l <= 0) {
                    System.out.println("Please input a number > 0.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        double b = 0;
        while (true) {
            try {
                System.out.print("Breadth: ");
                b = Double.parseDouble(scanner.nextLine());
                if (b <= 0) {
                    System.out.println("Please input a number > 0.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        double area = l * b;
        System.out.println("The area of a rectangle with length " + l + " units and breadth " + b + " units is " + area + " unit².");
        scanner.close();
    }
}
