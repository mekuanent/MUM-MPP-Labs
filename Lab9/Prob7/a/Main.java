package Lab9.Prob7.a;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		System.out.println(
				list.stream().filter(e -> {
			if(e.getLastName() == null || e.getLastName().length() == 0) return false;
			int ch = e.getLastName().charAt(0);
			return e.getSalary() > 100000 && ((ch > 77 && ch < 91) || (ch > 109 && ch < 123));
		}).map(x -> x.getFirstName() + " " + x.getLastName()).sorted(Comparator.naturalOrder())
				.collect(Collectors.joining(", "))
		);
	}

}
