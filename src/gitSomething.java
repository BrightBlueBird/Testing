import java.util.Scanner;

public class gitSomething {
  void greet() {
    Scanner scan = new Scanner(System.in);
    String name;
    System.out.println("Please enter your name");
    name = scan.nextLine();
    System.out.println("Your name is: " + name);

  }
  void go () {
    System.out.println("It works");
    greet();
  }
  public static void main(String[] args) {
    new gitSomething().go();
  }
}
