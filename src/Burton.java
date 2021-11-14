public class Burton extends Freestyle {
    public String color;
    public int height;

    public void speed() {
        System.out.println("Speed is doesn't matter in Freestyle.");
    }

    @Override
    public void weight() {
        super.weight();
        double burtonWeight = 1.3;
        System.out.println("Burton snowboards is lightest in the World!");

    }
}
