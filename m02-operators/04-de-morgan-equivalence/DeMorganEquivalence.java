void main() {
    int a = 5;
    int b = 0;
    boolean original = !(a >= 10 || b == 0);
    boolean rewritten = a < 10 && b != 0;
    IO.println("a=" + a + " b=" + b + " original=" + original + " rewritten=" + rewritten + " same=" + (original == rewritten));

    a = 10;
    b = 3;
    original = !(a >= 10 || b == 0);
    rewritten = a < 10 && b != 0;
    IO.println("a=" + a + " b=" + b + " original=" + original + " rewritten=" + rewritten + " same=" + (original == rewritten));

    a = 5;
    b = 3;
    original = !(a >= 10 || b == 0);
    rewritten = a < 10 && b != 0;
    IO.println("a=" + a + " b=" + b + " original=" + original + " rewritten=" + rewritten + " same=" + (original == rewritten));

    a = 10;
    b = 0;
    original = !(a >= 10 || b == 0);
    rewritten = a < 10 && b != 0;
    IO.println("a=" + a + " b=" + b + " original=" + original + " rewritten=" + rewritten + " same=" + (original == rewritten));
}