package service.TicketPriceCalculation.CostComputation;

import lombok.AllArgsConstructor;
import model.Ticket;
import service.TicketPriceCalculation.PriceStrategy.PricingStrategy;
@AllArgsConstructor
public class CostComputation {
    private Ticket ticket;
    private PricingStrategy pricingStrategy;


   public int price(){
       return this.pricingStrategy.price();
   }

}
