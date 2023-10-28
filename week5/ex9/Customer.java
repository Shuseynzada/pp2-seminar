public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender){
        this.id = id;
        this.name = name;
        if(gender == 'm' || gender == 'w') this.gender = gender;
        else System.out.println("No gender found");
    }
    public Customer(Customer customer){
        this.id = customer.id;
        this.name = customer.name;
        this.gender = customer.gender;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public char getGender(){
        return this.gender;
    }

    public String toString() {
        return this.name+"("+this.id+")";
    }
}
