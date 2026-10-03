void main() {
    int limit = 500;
    int used = 180;
    int pending = 70;
    int available = limit - used - pending;
    int percentUsed = used * 100 / limit;
    IO.println(available);
}