public class RedheadDuck extends Duck{


    public RedheadDuck(){
        super(BehaviorFactory.getQuackBehavior(BehaviorFactory.QUACK), 
        BehaviorFactory.getFlyBehavior(BehaviorFactory.FLY_WITH_WINGS));
    }

    public void display(){
        System.out.println("\tdisplaying");
    }
}