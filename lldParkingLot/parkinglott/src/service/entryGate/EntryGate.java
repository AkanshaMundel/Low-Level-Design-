package service.entryGate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.ParkingSlot;
import model.Ticket;
import model.Vehicle;
import service.parkingSlot.ParkingSlotManager;
import service.parkingSpace.Default;
import service.parkingSpace.IParkingSpace;
import service.ticket.TicketParkingSlotMapper;

import java.beans.VetoableChangeListener;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class EntryGate {

// public EntryGate(IParkingSpace parkingSpace, List<ParkingSlot> slots, TicketParkingSlotMapper ticketParkingSlotMapper){
//    this.parkingSlotManger = new ParkingSlotManager(parkingSpace,slots);
//    this.ticketParkingSlotMapper = ticketParkingSlotMapper;
// }
public EntryGate(ParkingSlotManager parkingSlotManager, TicketParkingSlotMapper ticketParkingSlotMapper){
    this.parkingSlotManger = parkingSlotManager;
    this.ticketParkingSlotMapper = ticketParkingSlotMapper;
}
   Ticket ticket ;
   ParkingSlotManager parkingSlotManger;
   ParkingSlot parkingSlot;
   Vehicle vehicle;

   TicketParkingSlotMapper ticketParkingSlotMapper;
   // generating new ticket

 public void generateTicket(Vehicle v){
  this.vehicle= v;
  ticket = new Ticket();
  ticket.setVehicle(vehicle);
  ticket.setEntryTime(String.valueOf(Math.random()));
  ticket.setParkingSlot(parkingSlot);
  ticketParkingSlotMapper.addSlot(ticket,parkingSlot);
 }

 //instance of manager
 //slot ->
private void findParkingSpace() {
 this.parkingSlot = parkingSlotManger.findParkingSlot();
}

public  void bookParkingSpace(Vehicle vehicle){
     findParkingSpace();// we get parking slot
     this.parkingSlotManger.parkVehicle(vehicle, parkingSlot);// vehicle is parked
     generateTicket(vehicle);// ticket is generated.
}

}
/*
calling everything of manger herre only
 */