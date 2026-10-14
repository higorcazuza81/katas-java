void main() {
    int servers = 4;
    int request = 10;
    int server = request % servers;       // 2
    IO.println(server);

    int accountNumber = 90346;
    int lastDigit = accountNumber % 10;   // 6
    int withoutLast = accountNumber / 10; // 9034
    IO.println(lastDigit);
    IO.println(withoutLast);

    IO.println(-9 / 4); // -2
    IO.println(-9 % 4); // -1
}