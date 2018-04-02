import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class ArrayListExample {

	public static void main(String args[]){
		
		List<String> cities=new ArrayList<String>();
		cities.add("Pune");
		cities.add("Banglore");
		cities.add("Gurugram");
		
		System.out.println(cities);
		cities.add("Pune");
		System.out.println(cities);
		System.out.println(cities.get(1));
		//System.out.println(cities.size());
		for(int index=0;index<cities.size();index++){
			
			System.out.println("Cities "+cities.get(index));
		}
		for(String cityName:cities){ //countries is a generic
			
			System.out.println("City: "+cityName);
		}
		
		Iterator<String> iterator=cities.iterator();
		while(iterator.hasNext()){
			
			System.out.println("City Name: "+iterator.next());
		}
		
		Collections.sort(cities);
		for(String cityName:cities){ //countries is a generic
			
			System.out.println("City: "+cityName);
		}
	}
	
	
}
