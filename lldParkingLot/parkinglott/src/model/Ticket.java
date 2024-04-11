package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Ticket {
   private int id ;
   private String entryTime;
   private Vehicle vehicle;
   private ParkingSlot parkingSlot;

//   public void someting(){
//      setParkingSlot(new FourWheelerParkingSlot());
//   }
}
