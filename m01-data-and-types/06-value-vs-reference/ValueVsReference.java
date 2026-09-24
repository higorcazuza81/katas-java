void main() {
    // Value
    int a = 5;
    int b = a;
    b = 10;
    IO.println(a); // 5, unaffected

    IO.println();

    // Reference

    String x = new String("balance");
    String y = new String("balance");

    IO.println(x == y);        // false, different objects in memory
    IO.println(x.equals(y));   // true, same content

    IO.println();


    // test to observe string pool case
    String w = "balance";
    String z = "balance";

    IO.println(w == z);        // true
    IO.println(w.equals(z));   // true, repurposing of an object
    
}