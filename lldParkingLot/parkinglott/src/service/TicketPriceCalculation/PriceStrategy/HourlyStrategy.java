package service.TicketPriceCalculation.PriceStrategy;

import model.Ticket;

public class HourlyStrategy extends PricingStrategy {

         // need to create the constructor
        public HourlyStrategy(Ticket ticket) {
            super(ticket);
        }
        public int price(){
            return 40;
            //entrytime * current time hours
        }

}
