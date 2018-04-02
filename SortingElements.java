import java.util.Arrays;
import java.util.Collections;


public class SortingElements {

	public static void main(String args[]){
		
		int scores[]={2,5,2,6,2,4,45,2,4,6};
		String names[]={"Sumaiya","Leena","Prachee","Anjali","Rutuja","Abhaya"};
		for(int score:scores){
			
			System.out.print(score+" ");
		}
		System.out.println();
		for(String name:names){
			
			System.out.println(name);
		}
		System.out.println();
		System.out.println("**After Sorting**");
		Arrays.sort(scores);
		Arrays.sort(names);
		Arrays.sort(names,Collections.reverseOrder());
		for(int score:scores){
			
			System.out.print(score+" ");
		}
		System.out.println();
		for(String name:names){
			
			System.out.println(name);
		}
	}
}
