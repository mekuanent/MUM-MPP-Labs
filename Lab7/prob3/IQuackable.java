public interface IQuackable{
    default void quack(){
        System.out.println("\tquacking");
    }
}