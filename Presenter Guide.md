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
Nice! Now we can do logical things with our user input!

Have a few minutes to yourselves to make something within your groups. If you're
out of inspiration, go to https://tinyurl.com/hackthefog-java and look at the
Echo Game sample.


## Arrays and randomness

Things are going to start picking up pace from here. Let's settle down and learn
how to make a Magic 8 Ball in Java.

Have a few minutes to talk with the people nearby on the steps to implementing
a Magic 8 Ball with code. Do not write any real code, just think of the steps.
For example, what responses would you have? Do you need a list of them? Do you
go through each answer in order or do you select one randomly?
**_After 2.5 minutes_**
Now that you've discussed, let me hear some of your ideas.
**_Call on hands_**
These are all great ideas. Let me teach you how I would make a Magic 8 Ball in
Java.

First, I would definitely need a list of answers to give to questions. Since my
laptop cannot fully form coherent sentences randomly, let's make a list using
something called an _array_.
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
What I did here was make an array of `String`s called `answers`. In order to
indicate that it is an array, I put square brackets "[]" after the data type.
I then specified the contents of the list by separating each value with commas
and surrounding them with curly braces "{}".

How do you use an array? Well, you can refer to an item in an array through its
index like so:
```Java
public static void main(String[] args) {
  String[] answers = {"Yes.", "No.", "Maybe.", "Probably not.", "I'm not sure."};
  Console c = System.console();
  String name = c.readLine("Enter your name: ");
  System.out.println(answers[0]); //Prints the first element
}
```
Strangely, if you tell Java to get index 0, it gives you the first element. That's
because Java's counting generally starts at 0. With this in mind, can anybody tell
me what index "Probably not." is at?

Good. Keep this in mind when you work with arrays. Now that we have an array and
know how to use it, let's add the randomness!

In order to use randomness, we're going to need a new import line. Add the import
at the top of your code, and then make a random index number with this code:
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
There's a few new things here. Firstly, the data type of our index variable is
`int`: this just means a whole number. Ignore the random expression - just know
that it will generate a random number between 0 and 4.

We also changed the 0 in the square brackets "[]" to `index`. Since it's going to
be a whole number, this is perfectly acceptable! Generally, what this code does
is print a random message from `answers`.

We're pretty much done with this now! Go ahead and try out your code in repl.it!

You can have a few minutes to try out something new with your new abilities in
making arrays and random numbers. Maybe add onto what you already made?


## Functions

This will be mostly a transition section.

All of you have seen methods already - you've coded with the `main()` function,
used functions like `println()` and `equals()`. You have a vague idea of what they
are - they're chunks of code that you can call on, and you can optionally feed
them input or get an output from them.

Methods can be super useful in making your code shorter, and organizing your code
so you know what everything is doing.

Let's make our own method. We can start with something simple - let's make a method
that just prints, "My name is " + a certain input. Outside of the main method, but
still inside the Main class, let's write the following code:
```Java
static void myName(){
}
```
Let's break this down bit by bit: what is `static`? Though we will not go into too
much detail, `static` is just one of the descriptors of the method. With `static`,
we can simply call on our method by writing a line of code that says `myName();`.

Every function must have a return type, but doesn't have to return anything. If
your function has an output, you must specify what kind of output it is. Is it a
`String`? An `int`? In our case, we don't want to return anything, so we just say
`void`.

The parentheses can have arguments for input. We can specify special variables called
arguments that are set each time we call the method. Inside the curly braces, we
put all of the actual code instructions we want our computer to execute.

Time to add an argument. Modify your code as such:
```Java
static void myName(String name){
}
```
Now, whenever someone calls `myName`, they must specify a name in the form of a
`String`. We can do whatever we want with this `String`. For example, following
the original intent of this lesson:
```Java
static void myName(String name){
  System.out.println("My name is "+name);
}
```
Voila! You have created your own function. Now in `main()`, call this function like
so:
```Java
public static void main (String[] args){
  myName("Alex");
}
```
The code inside `myName` executes, and you get your line of output:
```
My name is Alex
```

Let's try returning something now. Replace the word `void` with `String`:

```Java
static String myName(String name){
  return "My name is "+name;
}
```

What does our code do now? Now, it just returns the String instead of printing it
or anything. You can see this by trying to play the program - nothing shows up.

However, we can still create output with this. We could do something as such:
```Java
public static void main (String[] args) {
  System.out.println(myName("Alex"));
}
```
With this, we actually print something. It's just that this time, we do it ourselves.

## Reading a file with Scanner

This is the most advanced topic so far in this presentation so I advise you bear
with me. In order to create our Choose-your-own-story program, we're going to need
to apply every single concept we've learned so far.

We're going to need an Array of `String`s so we can refer to each one in a list
easily. After that, we're going to need to take user input so we can interpret
what option they chose using `equals()`. We're even gonna make a few functions.

But one thing we're missing that we haven't learned yet are Scanners. Scanners in
Java just read a file of text. We're going to create a story with multiple paragraphs,
then put them into a list of Strings using the Scanner.

Let's make our scanner first. Make sure you also make at least another file in repl.it
and fill it up with content.
```Java
static String[] answers = new String[6];
public static void main(String[] args) {
  Console c = System.console();
  Scanner sc = new Scanner(new BufferedReader(new FileReader("foreststory.txt")));
  sc.useDelimiter("\n\n");
}
```
We make an array to hold our answers, but we don't use the curly brace - we use
`new`. With this, we create an empty array of length 6. Leave it outside the

There's a lot of nested `new`s for the scanner. Don't worry about that.

You might have noticed that at the end of the whole thing, there is a line that
says `sc.useDelimiter("\n\n");`. This line tells Java to break up the text into
parts every two newlines. We need this in order to get paragraphs.

Next, let's add the following code to go through the the text and add items to the
array.
```Java
static String[] answers = String[6];
public static void main(String[] args) {
  Console c = System.console();
  Scanner sc = new Scanner(new BufferedReader(new FileReader("foreststory.txt")));
  sc.useDelimiter("\n\n");

  int count = 0;
  while(sc.hasNext()) {
    answers[count];
    count++;
  }
}
```
What did I do? I made a `while` loop that will keep executing, as long as there
is something next left to read from the file. I use an integer variable called
`count` to place each paragraph from the file into the array, in indices 0 through
5.

Now, let's start making the actual game. First, let's make two functions that
will hel
