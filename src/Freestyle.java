public class Freestyle extends Snowboard {
    public void speed(){
        System.out.println("Speed is doesn't matter in Freestyle.");
    }

    @Override
    public void weight() {
        super.weight();
        double maxWeight = 1.6;
        System.out.println("Max weight of freestyle snowboard is " +maxWeight);

    }
}