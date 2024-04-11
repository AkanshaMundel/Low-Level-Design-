package service.parkingSlot;

import model.ParkingSlot;
import model.Vehicle;
import service.parkingSpace.Default;
import service.parkingSpace.IParkingSpace;
import service.parkingSpace.NearestToEnd;
import service.parkingSpace.NearestToEntrance;

import java.util.*;

public class ParkingSlotManager {
   List<ParkingSlot> parkingSlots;
   IParkingSpace parkingSpace;
//   NearestToEnd nearestToEnd = new NearestToEnd();

   //runtime -> constructor injection
   //
   public ParkingSlotManager(IParkingSpace parkingSpace,  List<ParkingSlot> parkingSlots){
      this.parkingSpace = parkingSpace;
      this.parkingSlots = parkingSlots;
   }



   //find
   public ParkingSlot findParkingSlot(){
      return this.parkingSpace.find(parkingSlots); // need to call from entry gate

   }

   //add
   public void addParkingSpace(ParkingSlot parkingSlot){
      this.parkingSlots.add(parkingSlot);
   }
   //remove
   public void removeParkingSpace(ParkingSlot parkingSlot){
      this.parkingSlots.remove(parkingSlot);
   }
   //park vehicle

   //calling in entry gate

   public void  parkVehicle(Vehicle vehicle,ParkingSlot parkingSlot){
     // parkingSlots.remove(parkingSlot);
      parkingSlot.parkVehicle(vehicle);
   }

   // remove vehicle
   public void removeVehicle(ParkingSlot parkingSlot){
      parkingSlot.removeVehicle();
   }

}

/*
2 w -> netto end

 */


//class Driver{
//   public void something(){
//      ParkingSlotManager parkingSlotManager = new ParkingSlotManager(new Default());
//
//   }
//}