void main() {
    // Exercise 1: Bitwise operators
    int a = 12;
    int b = 10;

    IO.println("Exercise 1:");
    IO.println("a & b = " + (a & b));
    IO.println("a | b = " + (a | b));
    IO.println("a ^ b = " + (a ^ b));

    // Exercise 2: Bit shifts
    IO.println("\nExercise 2:");
    IO.println("1 << 4 = " + (1 << 4));
    IO.println("48 >> 3 = " + (48 >> 3));

    // Exercise 3: Toggle a bit with XOR
    int flags = 0;

    IO.println("\nExercise 3:");
    flags = flags ^ 8;
    IO.println(flags);

    flags = flags ^ 8;
    IO.println(flags);

    // Exercise 4: Bitwise AND and comparison
    IO.println("\nExercise 4:");
    IO.println((10 & 2) != 0);

    // Uncomment the next line to observe the compilation error:
    // IO.println(10 & 2 != 0);  // error: java: bad operand types for binary operator '&' first type:  int second type: boolean
}
