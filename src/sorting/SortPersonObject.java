package sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortPersonObject {
	
	

	public static void main(String[] args) {
		Person[] person = new Person[5];
		
		Person pineappale = new Person("Pineapple", "Pineapple description",70); 
		Person apple = new Person("Apple", "Apple description",100); 
		Person apple1 = new Person("Apple", "Apple description",100); 
		Person orange = new Person("Orange", "Orange description",90); 
		Person banana = new Person("Banana", "Banana description",80); 
		person[0] =pineappale;
		person[1] =apple;
		person[2] =orange;
		person[3] =banana;
		person[4] =apple1;
		//Set<Person> uniqueAccs = new HashSet<Person>(Arrays.asList(person)); 
		//Set<Person> uniqueAccs = new HashSet<Person>(Arrays.asList(person));
		//Arrays.sort(person,Person.testComparator);
		//Arrays.sort(person, Person.FruitNameComparator);
		int i=0;
		for(Person temp: person){
			
		   System.out.println("fruits " + ++i + " : " + temp.getName() + 
			", Quantity : " + temp.getHeight());
		}
	}

}
