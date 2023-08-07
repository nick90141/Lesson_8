package task_5;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Васька", 45, false);
        System.out.println(animal.toString());

        Animal animal1 = new Animal("Васька", 4, false);
        Animal animal3 = new Animal("Петька", 16, true);

        System.out.println(animal1.equals(animal3));
        System.out.println((animal1.hashCode() == animal3.hashCode()));
    }
}
