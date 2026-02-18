# Implement Fraction Class in Kotlin

## Seminar Outcomes

In this assignment, you will implement a `Fraction` class in Kotlin that represents mathematical fractions and supports various operations. Additionally, you will write a comprehensive test suite to verify the correctness of your implementation. This exercise will cover:

* Encapsulation
* Operator overloading
* Custom constructors
* Unit Testing and Test Coverage

---

## Task 1: Define the `Fraction` Class

Create a class named `Fraction` that stores:

* `numerator: Int`
* `denominator: Int`

---

## Task 2: Implement Constructors

### Constructor 1: Accepting Two Parameters

```kotlin
Fraction(numerator: Int, denominator: Int)

```

* Must validate that the denominator is not zero (throw an `IllegalArgumentException` if zero).

### Constructor 2: Accepting a Single Integer Parameter

```kotlin
Fraction(numerator: Int)

```

* The denominator defaults to `1`.

### **Bonus Task**: Constructor Accepting a Double Value

```kotlin
Fraction(value: Double)

```

* Converts a double value into a fraction (e.g., `7.5` → `15/2`).

---

## Task 3: Implement `toString()` Method

* Returns the fraction in the format: `"numerator/denominator"`.

---

## Task 4: Implement Custom Getters

Define getters that print a message before returning the value:

* **For numerator:** Prints `"This is a numerator: [value]"`
* **For denominator:** Prints `"This is a denominator: [value]"`

---

## Task 5: Implement Arithmetic Operators

Overload the following operators for `Fraction`:

* Addition (`+`)
* Subtraction (`-`)
* Multiplication (`*`)
* Division (`/`)

*Note: Ensure the result of these operations returns a new `Fraction` object.*

---

## Task 6: Implement Equality and Comparison

Implement the following methods:

* `equals()`: Checks if two fractions are mathematically equal (e.g., `1/2` should equal `2/4`).
* `compareTo()`: Allows fraction comparison (enables sorting and usage of `<`, `>`, etc.).

---

## Task 7: Write Unit Tests

Create a test class (e.g., `FractionTest`) using **JUnit**. You must implement tests that cover **all** features of the class.

**Your tests must cover:**

1. **Constructor Logic:**
* Verify correct initialization for all constructors.
* **Negative Test:** Verify that passing `0` as a denominator throws an exception.


2. **Simplification:**
* Verify that `Fraction(2, 4)` is stored effectively as `1/2` (if implementing the simplification bonus).


3. **Arithmetic Operations:**
* Test `+`, `-`, `*`, and `/` with various inputs (positive, negative, zero numerator).


4. **Equality:**
* Verify `equals()` works for different representations of the same value.


5. **Comparisons:**
* Verify `compareTo()` correctly identifies larger and smaller fractions.


6. **Bonus Features:**
* If implemented, test the `Double` constructor and `toDecimal()` extension.



---

## Bonus Tasks

* Ensure all fractions are stored in their **simplified form** immediately upon initialization (e.g., `20/15` → `4/3`).
* Implement an **extension function** `toDecimal()` that converts a fraction to its decimal form.