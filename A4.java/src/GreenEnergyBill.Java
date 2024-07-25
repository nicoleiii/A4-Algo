import java.util.Scanner;

public class GreenEnergyBill extends EnergyBill {
    private double costsolarenergy;

    public GreenEnergyBill(String name, String address, double electricitykwh, double gasunits, double solarEnergy) {
        super(name, address, electricitykwh, gasunits);
        this.costsolarenergy = solarEnergy;
    }
    public double calculateDeduction() {
        double solarRate = 0.02; 
        return costsolarenergy * solarRate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name?: ");
        String name = scanner.nextLine();

        System.out.println("Address?: ");
        String address = scanner.nextLine();

        System.out.println("Usage for electricity?: ");
        double electricitykwh = scanner.nextDouble();

        System.out.println("Usage for gas?: ");
        double gasunits = scanner.nextDouble();

        System.out.println("Total solar constribution?: ");
        double solarEnergy = scanner.nextDouble();

        super(name, address, electricitykwh, gasunits);
        this.costsolarenergy = solarEnergy;
    }
    public void totalbill() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Electricity and Gas Charges: $" + chargesElectricity() + chargesGas());
        System.out.println("Total: $" + chargesTotal());
        
    }
}
