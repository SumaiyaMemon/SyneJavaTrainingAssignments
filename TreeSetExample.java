import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetExample {

	public static void main(String args[]){
		
		Set<String> planets=new TreeSet<String>();
		planets.add("Earth");		
		planets.add("Mars");
		planets.add("Saturn");
		planets.add("Neptune");
		planets.add("Jupiter");
		System.out.println(planets);
		for(String data:planets){
			
			System.out.println("Planet: "+data);
		}
		Iterator<String> iterator=planets.iterator();
		while(iterator.hasNext()){
			
			System.out.println("Planet Name: "+iterator.next());
		}
	}
}
