---
CIS 162 - Chapter 4 - Strings

Rodd Lowell & Ira Woodring
---
Strings - like all objects can - have state and perform behavior.

The state of a String is an ordering of characters (```char``` data type).

The behavior is made up of functions that operate on that ordering.
---
Even though String seems to be built in to Java, it is a class like any other.  We can even view its source code!

https://github.com/irawoodring/162/blob/master/strings/String.java
---
Yes - this might look scary at first.  But it really isn't.  Most of it is comments.

For instance, look at the following lines:
---
- 27-37 are importing other classes String needs

- 108 is just the class declaration

- 111, 114, 117, 131 are just instance variables (the state)

- 139 Is the default constructor.
---
Exercise!  How many constructors are there?
---
We aren't going to count the two private constructors, so there are 15 different constructors.  Why?
---
We have a constructor for each way a programmer might want to create a String.  Perhaps they want one made from another String, they want a blank one, a copy of one, one made out of bytes, etc.
---
This thing isn't complicated at all.  Out of 3,103 lines 1,974 of them are comments (almost 64%).

This is pretty normal for a Java class because the comments are where the documentation comes from.
---
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

Compare the comments to the text in the file!
---
So, if we comment correctly we can automatically generate API (Application Programming Interfaces) for our own code.
---
Let's spend some time in the documentation.  Reading documentation is probably the most important skill you will learn in this class.
---
In the Javadocs for String find the **Method Summary**.  The Method Summary has all the information about how to ask an object to perform some behavior.
---
Remember, functions provide behavior.  They are the "recipes" or "spells" used to tell a computer how do complete a task.
---
A function has a signature, with an access modifier return type, name, and parameter list:

```Java
public void doStuff();
private String toString(Object o);
public int getLength();
private float weightOf(Car vehicleOne);
```
---
Find the method that would return to us the number of characters in an instance of a string.
---
You should have found

```Java
public int length()
```

How would we use it?
---
Well, let's assume we are creating a class that will make use of a String.  We'll go simple with a HelloWorld! type of program:
---
```Java
import java.util.Scanner;

public class HelloWorld {

  // This class holds no state.

  public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      System.out.println("What is your name?");
      String name = scnr.next();
      System.out.println("Hello, " + name + "!");
  }
}
```
---
So we created an object named ```name``` of type ```String```.  Now that we have this object, we can ask it to do things.  For instance, we could print out the number of characters in the String:

```Java
System.out.println(name.length());
```
---
See how that works?  Easy!  We have an object and we ask it to do things for us.

Now, let's practice reading documentation and using objects!
---
Search the Javadocs for how to make the name entered in all capital letters.

Print the new String on the screen.
---
What was the function that accomplishes this task?
---
You should have found the function

```Java
public String toUpperCase();
```

What does this function return?
---
You should see that it returns a String.  This means that merely calling ```name.toUpperCase()``` will not change the value in our current object.  We need to set our current object equal to the return value from this function like this:

```Java
name = name.toUpperCase();
```
---
