package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

abstract public class ParkingSlot {
    private int id;
    private boolean isEmpty = true;
    private int price;
    private Vehicle vehicle;


    abstract  int getPrice();

    public void parkVehicle(Vehicle v){
        this.setVehicle(v);
        setEmpty(false);
    }

    public void removeVehicle(){
        setEmpty(true);
        this.setVehicle(null);
    }


}
/*
no object creatin , 'need to make the child class

 */