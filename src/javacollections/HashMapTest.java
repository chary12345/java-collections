package javacollections;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTest /*implements Comparator<Integer>*/ {

	
	public static void main(String[] args) {
		CricketersRanks r1 = new CricketersRanks("Virat Kohli", 1, "India");
		CricketersRanks r2 = new CricketersRanks("Rohith Sharma", 2, "India");
		CricketersRanks r3 = new CricketersRanks("Ross Taylor", 3, "NewzeLand");
		CricketersRanks r4 = new CricketersRanks("Quintonn Decock", 4, "South Africa");
		CricketersRanks r5 = new CricketersRanks("Shai Hope", 5, "West Indies");
		TreeMap<Object, Integer> map = new TreeMap<>(new MapCompartors());
		
		
		//HashMap<Integer, CricketersRanks> map = new LinkedHashMap<>();
		
		map.put(r1, 1);
		map.put(r4, 4);
		map.put(r5, 5);
		map.put(r3, 3);
		map.put(r2, 2);
		map.put(r1, 1);
		System.out.println("ICC Rankings");
		//System.out.println(map);
		
		//  play vital roles to print in one by one uses with for each......
	Set<Entry<Object, Integer>> set = map.entrySet();
		for (Entry<Object, Integer> entry : set) {
			System.out.println(entry.getKey()+" "+ entry.getValue());
			
		}
		
		System.out.println("size "+map.size());
		//System.out.println(map);s
		

		
	}
	
}

class CricketersRanks /*implements Comparable<Object>*/{
	
	/*@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}*/
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rank+" "+cricketer+ "  "+country ;
	}
	private String  cricketer;
	private Integer rank;
	private String country;
	
	
	
	public CricketersRanks(String cricketer, Integer rank, String country) {
		super();
		this.cricketer = cricketer;
		this.rank = rank;
		this.country = country;
	}
	
	
	public String getCricketer() {
		return cricketer;
	}
	public void setCricketer(String cricketer) {
		this.cricketer = cricketer;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
}