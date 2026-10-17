void main() {
    // Exercise 1: Rounding methods
    IO.println(Math.round(7.5));  //8
    IO.println(Math.round(-7.5)); // -7
    IO.println(Math.floor(-1.1)); // -2.0
    IO.println(Math.ceil(-1.1));  // -1.0

    // Exercise 2: Calculate the number of pages
    int itemsPerPage = 25;

    // Test 1: 130 items
    int items = 130;
    int pagesWithIntegers = (items + itemsPerPage - 1) / itemsPerPage;
    double division = (double) items / itemsPerPage;
    int pagesWithCeil = (int) Math.ceil(division);

    IO.println("130 items:");
    IO.println("Integer calculation: " + pagesWithIntegers);
    IO.println("Math.ceil calculation: " + pagesWithCeil);

    // Test 2: 125 items
    items = 125;
    pagesWithIntegers = (items + itemsPerPage - 1) / itemsPerPage;
    division = (double) items / itemsPerPage;
    pagesWithCeil = (int) Math.ceil(division);

    IO.println("125 items:");
    IO.println("Integer calculation: " + pagesWithIntegers);
    IO.println("Math.ceil calculation: " + pagesWithCeil);

    // Test 3: 126 items
    items = 126;
    pagesWithIntegers = (items + itemsPerPage - 1) / itemsPerPage;
    division = (double) items / itemsPerPage;
    pagesWithCeil = (int) Math.ceil(division);

    IO.println("126 items:");
    IO.println("Integer calculation: " + pagesWithIntegers);
    IO.println("Math.ceil calculation: " + pagesWithCeil);

    // Exercise 3: Type conversion with Math.round()
    // int r = Math.round(2.6); // Compilation error: incompatible types: possible lossy conversion from long to int
}