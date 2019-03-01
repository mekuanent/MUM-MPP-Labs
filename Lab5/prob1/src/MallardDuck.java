public class MallardDuck extends Duck{
    
    public MallardDuck(){
        super(BehaviorFactory.getQuackBehavior(BehaviorFactory.QUACK), 
        BehaviorFactory.getFlyBehavior(BehaviorFactory.FLY_WITH_WINGS));
    }

    @Override
    public void display(){
        System.out.println("\tdisplay");
    }
}