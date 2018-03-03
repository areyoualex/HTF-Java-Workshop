# Presenter Guide

This is a guide on the information the presenter should be giving to the audience.
Do not read this out loud word-for-word, simply phrase the information how you see
fit. Details concerning the key speaker points and timing can be found at the
[Workshop Time Guide.]
(https://github.com/epixtallion/HTF-Java-Workshop/blob/master/Workshop%20Time%20Guide.md)

### Overview of contents:
* Basics: Hello World, variables
* User input from console + logic
* Arrays and randomness
* Functions
* Read a file with Scanner

## Starting out: Hello World and variables

* Stereotypical Hello World output
* Get everyone to open repl.it - default program shown
  * Encourage them to make an account so they can access their code even after
  the workshop
```Java
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
```
* Press play to show output
```
Hello world!
```
* Everything in class Main contained within curly braces
  * Think of Main as your entire program
* Describe println() - talk about methods
  * Methods are simply blocks of code that do stuff for you
  * Methods can have input + output
  * All of your code that actually _does stuff_ is contained within methods
* Give semicolon talk!
  * Semicolons are like periods in programming - periods end sentences, semicolons
  end statements.
* Describe main() - talk about defining methods
  * Code that main() runs is inside curly braces
  * When you start up your program, everything in main is called and run by Java
  * In main(), you define what the program does and write instructions
* Introduce variables - type up on screen and explain each keyword briefly as you
type: "String" is just text, someText is a name, = assigns the variable to something.
```Java
class Main {
  public static void main(String[] args) {
    String someText = "Hey, I'm a string of characters!";
    System.out.println("Hello world!");
  }
}
```
* All variables must have a data type - an integer cannot hold a String, a String
cannot hold an integer, etc.
* Describe someText as a shortcut/alias for what is held inside.
* Print string to console
```Java
class Main {
  public static void main(String[] args) {
    String someText = "Hey, I'm a string of characters!";
    System.out.println(someText);
  }
}
```
```
Hey, I'm a string of characters!
```
* Quotes signify regular text - if you surround with text, someText is treated as
plain text instead of a variable
```
someText
```


## Getting user input from the console, and using logic

* Use example of repeating the user's name - user input is important so someone
can actually use your code
  * We will be getting it from the console - someone will type into the console
* Show import statement onscreen
```Java
import java.io.*;
```
* Briefly describe import by saying it lets you use stuff outside of your program.
* Create console() variable onscreen
```Java
public static void main(String[] args) {
  Console c = System.console();
}
```
* Talk about using a method that returns the system console, then assigning it
to variable
* Show the readLine() and println() on screen - briefly describe new methods and
structure as you type
  * We assign name to whatever the user types, and then print it out in println
```Java
public static void main(String[] args) {
  Console c = System.console();
  String name = c.readLine("Enter your name: ");
  System.out.println("Hello, "+name);
}
```
* Talk about using + sign to join text together
* There isn't much you can do other than print text - time to do something with
the text
* Introduce if statements and equals
* Sample program that will check if your name is Alex
```Java
public static void main(String[] args) {
  Console c = System.console();
  String name = c.readLine("Enter your name: ");
  if (name.equals("Alex")){
    System.out.println("Hello, "+name);
  } else {
    System.out.println("Stranger danger! Stranger danger!");
  }
}
```
* Describe what an if statement does - checks if the condition is true, and
then executes whatever code is inside its curly braces
* Describe else - only executes if the if statement fails
* Describe equals as how you compare pieces of text - it's a method that returns
true or false
* Show the output by demoing
* Give them their own time, have Echo Game example link ready
  * https://github.com/epixtallion/HTF-Java-Workshop


## Arrays and randomness

* Introduce next topic
* Activity to discuss how to make a Magic 8 Ball

**_After 2.5 minutes_**

* **_Call on hands_**
* Introduce an array as a list to hold answers (explain as you go)
```Java
public static void main(String[] args) {
  String[] answers = {"Yes.", "No.", "Maybe.", "Probably not.", "I'm not sure."};
  Console c = System.console();
  String name = c.readLine("Enter your name: ");
  if (name.equals("Alex")){
    System.out.println("Hello, "+name);
  } else {
    System.out.println("Stranger danger! Stranger danger!");
  }
}
```
* Explain referring to item in array by index
```Java
public static void main(String[] args) {
  String[] answers = {"Yes.", "No.", "Maybe.", "Probably not.", "I'm not sure."};
  Console c = System.console();
  String name = c.readLine("Enter your name: ");
  System.out.println(answers[0]); //Prints the first element
}
```
* Ask if anyone can tell me how to get to index of certain answer
* Show import for Math for randomness
* Explain random statement as you go
```Java
import java.io.*;
import java.lang.Math;

...

public static void main(String[] args) {
  String[] answers = {"Yes.", "No.", "Maybe.", "Probably not.", "I'm not sure."};
  Console c = System.console();
  String name = c.readLine("Ask me a question: ");

  int index = (int) (Math.random()*5);
  System.out.println(answers[index]);
}
```
* Explain how the randomness works step by step
  * Math.random() makes a random decimal between 0 and 1 (but is never 1)
  * Multiply by 5 to get a random number between 0 and 5
  * Put a parentheses around the whole thing, then put this special keyword
  called a cast that will turn the decimal into a whole number
  * It doesn't round, (int) just gets rid of the numbers after the decimal
* Have people test their code on repl.it


## Functions

* Review what a method/function is - block of code you can call on,
and optionally give an input and output
* Explain utility of methods
  * Good for organizing code and making shorter
* Type up a sample method
```Java
static void myName(){
}
```
* Explain static and void - static so you can just call on your method like
`myName()`, void because the function doesn't return anything
* Explain what an argument is - it's the input to the function.
  * In println(), you put what you want to print inside the parentheses
  * When writing a function, you put the variable for the argument inside
  the parentheses
* Add name argument
```Java
static void myName(String name){
}
```
* Add code to inside - print a line that says "My name is "+name
```Java
static void myName(String name){
  System.out.println("My name is "+name);
}
```
* Call the function in main()
```Java
public static void main (String[] args){
  myName("Alex");
}
```
```
My name is Alex
```

* Return a String - change return type to String
* Change println to return keyword

```Java
static String myName(String name){
  return "My name is "+name;
}
```

* Explain how to use the method in this instance
```Java
public static void main (String[] args) {
  System.out.println(myName("Alex"));
}
```


## Reading a file with Scanner

* Go over how we will make a create-your-own story
  * Need an array to hold all of the parts of the story
  * We will read our parts of the story from a text file
* Introduce Scanner - a thing in Java that will read from a file
* Step by step introduce the declaration
  * We will make a scanner and assign to variable
  * Scanner sc is our variable - Scanner will be initialized from a BufferedReader
  that is a middle-ground between the scanner and the actual file reader
  * BufferedReader inside parentheses - this will be initialized finally from a
  FileReader - this reads the file's text at the lowest level
  * New statement - add useDelimiter() to "\n\n" so the Scanner will break up
  each part after you type enter twice
* After this, insert answers array, which we will declare in a different way -
since we won't type up our values, we don't use curly braces. It is size of 5,
so it will have 5 inside the brackets

```Java
static String[] answers = new String[5];
public static void main(String[] args) {
  Console c = System.console();
  Scanner sc = new Scanner(new BufferedReader(new FileReader("foreststory.txt")));
  sc.useDelimiter("\n\n");
}
```

* Introduce a while loop - it keeps going so long as the condition inside of the
parentheses is true
* We will need to keep looping through the scanner as long as there is something
left to read - use hasNext(), which returns true if there is something left to
read
* Add count variable so we can place each paragraph in an index in the array
```Java
static String[] answers = String[6];
public static void main(String[] args) {
  Console c = System.console();
  Scanner sc = new Scanner(new BufferedReader(new FileReader("foreststory.txt")));
  sc.useDelimiter("\n\n");

  int count = 0;
  while(sc.hasNext()) {
    answers[count] = sc.next();
    count++;
  }
}
```
* Create functions to help with printing
```Java
static String[] answers = String[6];
public static void main(String[] args) {
  Console c = System.console();
  Scanner sc = new Scanner(new BufferedReader(new FileReader("foreststory.txt")));
  sc.useDelimiter("\n\n");

  int count = 0;
  while(sc.hasNext()) {
    answers[count] = sc.next();
    count++;
  }
}
static void
```
