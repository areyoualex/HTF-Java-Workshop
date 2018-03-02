# Hack the Fog: Intro to Java

Welcome to this workshop page! Over the course of this workshop, you will learn
how to:
* Create a text-based game with the Java VM console
* Use basic logic blocks with the Java language
* Create a function that returns a value depending on the input
* Share your creation with your friends using repl.it

Please refer to these links if you would like to find some specific code from
the workshop:
* [Using console input demo](https://repl.it/@epix/Console-Input-Demo)
* [Echo game](https://repl.it/@epix/Echo-Game)
* [Magic 8 Ball game](https://repl.it/@epix/Magic-8-Ball)
* [Choose-your-own-story starter code](https://repl.it/@epix/Choose-Your-Own-Story-Starter-Code)

## Starting out: Hello World and getting input

In the computer programming world, the most common and stereotypical first
tutorial is learning how to print, "Hello World!" to the console. In Java, we
can print a line of code to the console using the `System.out.println()` function.

Go to [repl.it](https://repl.it) and you will immediately be greeted with some
code that looks like this:
```java
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
```
Press the play button and you can see that "Hello world!" is printed to the console.
Let's spice it up a little. First, let's add a variable that will hold some text
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
variable that will be
