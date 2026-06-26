package animals;

public class Dog {
	private  int age = 3;
	public void bark() {
	System.out.println("woof");
}
public int getAge(){
	return age;
}
public void setAge(int newAge) {
	if (newAge  >=0){
	age = newAge;
}
	else{
System.out.println("Invalid age, ignoring.");
}
}
}
