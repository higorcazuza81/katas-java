void main() {
    int x = 50;
    x += 25;
    x *= 2;
    x -= 30;
    x /= 4;
    x %= 7;
    IO.println(x); // 2

    int fee = 100;
    fee *= 1.15;     // compiles: hidden cast to int
    IO.println(fee); // 114, not 115
    // fee = fee * 1.15; // error: incompatible types: possible lossy conversion from double to int
}