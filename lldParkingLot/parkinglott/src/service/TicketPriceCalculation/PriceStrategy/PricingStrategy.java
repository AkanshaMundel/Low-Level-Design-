package service.TicketPriceCalculation.PriceStrategy;

import model.Ticket;

public abstract class PricingStrategy {
    Ticket ticket;
    public  PricingStrategy(Ticket ticket){
        this.ticket= ticket;
    }
    public int price(){
        return 30;// fixed pricing
    }


}

/*
abstract -> when want default implementation
no object formaation

 */