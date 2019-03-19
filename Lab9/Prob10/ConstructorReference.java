package Lab9.Prob10;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
	@FunctionalInterface
	public interface TriFunction<T, U, V, R>{

		R apply(T x, U y, V z);

	}
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};
	
    // Query 1  : Print only Female canditates names
	Arrays.stream(list).filter(h -> h.gender.equals("Female"))
			.forEach(System.out::println);

    // Query 2 : Cretae an objecy by choosing suitable Interface to the specified constructors(Totally 3 constuctors)using fouth type of Method Reference ClassName::new. Then print the object status 

	Function<String, Human> cons1 = Human::new;
	System.out.println(cons1.apply("Mekuanent"));
	BiFunction<String, Integer, Human> cons2 = Human::new;
	System.out.println(cons2.apply("John", 143));
	TriFunction<String, Integer, String, Human> cons3 = Human::new;
	System.out.println(cons3.apply("Lily", 21, "Female"));

	// Query 3 : Count the male candidates whose age is more than 30

	System.out.println(
			Arrays.stream(list).filter(h -> h.age > 30).count()
	);
    
   }



}
