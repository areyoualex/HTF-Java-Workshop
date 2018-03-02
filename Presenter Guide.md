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

In the computer programming world, the most common and stereotypical first
tutorial is learning how to print, "Hello World!" to the console. In Java, we
can print a line of code to the console using the `System.out.println()` function.

Go to [repl.it](https://repl.it) and you will immediately be greeted with some
code that looks like this:
```Java
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
```
Press the play button and you can see that "Hello world!" is printed to the console.
```
Hello world!
```

Take a moment to look at how the code inside is structured. Things tend to be
contained within braces. Everything inside the `Main` class is contained by curly
braces "{}", and so is everything in `main`.

Let's look at `println()` - ignore `System.out` for now. `println()` is a
_method_, and it takes whatever you supply it and prints it to the console. Methods
are just blocks of code that when called, do certain things for you. Usually the
name tells you what it does; for example, `println()` prints a line of text. The
thing that you supply in particular is contained within the parentheses "()".
Notice that after calling a method, you must add a semicolon ";" to the end.
_Always remember to put the semicolon!_ A semicolon ";" in Java is like a period
in the English language. Like how periods end sentences, semicolons end any
statement in Java.

Take a look at `public static void main(String[] args)`. It's quite a mouthful.
Don't worry about what `public static void` or `String[] args` means - all you
need to know is that `main()` is also a method. Whenever you press play,
everything inside the `main()` method is called and run by Java.

Why are there curly brackets after `main()` but not `println()`? The difference
is `println()` is already written for you to use, but you must tell Java what
`main()` does yourself.

Time to spice it up a little. First, let's add a variable that will hold some text
for us:
```Java
class Main {
  public static void main(String[] args) {
    String someText = "Hey, I'm a string of characters!";
    System.out.println("Hello world!");
  }
}
```
Let's break down the code that I added. The first word, `String`, is the type of
data the variable will hold - in this case, it's a string of characters. A `String`
can be any text you want it to be.

Next, `someText` is the name of my variable. Think of the variable as a place to
store my data. Instead of typing out the entire text, we can just call someText
to conveniently fetch our `String` for us.

Finally, the `=` and the text surrounded by quotes. `String someText` tells us our
variable type and the name, while `= "Hey, I'm a string of characters!"` tells Java
what to actually store in that string.

What can we do next? Well, let's try to print our string to the console like so:
```Java
class Main {
  public static void main(String[] args) {
    String someText = "Hey, I'm a string of characters!";
    System.out.println(someText);
  }
}
```
Press run and you will see our `String`:
```
Hey, I'm a string of characters!
```
Notice how we removed the quotes. Quotes signify regular text in Java. This means
that if we surrounded it with quotes, then it would print:
```
someText
```
Java treats someText like _literal text_ instead of a variable!


## Getting user input from the console, and using logic

Printing text to the console is cool and all, but it gets boring. Imagine making
something that says, "Hello, _your name here_!". If you want to share it with your
friend that can't edit the original code to change the text, how are you going to
make it say their name? We're going to solve this problem by getting user input
from the console.

The first thing you're going to need is to add the following line to the _very
start_ of your code:
```Java
import java.io.*;
```
Don't worry about what this means for now - just know that we need this in order
to use Java's console input.

Now, you need to make a variable for the console. Let's call it `c`:
```Java
public static void main(String[] args) {
  Console c = System.console();
}
```
Did you notice that we used a method? Methods, apart from doing specific
instructions, can return a value. `System.console()` simply gives us the `Console`
object that we need to use.

We're ready to get user input now! Let's ask for a name and say hello with the
following code:
```Java
public static void main(String[] args) {
  Console c = System.console();
  String name = c.readLine("Enter your name: ");
  System.out.println("Hello, "+name);
}
```
The next line of code makes a variable for the name of the person, and sets it
to what `c.readLine()` returns. This will print out the message that you give it,
wait until the user types something and presses enter, and return whatever they
typed.

Lastly, the `println()` prints out _"Hello, whatever name was typed here"_. In
order to print it all as one piece of text, we join them together using the plus
sign.

This opens up lots of possibilities. But what if you want to add some logic to your
program? You don't just want to print out whatever your user types in, you want
to _do something_ with that input. We're going to learn a little on how we can
do this using `if` statements and `equals()`.

Let's make it so our program will only greet us if our name is Alex. We need to
make some small changes to what we have so far:
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
What have we added? There's a new block called `if`, and it does exactly what you
think it does. If whatever's in the parentheses "()" is true, then the code in
the curly brackets "{}" is executed.

`else` also does what you think it does - if the condition in the if isn't satisfied,
execute whatever's in this block.

What does `equals()` do? All we're doing is checking if `name` is equal to whatever
you ask `equals()` to test in the parentheses.

Now that you've added this, let's test the outputs and it works as expected:
```
Demo output here...
```
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
public static void main(String[] args) {
  String[] answers = String[6];

  Console c = System.console();
  Scanner sc = new Scanner(new BufferedReader(new FileReader("foreststory.txt")));
  sc.useDelimiter("\n\n");
}
```
There's a lot of nested `new`s. Don't worry about that, they're just stupid and aggressive.

You might have noticed that at the end of the whole thing, there is a line that says sc.useDelimiter(\n\n);.
All this means is that Java will now use 2 white break lines. Next, lets make a loop to insert paragraphs into the array:
```Java
int count = 0;
while(true) {
  if (sc.hasNext()) answers[count];
}


}
