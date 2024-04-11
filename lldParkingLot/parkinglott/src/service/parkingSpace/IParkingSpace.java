package service.parkingSpace;

import model.ParkingSlot;

import java.util.List;

public interface IParkingSpace {
 ParkingSlot find(List<ParkingSlot> parkingSlotList);

}
