import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.PersonAssignment.PersonImpl;
import com.personException.PersonNotFoundException;
import com.pojo.Person;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int id,num;
		List<Person> persons=new ArrayList<Person>();
		PersonImpl impl=new PersonImpl();
		persons=impl.getPersons();
		try{
		while(true){
		System.out.println("Select Operation to perform 1.Find a person \n 2.Remove a Person \n3.Update a Person name \n4.Display persons\n5. Add a person\n6.Stop");
		num=sc.nextInt();
		switch(num){
		case 1 :
			System.out.println("Enter id:");
			id=sc.nextInt();
			if(impl.findById(id, persons)==null){
					throw new PersonNotFoundException("Person not found");
			}
			else{
				System.out.println("Person found");
			}
			break;
		case 2:
			System.out.println("Enter id:");
			id=sc.nextInt();
			if(!(impl.removePerson(id, persons))){
					throw new PersonNotFoundException("Person Not found]");
			}
			else{
				System.out.println("Person removed");
			}
			break;
		case 3:
			System.out.println("Enter id:");
			id=sc.nextInt();
			if(impl.updatePerson(id, persons)==null){
					throw new PersonNotFoundException("Person Not found]");
			}
			else{
				System.out.println("Person updated");
			}
			break;
		case 4:
			List<Person> p1=impl.displayPersons(persons);
			break;
		case 5:
			System.out.println("Enter the id and name : ");
			Person person=new Person(sc.nextInt(),sc.next());
			impl.addPerson(persons, person);
			break;
		case 6:
			System.exit(0);
		}
		}
		}
	catch(PersonNotFoundException e){
		e.display();
	}
	}

}
