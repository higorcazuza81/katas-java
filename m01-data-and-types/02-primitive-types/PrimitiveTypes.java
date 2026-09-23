void main() {
    byte installments = 12;
    short currencyCode = 986;
    int balance = 1500;
    long amountInCents = 1250000L;
    float interestRate = 2.5f;
    double installmentAmount = 1041.67;
    char approval = 'Y';
    boolean approved = true;

    IO.println("byte installments: " + installments);
    IO.println("short currencyCode: " + currencyCode);
    IO.println("int balance: " + balance);
    IO.println("long amountInCents: " + amountInCents);
    IO.println("float interestRate: " + interestRate);
    IO.println("double installmentAmount: " + installmentAmount);
    IO.println("char approval: " + approval);
    IO.println("boolean approved: " + approved);

    IO.println();

    IO.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
    IO.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
    IO.println("Long.MAX_VALUE: " + Long.MAX_VALUE);
    IO.println("Byte.MAX_VALUE: " + Byte.MAX_VALUE);
}