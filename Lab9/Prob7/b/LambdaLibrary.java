package Lab9.Prob7.b;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Mekuanent Kassaye on 2019-03-18.
 */
public class LambdaLibrary {

    public static final Predicate<Employee> EMPLOYEE_PREDICATE = e -> {
        if(e.getLastName() == null || e.getLastName().length() == 0) return false;
        int ch = e.getLastName().charAt(0);
        return e.getSalary() > 100000 && ((ch > 77 && ch < 91) || (ch > 109 && ch < 123));
    };

    public static final Function<Employee, String> EMPLOYEE_STRING_FUNCTION = x -> x.getFirstName() + " " + x.getLastName();

    public static final Function<List<Employee>, String> EMPLOYEE_FILTER = list -> list.stream()
            .filter(EMPLOYEE_PREDICATE)
            .map(EMPLOYEE_STRING_FUNCTION)
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.joining(", "));

}
