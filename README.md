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

`public static void main(String[] args)` is quite a mouthful. Don't worry about
what `public static void` or `String[] args` means - all you need to know is that
`main()` is a _method_. Whenever you press play, everything inside the `main()`
method is run by Java.

Let's look at `println()` - ignore `System.out` for now. `println()` is also a
method, and it takes whatever you supply it and prints it to the console. The
thing that you supply in particular is contained within the parentheses "()".
Notice that after calling a method, you must add a semicolon ";" to the end.
_Always remember to put the semicolon!_ A semicolon ";" in Java is like a period
in the English language. Like how periods end sentences, semicolons end any
statement in Java.

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
