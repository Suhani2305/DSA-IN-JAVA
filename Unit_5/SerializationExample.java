package Unit_5;

import java.io.*;

// Serializable class
class Person implements Serializable {
    // serialVersionUID for version control
    private static final long serialVersionUID = 1L; // Version control ke liye, taaki future changes ke baad bhi object deserialize ho sake.

    // Properties
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class SerializationExample {
    public static void main(String[] args) {

        // Create object
        Person p1 = new Person("Alice", 30);

        // 1. Serialization (Object -> File)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            oos.writeObject(p1);
            System.out.println("Object Serialized Successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Deserialization (File -> Object)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person p2 = (Person) ois.readObject(); // Cast back to Person
            System.out.println("Object Deserialized Successfully.");
            p2.display(); // Display restored object data
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
