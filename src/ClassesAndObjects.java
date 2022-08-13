public class ClassesAndObjects {
    public ClassesAndObjects() {
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Олимджон";
        person1.age = 25;
        Person person2 = new Person();
        person2.name = "Низомджон";
        person2.age = 11;
        System.out.println("Меня зовут " + person1.name + ", мне " + person1.age + " лет!");
        System.out.println("Меня зовут " + person2.name + ", мне " + person2.age + " лет!");
    }
}
