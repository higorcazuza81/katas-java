void main() {
    String customer = IO.readln("Customer name: ");
    String rawCount = IO.readln("TEDs this month: ");

    int count = Integer.parseInt(rawCount);  // the text becomes a number here, and only here.
    int feeInCents = 850;
    int totalInCents = count * feeInCents;

    IO.println(customer + " pays " + totalInCents + " cents");
}