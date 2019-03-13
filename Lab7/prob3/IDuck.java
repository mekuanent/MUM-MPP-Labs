public interface IDuck extends IFlyable, IQuackable{
    default void display(){
        System.out.println("\tdisplaying");
    }
}