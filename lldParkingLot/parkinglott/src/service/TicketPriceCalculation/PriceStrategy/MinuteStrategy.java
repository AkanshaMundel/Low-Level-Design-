package service.TicketPriceCalculation.PriceStrategy;

import model.Ticket;

public class MinuteStrategy  extends PricingStrategy{
    public MinuteStrategy(Ticket ticket) {
        super(ticket);
    }
    public int price(){
        return 10;
    }
}
