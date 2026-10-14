void main() {
    int amountCents = 50000;                      // R$ 500,00
    int feeCents = amountCents > 50000 ? 350 : 0; // fee only above R$ 500,00
    IO.println(feeCents);                          // 0

    int balanceCents = -1200;
    IO.println(balanceCents < 0 ? "OVERDRAWN" : "OK"); // OVERDRAWN

    IO.println(true ? 1 : 2.0);                    // 1.0, not 1

    int x = 7;
    int r = (x % 2 == 0) ? x / 2 : x * 3 + 1;
    IO.println(r);  // 22

    IO.println(false ? 10 : 2.5);  // 2.5
    IO.println(true ? 10 : 2.5);   // 10.0

}