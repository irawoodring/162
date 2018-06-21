---
CIS 162 - Loops

Rodd Lowell & Ira Woodring
---
Wizards need to understand how to repeat a process in the most efficient way possible.  If we need to perform a task multiple times, there is no need to repeat the steps manually.  Just use a loop!
---
For instance, here is a professional wizard using a loop to save the world:

https://www.youtube.com/watch?v=yKAfwBPvsMA
---
Dr. Strange wanted to carryout the following steps multiple times:

- Confront Dormammu
- Ask to bargain
- Die

Over and over again until a condition was met.  The condition was Dormammu gave up and agreed to the demands.
---
As programmers, we often run into situations like this one where we have a stubborn being refusing our directions.  For instance, we may have a situation like this:
---
Computer Prompt: "Enter a number between 1 and 10."

User: "V"

Computer Prompt: "Enter a number between 1 and 10."

User: "27"

Computer Prompt: "Enter a number between 1 and 10."

User: "Three"
---
Obviously we need a way to repeat our work here; we can't just have an infinite number of if-else statements that accept the answer if it is viable and continue or ask the question again otherwise.
---
```Java
int a = 0;
System.out.println("Enter a number between 1 and 10");
a = scnr.nextInt();
if(... a is out of range ...){
  System.out.println("Enter a number between 1 and 10");
} else {
  doNextTask();
}

System.out.println("Enter a number between 1 and 10");
a = scnr.nextInt();
if(... a is out of range ...){
  System.out.println("Enter a number between 1 and 10");
} else {
  doNextTask();
}

System.out.println("Enter a number between 1 and 10");
a = scnr.nextInt();
if(... a is out of range...){
  System.out.println("Enter a number between 1 and 10");
} else {
  doNextTask();
}

System.out.println("Enter a number between 1 and 10");
a = scnr.nextInt();
if(... a is out of range ...){
  System.out.println("Enter a number between 1 and 10");
} else {
  doNextTask();
}

System.out.println("Enter a number between 1 and 10");
a = scnr.nextInt();
if(... a is out of range ...){
  System.out.println("Enter a number between 1 and 10");
} else {
  doNextTask();
}

...
```
---
That isn't going to work...

Enter the ```while``` loop.  You should have seen an introduction to this the other night.
---
The ```while``` loop has the structure:

```Java
while(conditional){
  ...
  Code Block
  ...
}
```

This means that the Code Block will be run over and over in a loop as long as the conditional evaluates to ```true```.
---
Let's fix our repetitive code!

```Java
int a = 0;

while(a<1 || a>10){
  System.out.println("Enter a number between 1 and 10");
  a = scnr.nextInt();
}
```

That is MUCH better.
---
Our example from earlier:

```Java
while(Dormammu refuses){
  Confront him.
  Ask him to bargain.
  Die.
}
```
---
Awesome!  That's a much more efficient way of going about it.

```while``` loops are essential to programming.  The above type of ```while``` loop is called a **sentinal loop**.  Sentinals ensure that we continue trying some code until we get a value we can use.  This may be from a user, another program, another computer, etc.
---
But we can also use ```while``` loops for other things besides waiting for values.  For instance, we could simply count:

```Java
int a = 0;
while(a<=100){
  System.out.println(a);
  ++a;
}
```
---
If for instance, Dr. Strange only wanted to try to bargain 1,000,000 times before just going to live on another plane of existence:

```Java
int i=0;

while(i<1000000){
  Confront Dormammu
  Ask him to bargain.
  Die.
}

Forget it.  Earth had a good run.
```
---
Sometimes, we might even want an algorithm to run (potentially) forever!

Consider, we might want to write a web server program.  A web server needs to sit and wait for other computers to request web pages from it.  How do we instruct it to wait?
---
```Java
while(true){
  - wait for connection
  - accept connection and create a new process to handle it
}
```

Since a while loop runs until the conditional is no longer true, this one essentially runs forever!
---
Which means we could rewrite our original problem as such:

