void main() {
    int a = 17;
    int b = 5;
    int c = 3;

    int e1 = a / b * c;           // Prediction: 17 / 5 = 3; 3 * 3 = 9

    int e2 = a % b + c * 2 - 1;   // Prediction: 17 % 5 = 2; 3 * 2 = 6; 2 + 6 - 1 = 7

    int n = 4;
    int e3 = n++ + ++n;           // Prediction: n++ returns 4, n becomes 5; ++n makes n = 6 and returns 6; 4 + 6 = 10

    IO.println(e1);               // Prediction: 9
    IO.println(e2);               // Prediction: 7
    IO.println(e3);               // Prediction: 10
    IO.println(n);                // Prediction: 6
}
