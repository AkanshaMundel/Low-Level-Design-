package service.exitGate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.ParkingSlot;
import model.Ticket;
import service.TicketPriceCalculation.CostComputation.CostComputation;
import service.TicketPriceCalculation.CostComputation.CostComputationFactory;
import service.parkingSlot.ParkingSlotManager;
import service.parkingSpace.IParkingSpace;
import service.ticket.TicketParkingSlotMapper;
@AllArgsConstructor
@Getter
@Setter
public class ExitGate {
Ticket ticket;
ParkingSlotManager parkingSlotManager;
TicketParkingSlotMapper ticketParkingSlotMapper;



public int priceCalculation(){
    CostComputationFactory factory = new CostComputationFactory();
    CostComputation costComputation = factory.getCostComputation(ticket);
    return costComputation.price();
}


public void removeVehicle(){
    ParkingSlot parkingSlot = ticketParkingSlotMapper.getSlot(ticket);
    ticketParkingSlotMapper.ticketAndSlotMap.remove(ticket);
    parkingSlotManager.removeVehicle(parkingSlot);
}

// need to remove the vechicle and assign slot
//    Track


}
