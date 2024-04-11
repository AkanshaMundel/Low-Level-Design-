package service.TicketPriceCalculation.CostComputation;

import model.Ticket;
import service.TicketPriceCalculation.PriceStrategy.MinuteStrategy;
import service.TicketPriceCalculation.PriceStrategy.PricingStrategy;

public class FourWheelerCostComputation extends CostComputation{

    public FourWheelerCostComputation(Ticket ticket) {
        super(ticket, new MinuteStrategy(ticket));
    }
}
/*
can send the hourly based too
 */