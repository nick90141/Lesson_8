package task_5;

import java.util.Objects;

public class Animal {

    public String name;
    public int age;
    public Boolean tail;

    public Animal (String name, int age, Boolean tail){
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getTail() {
        return tail;
    }

    public void setTail(Boolean tail) {
        this.tail = tail;
    }

    @Override
    public String toString () {
        return "Ім'я: " +  name + ", вік: " + age + ", хвіст: " + (tail? "так" : "ні");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return getAge() == animal.getAge() && Objects.equals(getName(), animal.getName()) && Objects.equals(getTail(), animal.getTail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getTail());
    }
}
