package trainers;
import animals.Dog;

public class Puppy extends Dog {
    public void showAge() {
        System.out.println("Puppy age: " + getAge());
    }

    @Override
    public void bark() {
        System.out.println("Yip yip!");
    }
}
