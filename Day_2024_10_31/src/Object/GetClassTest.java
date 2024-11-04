package Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClassTest {
    public static void main(String[] args) {
        Human kim = new Human("Kim Sang-Hyeong", 29);

        // Class's full path
        Class cls = kim.getClass();
        System.out.println(cls.getName());

        // Class's Parent class
        Class superCls = cls.getSuperclass();
        System.out.println(superCls.getName());

        // Field
        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }

        // Class's Method
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }

}
