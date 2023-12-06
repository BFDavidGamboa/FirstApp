# Java

## To start:

### Acronyms  

- JDK: Java Development Kit
- JRE: Java Runtime Environment
- IDE: Integrated Development Environment

### Order of run and develop

IDE -> JDK -> Java App ->> JRE -> Host Environment 

Java App -> JRE -> Host Environment 


### Packages 
- For packages, you should provide more organization
- For Standard naming convention 
- Affect source code structure

#### Packages Naming Conventions
- All lowercase
- Use reverse domain name notation to assure global uniqueness
- Add further qualifiers to assure uniqueness within a company or group

#### Type Names are qualified by their packages

## Summary

### Programs made up of a statements
- Statements end with a semicolon 
- Parts separated by zero or more whitespaces

### Comments 
- Allow human - readable notes
- Hide statements from the compiler

### Packages 
- Provide type uniqueness
- Source code file structure tied to package name

# Variables

- Strongly typed
- By default can be modified
- Mark as final to prevent modification

 They can be declared as type and it's name or
# Primitive Types 

- Integer Types
- Floating point types
- Character Type
- Boolean Types

# Math Operators
- Basic Operators
- Postfix/prefix operators
- Compound assignment operators

# Math operator precedence 
- Well - defined order of precedence
- Evaludated left-to-right when tied
- Can override with parenthesis

## Implicirt type conversion
- Widenign conversions are performed automatically 

## Explicit type conversion 
- Use cast operator
- Can be widening or narrowing
- Be aware of potential effects

## The var keyword 
- Type Inferred by initial assignment 
- The variable is statically typed
 
```java
int sum;
int studentAccount;
int bankAccountBalance;
int level2Training;
int myVar;
```

Also it can be as var and be used in this order

```java
myVar = 50;
```

```java
System.out.println(anotherVar);
final int maxStudents = 25;
final int someVariable;
int someOtherVariable= 100;
```

## Java Types
```java
byte numberOfEnglishLetters= 25;
short feetInAMile = 5280;
int  milesToSun = 92960000;
long milesInALightYear = 5879000000000L;
float KilometersInAMarathon = 42.195f;
float absoluteZerInCelcius = -273.15f;
double atomWidthInMeters = 0.000000001d;
char regularU = 'U';
char accentedU = '\u00DA';
```
## Primitive types are sorted by value

```java
int firstValue = 100;
int otherValue = firstValue;
firstValue = 50;
otherValue = 70;
```

### Arithmetic Operators

- Basic: Produce a result
  - No impackt on values used in the operations

- Prefix/postfix: increase or decrease a value
  - Replace original value

- Compound assignment:
  - Operate on a value


```java
int someValue = 5;
System.out.println(++someValue);
System.out.prinln(someValue);
//This is equal to 6

int someItherValue = 5;
System.out.println(someItherValue++); //This equal to 5
System.out.println(someItherValue); //This is equal to 6
```

```java
int myValue = 50;
myValue -= 5;
System.out.println(myValue);
int myOtherValue = 100;
int val1 = 5;
int val2 = 10;
myOtherValue /= val1 * val2;
System.out.println(/myOtherValue); //This is equal to 6

```

## Operator Precedence 

- Postfix: X++, X---
- Prefix: ++X, --X
- Multiplicative * / %
- Additive + -

### Operators of equal precedence evaluated left-to-right
### Can override precedence with parenthesis
### Nested parenthesis evaluated from inside out


## Types conversion
### Implicit type conversion
- Mixed integer size: Uses largest integer in equation
- Mixed floating point sizes: Uses double
- Mixed integer and floating point : Uses largest floating point in equation

## Explicit type Conversion
- Narrowing conversion: significant bits may be discarded
- Floating point to integer: Fractional portion is discarded
- Integer to floating point: Precision may be lost 



