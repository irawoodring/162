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
