import java.io.*;

class Main {
  public static void main(String[] args) {
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
