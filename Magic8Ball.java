import java.io.*;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    String[] answer = {"Probably.", "Definitely not.", "Absolutely.", "I can't tell",
                      "The stars seem to say otherwise.", "The stars are in your favor."};

    Console c = System.console();
    if (c == null){
      System.out.println("No console :(");
      System.exit(1);
    }
    System.out.println("Type 'stop' to exit");
    while (true){
      String echo = c.readLine("Ask me a question: ");
      if (echo.equals("stop")) System.exit(0);
      System.out.println(answer[(int)(Math.random()*answer.length)]);
    }
  }
}