```Java
while(true){
  Confront Dormammu.
  Ask him to bargain.
  Says yes?  Do something else!
  Die.
}
```
---
This does the same as the first but looks a little different.  Usually we want to use the first method with the sentinel form, but for some problems (like the web server!) we can do it this way.
---
Work with those around you.  Write a class with these specs:

- Is called POS

- Has a single method, ```public static void main(String[] args)```

- initializes a variable called ```total``` to 0.

- Continuously asks the user for a currency value (i.e. $3.53) until the user enters a negative number

- Prints out the sum with a tax of 6.5% added.
---
Excellent!

While loops are the most essential type of loop in programming.  This is largely because we don't need to know how long the loop needs to run.  For instance, what if we wanted to count the number of words that a user entered?
---
An algorithm like this should work!

- Ask the user to enter a sentence

- Read the input with our scanner

- while there is a next token on the scanner, pop it off the scanner and add one to our count
---
Being able to loop whether or not we know how many times we must repeat is powerful.
---
```for``` loops are another type of loop that we see in most languages.  The ```for``` loop is typically used when we want to iterate over some collection.

These loops have the form:

```Java
for(preliminary setup, condition, post){
  CODE BLOCK
}
```
---
For instance, what if we wanted to copy a string character by character into another string?
---
A string is just a collection of chars.  We can tell how many chars long a string is by calling the string's ```size()``` method.  Then we just need to read the character at that position from the first string and put it in the second.
---
Since we know how long a string is as soon as it is entered we can copy it by iterating over the collection and copy each character:

```Java
public String copyString(String one){
  String two = "";
  for(int i=0; i<one.length; ++i){}
    two = two + one.charAt(i);
  }
  return two;
}
```
---
By the way, don't copy a string that way in Java.  There are better built-in methods.  This one is pretty slow (anyone want to guess why?).
---
```for``` loops are probably the most used of the loop constructs.  We iterate over things a LOT.  Even though we could use a ```while``` loop instead, the ```for``` loop is just considered better practice for iterating over fixed sizes.
---
Let's play with this one a bit as well!

Soon we are going to see something called an ArrayList<>.  ArrayLists hold collections of information.  For instance, if you had 1000 Student objects you could hold them all in an ArrayList object for easy management.
---
Here we are going to create an ArrayList<String> - that is an ArrayList that holds String objects.  Then, let's iterate over them with a for loop!

```Java
import java.util.ArrayList;

public class ListAllStrings {
  public static void main(String[] args){
    ArrayList<String> allMyStrings = new ArrayList<String>();

    // For loop to create the strings and add them
    // to the ArrayList.
    for(int i=0; i<1000; ++i){
      String namelessStringToAdd = "I am String " + i + "!";
      allMyStrings.add(namelessStringToAdd);
    }
    // For loop to iterate over the list and print each one.
    for(int i=0; i<1000; ++i){
      System.out.println(allMyStrings.get(i));
    }
  }
}
```
---
Now again, we could do the same thing with the ```while``` loop;

```Java
int i=0;
while(i<1000){
  System.out.println(allMyStrings.get(i));
  ++i;
}
```

But it feels more natural with the for loop (probably because we can merge multiple lines into 1).
---
There is an alternative syntax in Java for ```for``` loops called the ```foreach``` loop.  When you want to iterate over some collection and you don't care about the numeric position of each element, you can do the following:

```Java
for(String str:allMyStrings){
  System.out.println(str);
}
```
---
The syntax for this ```foreach``` loop is as follows:

```Java
for(TypeOfObjectInCollection temporaryName:collectionName){
  Code block.  Use temporaryName to access the current object in this block.
}
```
---
Let's try this one!

Imagine you have an ArrayList<Student> called students.

- Write code to create a thousand new, empty Students in the list

- Use the ```for``` loop, not the ```foreach```
---
Now that you have created the Students, let's iterate back over them and modify their content.  Pretend that the Student class has a ```setName(String name)``` function.  Use the ```foreach``` loop to change the name of every student to "Jane Doe".
---
