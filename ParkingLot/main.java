public class main {
   //car class
    private String registrationNumber;
    private String color;

    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public String getColor(){return  color;}
    public void Car(final String registrationNumber , final String color){
        this.registrationNumber = registrationNumber;
        this.color= color;

    }
}
