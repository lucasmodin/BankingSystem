import java.util.Date;

public class Transactions {
    private String type;
    private double amount;
    private Date timestamp;


    public Transactions(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = new Date();
    }


    //------------------------- Getters & Setters ----------------------------
    public Date getTimestamp() {
        return timestamp;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setType(String type) {
        this.type = type;
    }
}
