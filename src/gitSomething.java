import java.util.Scanner;

public class gitSomething {
  Scanner scan = new Scanner(System.in);
  void askAboutAge() {
    int age;
    System.out.println("Please enter your age");
    age = scan.nextInt();
    System.out.println("You are: " + age + " years old.");
  }
  void greet() {
    Scanner scan = new Scanner(System.in);
    String name;
    System.out.println("Please enter your name");
    name = scan.nextLine();
    System.out.println("Hej: " + name);

  }
  void go () {
    System.out.println("It works");
    greet();
    askAboutAge();
  }
  public static void main(String[] args) {
    new gitSomething().go();
  }
}
