import enums.VehicleType;
import model.*;
import service.entryGate.EntryGate;
import service.exitGate.ExitGate;
import service.parkingSlot.ParkingSlotManager;
import service.parkingSpace.Default;
import service.ticket.TicketParkingSlotMapper;

import java.util.List;

public class ParkingSlotRunner {
    public static void main(String[] args){
        User user = new User();
        user.setId(1);
        user.setName("akansha ");
        Vehicle vehicle = new Vehicle();
        vehicle.setUser(user);
        vehicle.setVtype(VehicleType.TWO_WHEELER);

        ParkingSlot parkingslot = new TwoWheelerParkingSlot();
        parkingslot.setEmpty(true);
        parkingslot.setId(1);

        ParkingSlot parkingslot1 = new TwoWheelerParkingSlot();
        parkingslot1.setEmpty(true);
        parkingslot1.setId(2);

        List<ParkingSlot> ls = List.of(parkingslot1, parkingslot);
        //reason to make it gobal so tht can use in entry and exit
        TicketParkingSlotMapper ticketParkingSlotMapper = new TicketParkingSlotMapper();
        //need to create manager gobally so tht can we use exit too
        //before will created on entry code  as paaing new Default() as strategy is default first find space and put

        ParkingSlotManager parkingSlotManager = new ParkingSlotManager(new Default(),ls);
        EntryGate e = new EntryGate(parkingSlotManager,ticketParkingSlotMapper);
        //ticket -> parking slot (vechicle , typw , isempty)
        e.bookParkingSpace(vehicle);


        //now exit gate
        ExitGate exit = new ExitGate(e.getTicket(),parkingSlotManager, ticketParkingSlotMapper);
        int price =  exit.priceCalculation();
        System.out.println("Price for parking -> "+ price);
        exit.removeVehicle();




    }
}
