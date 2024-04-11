package model;

import enums.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

 public class Vehicle {
    private String vehicleNumber;
     private VehicleType vtype;
     private User user;//composition

}
