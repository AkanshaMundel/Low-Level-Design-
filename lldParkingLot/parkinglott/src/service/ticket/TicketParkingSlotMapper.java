package service.ticket;

import enums.VehicleType;
import model.ParkingSlot;
import model.Ticket;
import model.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketParkingSlotMapper {
    public HashMap<Ticket, ParkingSlot>  ticketAndSlotMap= new HashMap<>();
    //add slot

    public void addSlot(Ticket ticket , ParkingSlot parkingSlot){
        ticketAndSlotMap.put(ticket, parkingSlot);
    }

    public ParkingSlot getSlot(Ticket ticket){
        return ticketAndSlotMap.get(ticket);
    }

    public List<Ticket> getWheeler(VehicleType type){
        List<Ticket> list = new ArrayList<>();
        //finding totl ticket of same  vechicle type
        for(Map.Entry<Ticket, ParkingSlot> entry: ticketAndSlotMap.entrySet()){
            Ticket ticket = entry.getKey();
            Vehicle vehicle = ticket.getVehicle();
            VehicleType vehicleType = vehicle.getVtype();
            if(type.equals(vehicleType)){
                list.add(ticket);
            }
        }
        return list;
    }
}
