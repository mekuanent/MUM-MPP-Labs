package exercise7;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by Mekuanent Kassaye on 2019-03-13.
 */
public class MyClass {

    int x, y;

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void myMethod(MyClass mc){

        Function<MyClass, Boolean> func = this::equals;
        boolean res = func.apply(mc);
        System.out.println(res);

    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MyClass)
            return ((MyClass)obj).x == x && ((MyClass)obj).y == y;
        return false;
    }
}
