public record Person2(String name, int age) implements Comparable<Person2> {
    public int compareTo(Person2 o) {
        return age - o.age + name.length() - o.name.length();
    }
    public Person2(String name, int age) {
        this.name = name;
        if(age < 0) {
            this.age = 0;
            return;
        }
        this.age = age;
    }
}
