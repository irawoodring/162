---
CIS 162 - Variables

Rodd Lowell & Ira Woodring
---
When you are solving a problem you keep multiple values in your mind.

Research has shown that humans can hold around 7 values in our mind at once.
---
For instance, I may ask you to solve the equation ```y = 6x + 7``` with an ```x``` value of ```3```.

In your mind you would hold the values 6, 3, and 7 and would manipulate those mentally to arrive at an answer.  At some point you would temporarily store 18 (the ```6 * 3```) as well.
---
Computers also need to be able to store values while they are solving problems.  These values may be numbers, strings, or other objects.  The computer may also need temporary storage to hold an intermediate value in a calculation - much like in the above scenario.
---
We don't need to worry about how to access the values in our memory - the values are just there when we need them.  It is all rather automatic.
---
Computers give their memory areas addresses.  A memory address may look like

```
1000100000000111010100001111100010100010000010101111111100001010
```

(though you would usually see it expressed in hexadecimal notation: ```0x880750F8A20AFF0A```).
---
Computers work with addresses very easily.  Humans do not.  Therefore, in the context of a program we alias addresses with names (preferably easy to remember ones!).
---
For instance, we may store values in a variable called ```age``` for a person's age, or ```GPA``` for a student's GPA.

Remember, these names are for our benefit.  In truth they just slow the computer down.
---
Java also requires us to tell the system what type of information we are going to store in our variable and which other objects are able to access the variable.

We do all of this in the **variable declaration**.
---
Declaring a variable tells the system we wish to use to create a variable.  Declarations may look like the following:

```Java
public int x;
private float pi;
private Student hank;
Car toyota;
int age;

etc...
```
---
You likely noticed that some of the above declarations include the words "public" and "private".  These are **access modifiers** and we will discuss them shortly.  For now, let's concentrate on the data type modifiers.
---
Most different types of information require a different amount of memory to store; storing the age of a person shouldn't require the same amount of memory that storing a list of a thousand phone numbers, or even a Student object.  We tell the system what type of data we wish to store (partly) to allow the system to know how much memory to reserve.
---
Every class that you create in Java is considered a new data type.  Data types are composed of other data types.  Some basic data types are built in to Java:
---
| Type | Description |
|------|-------------|
| byte | Holds integer values between -128 and 127 |
| short | Holds integer values between -32,768 and 32,767 |
| int | Holds integer values between -2^31 and (2^31)-1 |
| long | Holds integer values between -2^63 and (2^63)-1 |
| float | Holds floating point numbers with single-precision |
| double | Holds floating point numbers with double-precision |
| boolean | Holds either true or false |
| char | holds a 16-bit Unicode character, from '\u0000' to '\uffff' |
