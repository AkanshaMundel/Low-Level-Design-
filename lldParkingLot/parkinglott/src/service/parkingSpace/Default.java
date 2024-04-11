package service.parkingSpace;

import com.sun.source.tree.TryTree;
import model.ParkingSlot;

import java.util.List;

public class Default implements IParkingSpace {

    @Override
    public ParkingSlot find(List<ParkingSlot> parkingSlotList) {
        try{
            if(parkingSlotList.isEmpty()){
                throw new Exception("NO PARKING SPACE FORM ");
            }
            for(ParkingSlot parkingSlot : parkingSlotList){
                if(parkingSlot.isEmpty()){
                    return parkingSlot;
                }
            }
        }
        catch(Exception e){
            System.out.println("No no parking spce found");
            return null;
        }


        return null;
    }

}
