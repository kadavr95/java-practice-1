package dog.project;

/**
 * Created by Yaskovich Dmitry on 22/09/2016.
 */
public class Dog {
    //private variables
    private int age;
    private String name;

    //constructors
    public Dog(int age, String name){
        this.age=age;
        this.name=name;
    }

    public Dog(int age){
        this.age=age;
        this.name="unknown";
    }

    public Dog(String name){
        this.age=0;
        this.name=name;
    }

    public Dog(){
        this.age=0;
        this.name="unknown";
    }

    //public getters and setters for private variables
    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    //human age calculation
    public int getHumanAge(){
        return this.age*7;
    }

    //print template
    public String toString(){
        return String.format("Dog \"%s\", age: %d", name,age);
    }
}
