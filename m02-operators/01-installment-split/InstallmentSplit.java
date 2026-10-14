void main() {
    int totalCents = 1000;
    int installments = 7;

    int each = totalCents / installments;      // 142
    int leftover = totalCents % installments;  // 6

    IO.println(each);
    IO.println(leftover);
    IO.println(each * installments + leftover); // 1000

    double average = 7 / 2;
    IO.println(average); // 3.0
}