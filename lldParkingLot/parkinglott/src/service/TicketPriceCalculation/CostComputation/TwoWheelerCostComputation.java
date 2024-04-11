package service.TicketPriceCalculation.CostComputation;

import model.Ticket;
import service.TicketPriceCalculation.PriceStrategy.HourlyStrategy;
import service.TicketPriceCalculation.PriceStrategy.PricingStrategy;

public class TwoWheelerCostComputation  extends CostComputation{
    public TwoWheelerCostComputation(Ticket ticket) {
        super(ticket,new HourlyStrategy(ticket));
    }
}

/*



*/