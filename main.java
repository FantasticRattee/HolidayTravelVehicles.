public class main {
    public static void main(String[] args) {
        
        //add vehicle
Vehicle vehicle = new Vehicle(1, "G-Wagon", "G63", 2025, 
                              "Mercedes-Benz", 20000000.00);
Customer customer = new Customer(101, "John Doe", "123 Main Street", 123456789);
SalesPerson salesperson = new SalesPerson("SP001", "Alice Johnson");
TradeInVehicle tradeIn = new TradeInVehicle("T12345", "Toyota", "Camry", 2018, 800000);
Invoice invoice = new Invoice("INV001", new java.util.Date(), 
                            19000000, 500000, 20000, 
                            19520000 - tradeIn.getTradeInPrice(),
                            customer, salesperson, vehicle, tradeIn);

    // Print the details (assuming you have getters)
        System.out.println("Vehicle Created:");
        System.out.println("Serial Number: " + vehicle.getSerialNumber());
        System.out.println("Name: " + vehicle.getVehicleName());
        System.out.println("Model: " + vehicle.getVehicleModel());
        System.out.println("Year: " + vehicle.getVehicleYear());
        System.out.println("Manufacturer: " + vehicle.getManufacturer());
        System.out.println("Cost: $" + vehicle.getCost());
    

        System.out.println("\nInvoice with Trade-in Created:");
        System.out.println("Invoice ID: " + invoice.getInvoiceID());
        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Bought Vehicle: " + vehicle.getVehicleName());
        System.out.println("Traded Vehicle: " + tradeIn.getModel());
        System.out.println("Final Price after Trade-in: $" + invoice.getFinalPrice());
}
}
