void main() {
    long balanceInCents = 1250005;
    long reais = balanceInCents / 100;
    long cents = balanceInCents % 100;

    System.out.printf("Balance: R$ %d,%02d%n", reais, cents);
}