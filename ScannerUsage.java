import java.io.*;

class Main {
  public static void main(String[] args) {
    Console c = System.console();
    if (c == null){
      System.out.println("No console :(");
      System.exit(1);
    }
    String name = c.readLine("Enter your name: ");
    System.out.println("Hello, "+name+"!");
  }
}
