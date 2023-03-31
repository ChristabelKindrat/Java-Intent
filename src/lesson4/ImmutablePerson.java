package lesson4;

public class ImmutablePerson {
    @ReadOnly(message = "This name can't be changed! Name: ")
    private final String name;
    @ReadOnly(message = "This age can't be changed! Age: ")
    private final int age;

    ImmutablePerson(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void getName() throws NoSuchFieldException {
        ReadOnly annotation = ImmutablePerson.class.getDeclaredField("name").getAnnotation(ReadOnly.class);
        System.out.println(annotation.message() + name);
    }

    public void getAge() throws NoSuchFieldException {
        ReadOnly annotation = ImmutablePerson.class.getDeclaredField("age").getAnnotation(ReadOnly.class);
        System.out.println(annotation.message() + age);
    }
}
