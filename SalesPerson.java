import java.util.ArrayList;

public class SalesPerson {
    private String employeeID;
    private String name;

    private ArrayList<Invoice> invoices = new ArrayList<>(); 

        // Constructor
    public SalesPerson(String employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }
}