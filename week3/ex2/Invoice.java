package week3.ex2;
public class Invoice {
    private String partNumber, partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double d){
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if(quantity > 0) this.quantity = quantity;
        else throw new IllegalArgumentException("Quantity cannot be negative number");

        if(d > 0) this.price = d;
        else throw new IllegalArgumentException("Price cannot be negative number");
    }

    public String getPartNumber(){
        return this.partNumber;
    }
    public void setPartNumber(String s){
        this.partNumber = s;
    }

    public String getPartDescription(){
        return this.partDescription;
    }
    public void setPartDescription(String s){
        this.partDescription = s;
    }

    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int x){
        if(quantity > 0) this.quantity = x;
        else throw new IllegalArgumentException("Quantity cannot be negative number");
    }

    public double getPrice(){
        return this.price;
    }
    public void setPrice(double x){
        if(price > 0) this.price = x;
        else throw new IllegalArgumentException("Price cannot be negative number");
    }

    public double getInvoiceAmount(){
        return price * quantity;
    }

}
