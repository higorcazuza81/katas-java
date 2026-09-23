void main() {
    int maximumAccountBalanceInCents = Integer.MAX_VALUE;
    int overflowedAccountBalanceInCents = maximumAccountBalanceInCents + 1;
    byte maximumInterestRateBasisPoints = Byte.MAX_VALUE;
    byte overflowedInterestRateBasisPoints = (byte) (maximumInterestRateBasisPoints + 1);

    IO.println("Maximum account balance in cents: " + maximumAccountBalanceInCents);
    IO.println();
    IO.println("Overflowed account balance in cents: " + overflowedAccountBalanceInCents);
    IO.println();
    IO.println("Maximum interest rate basis point: " + maximumInterestRateBasisPoints);
    IO.println();
    IO.println("Overflowed interest rate basis point: " + overflowedInterestRateBasisPoints);

}