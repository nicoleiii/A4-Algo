public class EnergyBill {
    private final String name;
    private final String address;
    private final double electricitykwh;
    private final double gasunits;

    public EnergyBill(String name, String address, double electricitykwh, double gasunits) {
        this.name = name;
        this.address = address;
        this.electricitykwh = electricitykwh;
        this.gasunits = gasunits;
    }

    public double chargesElectricity() {
        return this.electricitykwh * 0.12;
    }

    public double chargesGas() {
        return this.gasunits * 1.10;
    }

    public double chargesTotal() {
        return chargesElectricity() + chargesGas();
    }
}
