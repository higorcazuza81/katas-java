void main() {
    String rawNetWorthInCents = IO.readln("Net worth in cents: ");
    String rawUnitholders = IO.readln("Unitholders: ");

    long netWorthInCents = Long.parseLong(rawNetWorthInCents);
    int unitholders = Integer.parseInt(rawUnitholders);

    long averageAssetsPerUnitholder = netWorthInCents / (unitholders == 0 ? 1 : unitholders); // Business rule: without shareholders, treat as 1.

    IO.println("Average assets per unitholder: " + averageAssetsPerUnitholder + " cents");
}