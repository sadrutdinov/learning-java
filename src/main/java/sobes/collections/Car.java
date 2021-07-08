package sobes.collections;

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Car)) {
            return false;
        }

        Car car = (Car) obj;

        return name.equals(car.name);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    // у одинковых объектов должен быть одинковый хэшкод
    // но при этом у разных объектов может совпасть хэшкод
    public int hashCode() {
        return name.hashCode();
    }
}
