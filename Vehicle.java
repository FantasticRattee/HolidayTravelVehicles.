public class Vehicle {
    private int serialNumber;
    private String vehicleName;
    private String vehicleModel;
    private int vehicleYear;
    private String manufacturer;
    private double cost;

    private Invoice invoice; 


    //  Constructor
    public Vehicle(int serialNumber, String vehicleName, String vehicleModel, 
                   int vehicleYear, String manufacturer, double cost) {
        this.serialNumber = serialNumber;
        this.vehicleName = vehicleName;
        this.vehicleModel = vehicleModel;
        this.vehicleYear = vehicleYear;
        this.manufacturer = manufacturer;
        this.cost = cost;
    }


    // ✅ Getters and Setters
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public int getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(int vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    // ✅ ToString method (useful for debugging/printing)
    @Override
    public String toString() {
        return "Vehicle [serialNumber=" + serialNumber + 
               ", vehicleName=" + vehicleName + 
               ", vehicleModel=" + vehicleModel + 
               ", vehicleYear=" + vehicleYear + 
               ", manufacturer=" + manufacturer + 
               ", cost=" + cost + "]";
    }
}
