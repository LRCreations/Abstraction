abstract public class Bike {
    abstract void ride();
}
class HondaDio extends Bike {
    @Override
    void ride() {
        System.out.println("Ride Safely!");
    }

    public static void main(String[] args) {
        Bike b = new HondaDio();
        b.ride();
    }
}