import java.util.ArrayList;

public class Customer {
    private int customerID;
    private String customerName;
    private String customerAddress;
    private int customerPhone;

    private ArrayList<Invoice> invoices = new ArrayList<>(); 



    public Customer(int customerID, String customerName, String customerAddress, int customerPhone) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
    }

        // ✅ Getters
    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

}