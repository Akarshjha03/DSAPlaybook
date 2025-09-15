# 🧮 Basic Math Problems in Java

This repository contains solutions to several basic mathematical problems in Java, such as finding divisors, checking prime numbers, reversing numbers, Armstrong numbers, and more.
Most of these problems revolve around manipulating digits of a number using modulus (%) and division (/) operations.

## 🔑 Core Logic

The recurring logic for digit-based problems is:

```java
int digit = n % 10;          // Extracts the last digit
int rev = rev * 10 + digit;  // Builds the new number (reverse, sum, etc.)
n = n / 10;                  // Removes the last digit
````

### This approach is used for:
1. Reversing numbers
2. Checking Armstrong numbers
3. Digit sum problems
4 .Palindrome numbers

## 📚 Problems Covered

- ✅ Find the HCF (Highest Common Factor)
- ✅ Check Armstrong numbers
- ✅ Print all divisors of a number
- ✅ Check prime numbers
- ✅ Reverse a number
- ✅ Sum of digits of a number
- ✅ Palindrome number check
