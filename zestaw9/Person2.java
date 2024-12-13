public record Person2(String name, int age) {
    public Person2(String name, int age) {
        this.name = name;
        if(age < 0) {
            this.age = 0;
            return;
        }
        this.age = age;
    }
}
