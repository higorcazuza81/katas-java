void main() {
    int basePrice = 1000;
    int discount = basePrice * 10 / 100;
    int finalPrice = basePrice - discount;
    IO.println(finalPrice);
}