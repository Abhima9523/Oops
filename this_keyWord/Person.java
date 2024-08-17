package this_keyWord;

public class Person {
	int age;
	String name;
	String sex;
	
	public Person(int age, String name, String sex) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	public void display()
	{
		System.out.println("age :"+age);
		System.out.println("Name :"+name);
		System.out.println("age :"+sex);
	}
	public static void main(String[] args) {
		Person p= new Person(13,"abhimanyu","male");
		p.display();
				
	}
}
