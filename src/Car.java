public class Car extends Vehicles{
    @Override
    public void Start() {
        System.out.println("Start car");
    }

    @Override
    public void Stop() {
        System.out.println("Stop car");
    }

    @Override
    public void accelerate() {
        System.out.println("Vroooom");
    }
}
