import java.util.ArrayList;
import java.util.Date;

public class Invoice {
    private String invoiceID;
    private Date date;
    private double negotiatePrice;
    private double taxes;
    private double licenseFees;
    private double finalPrice;

    // Associations
    private Customer customer;            // Each invoice has 1 customer
    private SalesPerson salesperson;      // Each invoice has 1 salesperson
    private Vehicle vehicle;              // Each invoice has 1 vehicle
    private TradeInVehicle tradeInVehicle; // Each invoice can have 1 trade-in vehicle

    private ArrayList<Dealer> dealers = new ArrayList<>(); // multiple dealers possible
    
    
    

    // Parameterized constructor with all main attributes
    public Invoice(String invoiceID, Date date, double negotiatePrice, double taxes,
                   double licenseFees, double finalPrice,
                   Customer customer, SalesPerson salesperson,
                   Vehicle vehicle, TradeInVehicle tradeInVehicle) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.negotiatePrice = negotiatePrice;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.finalPrice = finalPrice;
        this.customer = customer;
        this.salesperson = salesperson;
        this.vehicle = vehicle;
        this.tradeInVehicle = tradeInVehicle;
    }

     // ✅ Getters
    public String getInvoiceID() {
        return invoiceID;
    }

    public Date getDate() {
        return date;
    }

    public double getNegotiatePrice() {
        return negotiatePrice;
    }

    public double getTaxes() {
        return taxes;
    }

    public double getLicenseFees() {
        return licenseFees;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public SalesPerson getSalesperson() {
        return salesperson;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public TradeInVehicle getTradeInVehicle() {
        return tradeInVehicle;
    }

}