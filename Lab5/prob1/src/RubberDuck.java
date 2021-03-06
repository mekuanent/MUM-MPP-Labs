public class RubberDuck extends Duck{

    public RubberDuck(){
        super(BehaviorFactory.getQuackBehavior(BehaviorFactory.SQUEAK), 
        BehaviorFactory.getFlyBehavior(BehaviorFactory.CANNOT_FLY));
    }

    public void display(){
        System.out.println("\tdisplaying");
    }
}