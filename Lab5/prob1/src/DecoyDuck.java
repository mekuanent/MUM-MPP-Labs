public class DecoyDuck extends Duck{


    public DecoyDuck(){
        super(BehaviorFactory.getQuackBehavior(BehaviorFactory.MUTE_QUACK), 
        BehaviorFactory.getFlyBehavior(BehaviorFactory.CANNOT_FLY));
    }

    public void display(){
        System.out.println("\tdisplaying");
    }
}