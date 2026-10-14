void main() {
    int n = 7;
    int m = n++ * 2;

    IO.println(n);  // 8
    IO.println(m);  // 14

    int x = 5;
    x = x++;

    IO.println(x);  // 5

    int c = 0;
    c++;
    c++;
    ++c;
    --c;

    IO.println(c);  // 2

    int p;
    int q;
    p = q = 4;

    IO.println(p + q); // 8

    int s = 10;
    int t = s-- - 3;

    IO.println(s);  // 9
    IO.println(t);  // 7

    int u = 4;
    u = ++u;

    IO.println(u);  // 5

    int d = 5;
    d--;  // 4
    d--;  // 3
    --d;  // 2
    ++d;  // 3

    IO.println(d);  // 3
}