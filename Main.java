import java.util.ArrayList;
import animals.Dog;
import trainers.Puppy;

public class Main {
	public static void main(String[] args){
	ArrayList<String>fruits = new ArrayList<String>();
	fruits.add("mango");
	fruits.add("Banana");
	Dog myDog = new Dog();
	myDog.bark();
	System.out.println("Age: " + myDog.getAge());
	myDog.setAge(-10);
	System.out.println("Age after bad set: " + myDog.getAge());
	myDog.setAge(5);
	Puppy myPuppy = new Puppy();
	myPuppy.bark();
	myPuppy.showAge();
	System.out.println("Age after good set: " + myDog.getAge());
	System.out.println(fruits);
}
}
