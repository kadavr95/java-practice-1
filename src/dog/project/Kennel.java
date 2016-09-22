package dog.project;

/**
 * Created by Yaskovich Dmitry on 22/09/2016.
 */
public class Kennel {
    public static void main(String[] args) {   // Execution entry point
        //create 4 dog instances
        Dog dog1 = new Dog(280,"Fafnir");
        Dog dog2 = new Dog("Fluffy");
        Dog dog3 = new Dog(2);
        Dog dog4 = new Dog();

        //print all instances info
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        //change some info
        dog2.setAge(1);
        dog3.setName("Fang");

        //print some info
        System.out.println(dog2.getAge());
        System.out.println(dog2.getName());
        System.out.println(dog3.getAge());
        System.out.println(dog3.getName());

        //print dogs human age
        System.out.println(dog1.getHumanAge());
        System.out.println(dog2.getHumanAge());
        System.out.println(dog3.getHumanAge());
        System.out.println(dog4.getHumanAge());

        //print all instances info
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
    }
}
