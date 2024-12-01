import java.util.Scanner;
public class Main {
  public static void main(String[]args){
    Scanner Inl = new Scanner(System.in);
    System.out.print("Enter length:");
    float l = Inl.nextFloat();
    Scanner Inb = new Scanner(System.in);
    System.out.print("Enter breadth:");
    float b = Inb.nextFloat();
    Inl.close();
    Inb.close();
    float a = l*b;
    System.out.print("Area of rectangle with length "+l+" unit and breadth "+b+" unit is "+a+" unit².");
  }
}