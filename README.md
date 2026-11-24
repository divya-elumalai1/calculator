# Calculator

A small Java calculator. Each operation is its own program and reads two whole numbers from the keyboard.

## Programs

| File | Operation |
| --- | --- |
| `Addition.java` | Adds the two numbers |
| `Subtraction.java` | Subtracts the second number from the first |
| `Multiplication.java` | Multiplies the two numbers |
| `Division.java` | Divides the first number by the second |

Division prints `Cannot divide by zero` when the second number is `0`. Division uses whole numbers, so the remainder is dropped. For example, `7 / 2` prints `3`.

## Run

You need a JDK installed. From this folder:

```bash
javac Addition.java
java Addition
```

Use the same two commands for `Subtraction`, `Multiplication`, and `Division`.
