public class Motorcycle extends Vehicles{
    @Override
    public void Start() {
        System.out.println("Start motorcycle");
    }

    @Override
    public void Stop() {
        System.out.println("Stop motorcycle");
    }

    @Override
    public void accelerate() {
        System.out.println("Vroooom");
    }
}
