public class Car extends Vehicle {

    @Override
    public void run(){
        System.out.println("woof");
    }

    @Override
    public double getFuelConsumption() {
        return 10;
    }
}
