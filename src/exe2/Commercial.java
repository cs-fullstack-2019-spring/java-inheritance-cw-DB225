package exe2;

public class Commercial extends Building{
    private int howManyFloors;
    private Boolean hasParkingLot;
    private Boolean hasInspection;
    private int taxRate;

    public Commercial(int howManyFloors, Boolean hasParkingLot, Boolean hasInspection, int taxRate) {
        this.howManyFloors = howManyFloors;
        this.hasParkingLot = hasParkingLot;
        this.hasInspection = hasInspection;
        this.taxRate = taxRate;
    }

    @Override
    public String toString() {
        return "This building has "+howManyFloors +" and "+taxRate+" as tax rate."+"...."+hasInspection+","+hasParkingLot;
    }
}
