# Hack the Fog: Intro to Java

Welcome to this workshop page! Over the course of this workshop, you will learn
how to:
* Create a text-based game with the Java VM console
* Use basic logic blocks with the Java language
* Create a function that returns a value depending on the input
* Share your creation with your friends using repl.it

Please refer to these links if you would like to demo the code from the workshop:
* [Using console input demo](https://repl.it/@epix/Console-Input-Demo)
* [Echo game](https://repl.it/@epix/Echo-Game)
* [Magic 8 Ball game](https://repl.it/@epix/Magic-8-Ball)
* [Choose-your-own-story starter code](https://repl.it/@epix/Choose-Your-Own-Story-Starter-Code)

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


## Getting user input from the console

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
