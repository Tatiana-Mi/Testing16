package Ticket;

public class TicketPrice {
    private int age;
    private int basePrice;

    public TicketPrice(int age, int basePrice) {
        this.age = age;
        this.basePrice = basePrice;
    }
    public double calculate(){
        if(this.age<=2){
            return 0;
        }
        if(this.age<13){
            return this.basePrice*0.5;
        }
        if (this.age>65){
            return this.basePrice*0.8;
        }
        return this.basePrice;
    }
}
