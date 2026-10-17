void main() {

    // The first condition prevents division by zero.
    int totalCents = 120000;
    int installments = 0;

    boolean valid = installments > 0 && totalCents % installments == 0;

    IO.println(valid);

    //Reverse condition order
    // Uncommenting the next line causes ArithmeticException because the remainder operator is evaluated with zero.
    // boolean invalid = totalCents % installments == 0 && installments > 0;
}