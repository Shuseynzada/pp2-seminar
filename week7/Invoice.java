public class Invoice {
    private String partNumber, partDescription;
    private int quantity;
    private double price;

    Invoice(String partNumber, String partDescription, int quantity, double d){
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if(quantity > 0) this.quantity = quantity;
        else throw new IllegalArgumentException("Quantity cannot be negative number");

        if(d > 0) this.price = d;
        else throw new IllegalArgumentException("Price cannot be negative number");
    }

    String getPartNumber(){
        return this.partNumber;
    }
    void setPartNumber(String s){
        this.partNumber = s;
    }

    String getPartDescription(){
        return this.partDescription;
    }
    void setPartDescription(String s){
        this.partDescription = s;
    }

    int getQuantity(){
        return this.quantity;
    }
    void setQuantity(int x){
        if(quantity > 0) this.quantity = x;
        else throw new IllegalArgumentException("Quantity cannot be negative number");
    }

    double getPrice(){
        return this.price;
    }
    void setPrice(double x){
        if(price > 0) this.price = x;
        else throw new IllegalArgumentException("Price cannot be negative number");
    }

    double getInvoiceAmount(){
        return price * quantity;
    }

}
