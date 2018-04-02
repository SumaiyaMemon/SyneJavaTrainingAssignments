import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetExample {

	public static void main(String args[]){
		
		Set<String> countries=new HashSet<String>();
		countries.add("India");
		countries.add("US");
		countries.add("Singapore");
		countries.add("UK");
		countries.add("Australia");
		countries.add("Switzerland");
		countries.add("US");
		System.out.println(countries);
		/*for(int index=0;index<countries.size();index++){
			
			System.out.println("Countries: "+countries.);
		}*/
		for(String data:countries){
			
			System.out.println("Country: "+data);
		}
		Iterator<String> iterator=countries.iterator();
		while(iterator.hasNext()){
			
			System.out.println("CountryName: "+iterator.next());
		}
	}
}
