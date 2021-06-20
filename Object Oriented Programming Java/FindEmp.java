public class FindEmp {
	public static void main(String args[])
	{
		AB ab=new AB();
		ab.setValues();
		System.out.println(ab.readId(MyConsole.getInteger("Enter employee id to find name of the employee: ")));
	}
}

class Employee{
	int id;
	String name;
	void set(String name,int id) {
		this.name=name;
		this.id=id;
	}
}
class AB{
	Employee[] emp=new Employee[MyConsole.getInteger("Enter how many employee you want to store: ")];
	void setValues() {
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee();
			int a=MyConsole.getInteger("enter id");
			MyConsole.getString("");
			String b=MyConsole.getString("enter the name of employee");
			emp[i].set(b,a);
		}
	}
	
	String readId(int id) {
		for(Employee x:emp) {
			if(id==x.id)
				return x.name;
		}
		return null;
	}
	int readName(String name) {
		for(Employee y:emp) {
			if(name==y.name)
				return y.id;
			}
		return -1;
	}
	
}
