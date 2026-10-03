void main() {
    int price = 200;
    int discountPercent = 10;
    int discount = price * discountPercent / 100; // percent -> fraction of price
    int total = price - discount;
    IO.println(total);
}