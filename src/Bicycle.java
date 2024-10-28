public class Bicycle extends Vehicles{
    @Override
    public void Start() {
        System.out.println("Drive bicycle");
    }

    @Override
    public void Stop() {
        System.out.println("Stop bicycle");
    }

    @Override
    public void accelerate() {
        System.out.println("Peda");
    }
}
