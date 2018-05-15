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
When writing a program we have to specify EVERY variable that will be used.  Nothing is given to us automatically or happens without us specifying it explicitly.
---
Computers give their memory areas addresses.  A memory address may look like

```
1000100000000111010100001111100010100010000010101111111100001010
```

(though you would usually see it expressed in hexadecimal notation: ```0x880750F8A20AFF0A```).
---
Computers work with addresses very easily.  Humans do not.  Therefore, in the context of a program we alias addresses with names (preferably easy to remember ones!).

Most of the time in programming (always in Java) the address is hidden from us.  We use the name.
---
For instance, we may store values in a variable called ```age``` for a person's age, or ```GPA``` for a student's GPA.

These names are for our benefit.  In truth they just slow the computer down.
---
Java requires us to tell the system what type of information we are going to store in our variable and which other objects are able to access the variable.

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
Additionally, you may have noticed that I didn't assign any values in the above declarations.  This brings up an important point - we can declare a variable without putting anything in it.

This means we must be certain a variable contains a value before we use it.
---
Most different types of information require a different amount of memory to store; storing the age of a person shouldn't require the same amount of memory that storing a list of a thousand phone numbers, or even a Student object requires.  We tell the system what type of data we wish to store (partly) to allow the system to know how much memory to reserve.
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
---
So, we can create a class (a new data type) that is made up of the following:

```Java
public class Vehicle {
  private int numberOfWheels;
  private float gasMileage;

  public void calculateMileage(float milesTraveled, float gallonsUsed){
    gasMileage = milesTraveled / gallonsUsed;
  }
}
```
---
Our Vehicle class is a new type of data.  It is made up of other types of data.  We could even create a different class such as a Garage class that uses Vehicle now that we have blueprinted it.
---
Let us look at our Vehicle class again though.  There is more going on there than you may initially suspect:
---
What are the variables used in this program?

```Java
public class Vehicle {
  private int numberOfWheels;
  private float gasMileage;

  public float calculatePrice(float milesTraveled, float pricePerGallon){
    float pricePaid = (milesTraveled / gasMileage) * pricePerGallon;
    return pricePaid;
  }
}
```
---
There are 5 variables used in this program:

- ```private int numberOfWheels```
- ```private float gasMileage```
- ```float milesTraveled```
- ```float pricePerGallon```
- ```float pricePaid```

How do these differ?
---
The first two have **access modifiers**.  An access modifier tells Java "who" is able to access and modify the variable.

There are several access modifiers and we will go through those later.  For now, just learn this rule:
---
In general, and as much as is possible, an object should be the only entity able to modify its own data.

Because of this rule we will - most of the time - mark a variable as ```private```.  This means that only the object itself is responsible for its own data.
---
**Caveat!** It turns out that for a variety of reasons other objects of the same type can change an object's data as well.  We will largely ignore this possibility in this class, and for the immediate future you can forget I said it...
---
I can't reinforce strongly enough how important it is for an object to be the only entity that can change the state of its variables.  This leads to much, much more secure programming and easier debugging.
---
So we noticed that in the example above some variables have access modifiers and some do not.

If you recall Lab One I noted that an object has state and behavior.  An object's state is kept in variables called **instance variables**.  Instance variables hold the data that makes up what an object is.
---
Instance variables require us to have access modifiers.  We want to be able to say if other objects should be able to change our state or not.

For instance, consider a human object.

Another human or other object should not be able to walk up to us and change our name.
---
Instance variables for an object can always be seen inside the instance of the object.  All the methods or functions (the behavior code) has the ability to access and change it.
---
So what are the other variables for?
---
All the other variables are local variables.  Local variables are only able to be seen by the code block they are declared in (within the '{}' they are declared in).

```milesTraveled``` and ```pricePerGallon``` are local variables used to send information to the ```calculatePrice``` function.  ```pricePaid``` is a local variable used to store the result of a calculation.
---
While ```numberOfWheels``` and ```gasMileage``` can be seen anywhere in the object, the other three can only be seen inside the ```calculatePrice``` function.
---
