public class Dog extends Animal implements Comparable<Dog> {
    public String breed;

    public int compareTo(Dog o) {
        return age - o.age;
    }
    public Dog(int age, String name, String breed) {
        super(age, name);
        this.breed = breed;
    }
}
