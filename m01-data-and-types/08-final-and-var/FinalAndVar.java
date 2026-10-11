void main() {
    final double IOF_RATE = 0.0038;
    final int MAX_LOAN_TERM_MONTHS = 60;

    var loanTermMonths = 36;
    double principalAmount = 8500.75;
    var borrowerName = "Carlos Mendes";

    double loanWithIof = principalAmount * (1 + IOF_RATE);

    IO.println(IOF_RATE);
    IO.println(MAX_LOAN_TERM_MONTHS);
    IO.println(loanTermMonths);
    IO.println(principalAmount);
    IO.println(borrowerName);
    IO.println(loanWithIof);

    // IOF_RATE = 0.005; // compile error: cannot assign a value to final variable
}
