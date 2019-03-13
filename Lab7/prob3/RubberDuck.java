public class RubberDuck implements IDuck{

    @Override
    public void quack(){
        System.out.println("\tsqueaking");
    }

    @Override
    public void fly(){
        System.out.println("\tcannot fly");
    }

}