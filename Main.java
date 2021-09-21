import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter x1: ");
    double x1 = scan.nextDouble(); 

    System.out.print("Enter y1: ");
    double y1 = scan.nextDouble(); 

    System.out.print("Enter x2: ");
    double x2 = scan.nextDouble(); 

    System.out.print("Enter y2: ");
    double y2 = scan.nextDouble(); 

    double length = Math.sqrt((x2  -x1) * (x2  -x1) + (y2 - y1) * (y2 - y1));
    System.out.println("The length result of the coordinate is: " + length);
  }
}
