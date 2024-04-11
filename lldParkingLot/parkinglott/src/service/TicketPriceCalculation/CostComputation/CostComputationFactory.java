package service.TicketPriceCalculation.CostComputation;

import enums.VehicleType;
import model.Ticket;
import model.Vehicle;

public class CostComputationFactory {
    //vehicle type k
    public CostComputation getCostComputation(Ticket ticket) {
        if (ticket.getVehicle().getVtype().equals(VehicleType.TWO_WHEELER)) {
            return new TwoWheelerCostComputation(ticket);

        } else if (ticket.getVehicle().getVtype().equals(VehicleType.FOUR_WHEELER)) {
            return new FourWheelerCostComputation(ticket);
        }
        return null;
    }
}

/*
vechicle type -> with pricing
 */