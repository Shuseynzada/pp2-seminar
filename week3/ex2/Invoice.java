package week3.ex2;

public class Invoice {
    private String partNumber, partDescription;
    private int quantity;
    private double price;

    Invoice(String partNumber, String partDescription, int quantity, int price){
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if(quantity > 0) this.quantity = quantity;
        else this.quantity = 0;

        if(quantity > 0) this.price = price;
        else this.price = 0.0;
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
        this.quantity = x;
    }

    double getPrice(){
        return this.price;
    }
    void setPrice(double x){
        this.price = x;
    }

    double getInvoiceAmount(){
        return price * quantity;
    }

}
