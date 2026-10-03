void main() {
    int balance = 1000;
    int fee = 15;
    int deposits = 3;
    int charge = fee * deposits;
    int total = balance - charge;
    IO.println(total);
}