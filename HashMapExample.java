import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;


public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> hm=new HashMap<String,String>();
		//HashMap is sorted but not ordered
		hm.put("SBAC0001", "Savings Account");
		hm.put("RDAC002", "Recurring Account");
		hm.put("FDAC003", "Fixed Deposit");
		System.out.println(hm);
		
		HashMap<Integer,String> hm2=new HashMap<Integer,String>();
		hm2.put(25, "IceCream");
		hm2.put(50, "Pastry");
		hm2.put(10, "Choclate");
		System.out.println(hm2);
		System.out.println(hm2.size());
		
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(20, "Cheese Kachchi Dabeli");
		tm.put(40, "Sandwich");
		tm.put(15, "VadaPav");
		System.out.println(tm);
		
		Set<Integer> keys=hm2.keySet();
		Iterator<Integer> iterator=keys.iterator();
		while(iterator.hasNext()){
			
			int mykey=iterator.next();
			System.out.println(mykey+" "+hm2.get(mykey));
		}
	}

}
