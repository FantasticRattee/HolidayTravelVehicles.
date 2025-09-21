import java.util.ArrayList;

public class Dealer {
    private String optionCode;
    private String description;
    private double price;

    private ArrayList<Invoice> invoices = new ArrayList<>();
    

    
    // Constructor
    public Dealer(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }

    
}
