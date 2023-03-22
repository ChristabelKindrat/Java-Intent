package lesson1;

public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println(PrimeNumbers.primeNumbers());

        //task2
        ToFahrenheit convert1 = new ToFahrenheit();
        System.out.print(convert1.convert(20));

        ToKelvin convert2 = new ToKelvin();
        System.out.print(convert2.convert(20));

        //task3
        Box box = new Box(1000.0);
        System.out.println(box.add(new Sphere(10)));
        System.out.println(box.add(new Cuboid(20, 30, 40)));
        System.out.println(box.add(new Cylinder(5, 10)));
    }
}
