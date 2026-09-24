void main() {
    int wholeAmount = 1500;
    double amountAsDouble = wholeAmount; // widening, automatic, no data loss
    IO.println(amountAsDouble); // 1500.0

    double preciseRate = 2.75;
    int truncatedRate = (int) preciseRate; // narrowing, manual cast required
    IO.println(truncatedRate);

    int wholeUnits = 10;
    double average = wholeUnits / 3; // int / int = int division first: 3
    double correctAverage = wholeUnits / 3.0; //one operand double promotes the whole expression
    IO.println(average);        // 3.0
    IO.println(correctAverage); // 3.3333333333333335
}