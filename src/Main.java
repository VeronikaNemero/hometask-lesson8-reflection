import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Apple apple = new Apple();
        Field field = Apple.class.getDeclaredField("name");
        field.setAccessible(true);
        field.set(apple, "red");
        System.out.println(field.get(apple));
    }
}
