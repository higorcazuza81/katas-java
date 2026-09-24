void main() {
    String customerName = "James Gosling";
    String originalReceipt = """
            Receipt
            Customer: %s
            Amount: R$ 100.00
            """.formatted(customerName);
    String modifiedReceipt = originalReceipt.toUpperCase();

    IO.println(originalReceipt);
    IO.println();
    IO.println(modifiedReceipt);
}