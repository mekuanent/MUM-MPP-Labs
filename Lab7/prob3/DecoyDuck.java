public class DecoyDuck implements IDuck{

    @Override
    public void quack(){
        System.out.println("\tcannot quack");
    }

    @Override
    public void fly(){
        System.out.println("\tcannot fly");
    }
}