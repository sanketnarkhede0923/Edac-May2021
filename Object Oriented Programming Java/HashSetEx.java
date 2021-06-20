import java.time.*;
import java.util.*;

class Data{
	int dataNo;
	String dataName;
	LocalDate date;
	
	public Data(int no, String name, LocalDate dt) {
		dataNo =no;
		dataName = name;
		date = dt;
	}
	
	@Override
	public int hashCode() {
		return Integer.hashCode(dataNo);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!obj.getClass().getName().equals("Data"))
			return false;
		Data temp = (Data)obj;//This is unboxing...
		if(temp.dataNo == dataNo)
			return true;
		else
			return false;
	}
}

public class HashSetEx {

	public static void main(String[] args) {
		Set<Data> allData = new HashSet<Data>();
		allData.add(new Data(111, "Mumbai", LocalDate.now().minusDays(234)));
		allData.add(new Data(112, "Aurangabad", LocalDate.now().minusDays(134)));
		allData.add(new Data(113, "Pune", LocalDate.now().minusMonths(23)));
		allData.add(new Data(114, "Nagpur", LocalDate.now().minusMonths(34)));
		allData.add(new Data(115, "Nashik", LocalDate.now().minusDays(623)));
		

		if(!allData.add(new Data(114, "Nagpur", LocalDate.now().minusMonths(34))))
			System.out.println("Duplicate");
		if(!allData.add(new Data(115, "Nashik", LocalDate.now().minusDays(623))))
			System.out.println("Duplicate");
		
		
		for(Data dt : allData)
			System.out.println(dt.hashCode());
		
		checkForEquality();
	}
	
	private static void checkForEquality() {
		Data obj = new Data(111, "Sample", LocalDate.now());
		
		if(obj.equals(123))
			System.out.println("they are same");
		else
			System.out.println("they are different");
		if(obj.equals(new Data(111, "Sample", LocalDate.now())))
			System.out.println("they are same");
		else
			System.out.println("they are different");
	}
}
