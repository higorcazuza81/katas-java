void main() {
    int a = 5;
    int b = 0;

    IO.println(b != 0 && a / b > 1);    // false, right side not evaluated
    IO.println(b == 0 || a / b > 1);    // true, right side not evaluated
    // IO.println(a / b > 1 && b != 0); // throws ArithmeticException: a / b runs first
    IO.println(!(a > 3 && b > 3));      // true
}