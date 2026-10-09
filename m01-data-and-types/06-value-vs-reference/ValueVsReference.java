void main() {
    // Value
    int a = 5;
    int b = a;
    b = 10;
    IO.println(a); // 5, unaffected

    IO.println();

    // Reference: different String objects
    String firstBalance = new String("balance");
    String secondBalance = new String("balance");

    IO.println(firstBalance == secondBalance);       // false, different objects
    IO.println(firstBalance.equals(secondBalance));  // true, same content

    IO.println();

    // String pool: the same literal is reused
    String literalBalance = "balance";
    String sameLiteralBalance = "balance";

    IO.println(literalBalance == sameLiteralBalance);       // true, same object from the string pool
    IO.println(literalBalance.equals(sameLiteralBalance));  // true, same content

    IO.println();

    // User input
    String typedBalance = IO.readln("Type the word balance: ");

    IO.println(typedBalance == "balance");       // Do not rely on reference identity
    IO.println(typedBalance.equals("balance"));  // Compares content
}