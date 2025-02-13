import java.util.Scanner;

class marks {
  public static void main(String args[]) {
    System.out.print("Enter your marks : ");
    Scanner s = new Scanner(System.in);
    int marks = s.nextInt();
    s.close();
    if (marks >= 90 && marks <= 100) {
      System.out.println("O");
    } else if (marks >= 80 && marks < 90) {
      System.out.println("E");
    } else if (marks >= 70 && marks < 80) {
      System.out.println("A");
    } else if (marks >= 60 && marks < 70) {
      System.out.println("B");
    } else if (marks >= 50 && marks < 60) {
      System.out.println("C");
    } else {
      System.out.println("D");
    }
  }
}
