public class Animal {
    public String name;
    public int age;

    public int compareTo(Animal o) {
        return age - o.age;
    }
    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
