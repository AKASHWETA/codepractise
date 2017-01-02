package sorting;

import java.util.Comparator;


public class Person extends Comparable<Person> {
	private String name;
	private String age;
	private int height;
	private long ssn;
	
	
	public Person(String name, String age, int height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}

	/*@Override
	public int compareTo(Person person){
		return this.name.compareTo(person.name);
	}*/
	
	/*@Override
	public int compareTo(Person arg0) {
			return this.name.compareTo(arg0.name);	
	}*/
public static Comparator<Person> FruitNameComparator = new Comparator<Person>() {

			public int compare(Person fruit1, Person fruit2) {

		int fruitName1 = fruit1.getHeight();
		int fruitName2 = fruit2.getHeight();

		//ascending order
		return fruitName2 - fruitName1;

//descending order
//return fruitName2.compareTo(fruitName1);
			}
	};
	public static Comparator<Person> testCOmparator = new Comparator<Person>() {
		
		@Override
		public int compare(Person o1, Person o2) {
			int heigth1 = o1.getHeight();
			int heigth2 = o2.getHeight();
			return heigth1- heigth2;
		}
	};
	 
/* public static Comparator<Person> nameComp = new Comparator<Person>(){
	 public int compare(Person p1, Person p2){
		 String name1 = p1.getName();
		 String name2 = p2.getName();
		 return name2.compareTo(name1);
	 }
 };*/
	@Override
	public int compareTo(Person person){
		return person.height - this.height;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + height;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (ssn ^ (ssn >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (height != other.height)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ssn != other.ssn)
			return false;
		return true;
	}
	
	
	
	/*@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result +((age ==null? 0: age.hashCode()));
		result = prime * result + height;
		result = prime * + result + ((name ==null ? 0: name.hashCode()));
		return result;
	}
	
	public int codehas(){
		final int prime = 31;
		int result= 1;
		result = prime * result+(age == null?0:age.hashCode());
		result = prime * result + height;
		result = prime * result +(name == null? 0: name.hashCode());
		return result;
	}*/
	/*@Override
	public boolean equals(Object obj)	{
		if(this == obj)
			return true;
		if(getClass() != obj.getClass())
			return false;
		if(obj ==null)
			return false;
		Person other = (Person) obj;
		if(!(obj instanceof Person))
			return false;
		if(age == null){
			if (other.age !=null)
				return false;
		}else if(!age.equals(other.age)){
			return false;
		}
		if(name == null){
			if(other.name != null)
				return false;
		}else if(!name.equals(other.name)){
			return false;
		}
		return true;
	}*/
}
