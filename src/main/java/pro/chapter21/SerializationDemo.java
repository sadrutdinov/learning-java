package pro.chapter21;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {


        // произвести сериализацию объекта (запись в файл)
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/test.txt"))) {
            MyClass object1 = new MyClass("Aydar", 22, 17.5);
            System.out.println("object1: " + object1);
            objectOutputStream.writeObject(object1);


        } catch (IOException e) {
            e.printStackTrace();
        }

        // провести десереализацию проекта (чтение из файла)
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/test.txt"))){
            MyClass object2 = (MyClass) objectInputStream.readObject();
            System.out.println("object2: " + object2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

class MyClass implements Serializable {
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "s=" + s + ", i=" + i + ", d=" + d;
    }
}
