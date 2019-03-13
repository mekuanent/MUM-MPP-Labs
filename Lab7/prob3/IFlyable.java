public interface IFlyable{
    default void fly(){
        System.out.println("\tfly with wings");
    }
}