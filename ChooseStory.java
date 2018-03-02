import java.io.*;
import java.util.*;

class Main {
  //An ArrayList of every prompt that the user can be given.
  static ArrayList<String> prompts = new ArrayList<String>();

  public static void main(String[] args) throws IOException {
    //Set up the console
    Console c = System.console();
    if (c == null){
      System.out.println("No console :(");
      System.exit(1);
    }

    //Use a scanner to scan foreststory.txt and pull out all the prompts
    Scanner in = null;
    in = new Scanner(new BufferedReader(new FileReader("foreststory.txt"))).useDelimiter("\n\n");
    for (int i = 0; in.hasNext(); i++){
      prompts.add(in.next());
    }

    //Game logic here
    String answer = prompt(0);
    if (answer.equals("B")) {

      answer = prompt(2); //Good choice, proceed to answer #3
      if (answer.equals("A")) end(4); //Good ending, answer #4
      else if (answer.equals("B")) end(5); //Bad ending, answer #5

      else System.out.println("Invalid input.");

    } else if (answer.equals("A")) {

      end(3); //Bad ending, answer #2

    } else System.out.println("Invalid input.");
  }
  static String prompt(int index){
    System.out.println(prompts.get(index));
    return System.console().readLine("Your choice (type character): ");
  }
  static void end(int index){
    System.out.println(prompts.get(index));
  }
}
