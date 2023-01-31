import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car car1){
        inventory.add(car1);
    }

    public boolean swap(int car1, int car2){
        if (car1 < inventory.size() && car2 < inventory.size()){
            Car temp1 = inventory.get(car2);
            Car temp2 = inventory.get(car1);
            inventory.set(car2, temp2);
            inventory.set(car1, temp1);
            return true;
        }
        return false;
    }
}
