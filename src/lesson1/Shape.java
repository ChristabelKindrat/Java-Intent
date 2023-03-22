package lesson1;

public abstract class Shape {
    protected double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}

 class Box {
    private double availableVolume;

    public Box(double availableVolume) {
        this.availableVolume = availableVolume;
    }

    public boolean add(Shape shape) {
        if (availableVolume >= shape.getVolume()) {
            availableVolume -= shape.getVolume();
            return true;
        }
        return false;
    }
}

 class Sphere extends Shape {
    public Sphere(double radius) {
        super((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
    }
}

class Cylinder extends Shape {
    public Cylinder(double radius, double height) {
        super(Math.PI * Math.pow(radius, 2) * height);
    }
}

class Cuboid extends Shape {
    public Cuboid(double length, double width, double height) {
        super(length * width * height);
    }
}
