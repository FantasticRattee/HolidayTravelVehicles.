import java.util.ArrayList;

public class TradeInVehicle {
    private String serialNumber;
    private String tradeManufacturer;
    private String model;
    private int year;
    private double tradeInPrice;

    private ArrayList<Invoice> invoices = new ArrayList<>();

    

        // Constructor
    public TradeInVehicle(String serialNumber, String tradeManufacturer, String model, int year, double tradeInPrice) {
        this.serialNumber = serialNumber;
        this.tradeManufacturer = tradeManufacturer;
        this.model = model;
        this.year = year;
        this.tradeInPrice = tradeInPrice;
    }

        // ✅ Getters
    public String getSerialNumber() {
        return serialNumber;
    }

    public String getTradeManufacturer() {
        return tradeManufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getTradeInPrice() {
        return tradeInPrice;
    }

}