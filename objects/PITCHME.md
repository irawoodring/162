---
CIS 162 - Chapter 4 - Objects

Rodd Lowell & Ira Woodring
---
Let's recap!
---
As we talked about before, computers are very simple machines.  They only understand the concept of switches - either electricity is coming through a circuit or it isn't.
---
To make communicating with computers simpler we gave certain combinations and sequences of switches names that represented higher level ideas.  Incrementation for instance:

```
a = a + 1;
```

is a high level idea that a compiler converts into the switching a computer understands.
---
The original programs (and many that came much later - even some today!) were just lists of higher level commands.  This works, but can be hard to follow for humans.  When we program with just lists of commands it is called **Imperative Programming.**
---
For instance, if we want to write a program that keeps track of assets for a bank there needs to be code for dealing with customer accounts, business accounts, government accounts, and a host of specializations (CDs, Money Market Accounts, etc.).

An imperative version of this program would have all of this code in a single code base.
---
For a computer this is fine.  But humans don't think that way.  Human minds tend to get confused easily when too many details are present.

Imperative programming works, but it can lead to more bugs.
---
**Object Oriented Programming (OOP)** was created to address this concern.  Instead of writing huge bodies of code that do a lot of different things, we instead focus on smaller areas of concern.

We write a class that handles customer accounts, another that handles business accounts, etc.
---
This means that all of the code for a specific area of concern is grouped together in one place.  This is a much more natural way for humans to imagine programs.  Each class is responsible for its own data - its own areas of concern.
---
For example, let's assume we wanted to create a simple program like Blackboard.  We might need to keep track of student information, professor information, course information, etc.
---
Besides the fact that this makes organizing our programs easier and more intuitive, we also gain data protection abilities.

OO languages (like Java) provide access controls.  This means that a student object can be prevented from changing data housed in a professor object or vice versa.
---
This is something that is hard (or even impossible) to do with imperative programming.  If all of the code and variables are in the same place then any part of the code can modify any other part.
---
Let's practice this way of thinking a bit!

With the other students in your row, consider the following ideas for programs.  What are some of the areas of concern we might need for each?
---
A database of animal information for a zoo.
---
A library inventory system.
---
A contact management system.
---
Each of the areas of concern you noted can be modeled with a class and created as an object.
---
Remember, a **class** is a blueprint for an object.  It is just a model.

We **instantiate** a class to create an object.  This means that we tell the computer to build one based on the blueprint.

Once we have a blueprint we can instantiate as many objects as we want from it.
---
So, in our banking example, we might have a class for an account.  An account object should hold name, contact, and balance information.  A banking program should have multiple instances of the account class - at least one for each customer of the bank.
---
In Java, a class goes in a file called NameOfTheClass.java.  Our banking example might have an Account.java file.  Inside the file, all of the information about the class must be enclosed in the following code:

```Java
public class Account {

}
```
---
This is called a class definition.  All code that pertains to this class will go inside the class definition.  The only code that does not go inside the class definition is import statements.
---
Each object needs to hold information.  An account class might house the following information:

```Java
customerName  - A String
accountNumber - An int
balance       - A double
```
---
These pieces of information should be available throughout the entire class.  Each instance has the same variables but different values.  Bill Gates and I should be able to each have an account at a bank with different values held in his object than my object.
---
We call this data that is available to the entire class to be an **instance variable** or a **field**.

They are variables, but they are variables that can be accessed anywhere inside the code for this class.
---
Other variables that get used inside of the code - but aren't accessible throughout all the code for the class - are **local variables**.
---
Together, the instance variables make up the **state** of an object.  Once again, we can create multiple different objects from a class.  Each object can store the same types of state information but each will (likely) hold different values.
---
An object also has **functions** or **methods**.  These are pieces of code that define how an object can perform some task.  Together, all the functions of a class makeup its **behavior**.
---
So a **class** is a blueprint used to create **objects**.  **Objects** have **state** and **behavior**.
---
One of the most important functions that a class defines is the **constructor**.  This is a function that sets up the initial state of the object.
---
A constructor always has the same name as the function.  For instance, for our Account class above we might have a constructor like the following:

```
public Account() {

}
```
---
This constructor is sort of worthless though... no code so it doesn't do anything.  Let's assume our Account looks like this:
---
```Java
public class Account {

  private String customerName;
  private int accountNumber;
  private double accountBalance;

}
```

This class has three pieces of state.  We have declared the variables we want to use but we didn't actually create them yet.  We should change our constructor to set the initial values of our variables:
---
```Java
public class Account {

  private String customerName;
  private int accountNumber;
  private double accountBalance;

  public Account(){
    customerName = new String();
    accountNumber = 0;
    accountBalance = 0.0;
  }
}
---
We create a variable by calling its constructor.  We do this with the ```new``` keyword.  For instance, we might create a String object with the following:

```Java
String myString = new String();
```
---
If we wanted to create a new instance of an Account we would want to type something like this:

```Java
Account irasAccount = new Account();
Account billsAccount = new Account();
```
---
If we wanted, we could pass information to a constructor as well.  For instance, if we wanted to setup the initial values when we created the Account, we could have a constructor that looks like this:
---
```Java
public class Account {

  private String customerName;
  private int accountNumber;
  private double accountBalance;

  public Account(String customerName, int accountNumber, double accountBalance){
    this.customerName = customerName;
    this.accountNumber = accountNumber;
    this.accountBalance = accountBalance;
  }
}
```
---
We would then create an object like this:

```Java
Account irasAccount = new Account("Ira Woodring", 12938475, 32.75);
Account billsAccount = new Account("Bill Gates", 1838495, 4392847223.12);
```
---
Interestingly enough, a class can provide more than one constructor.  This allows us to create objects in different ways to suit our needs.
