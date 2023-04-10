package lesson4;

public class ImmutablePerson {
    @ReadOnly(message = "This name can't be changed! ")
    private final String name;
    @ReadOnly(message = "This age can't be changed! ")
    private final int age;

    ImmutablePerson(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName() throws NoSuchFieldException {
        return name;
    }

    public int getAge() throws NoSuchFieldException {
        return age;
    }
}
