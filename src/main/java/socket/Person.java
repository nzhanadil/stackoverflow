package socket;

public class Person {
    private String id;
    private String name;
    private int age;

    // Constructor
    public Person(String id,String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getter ve Setter metotları
    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
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
}
