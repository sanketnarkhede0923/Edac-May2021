interface IParty{
	void InviteFriends(String [] names);
	void OrderCake(int size, String flavor);
	 
	default void OrderDrinks() {
		System.out.println("Soft Drinks are ordered");		
	}
}

class Party implements IParty {

	@Override
	public void InviteFriends(String[] names) {
		for(String name : names)
			System.out.println("Sending whatsUp message to invite to " + name);
	}

	@Override
	public void OrderCake(int size, String flavor) {
		System.out.println("Ordered cake from Cakes and Slices of wieght " + size +" and of flavor " + flavor);		
	}
	
	public void Dance() {
		System.out.println("Dancing");
	}
	
}

class MyPersonalParty implements IParty{

	@Override
	public void InviteFriends(String[] names) {
		System.out.println("invited personally");
	}

	@Override
	public void OrderCake(int size, String flavor) {
		System.out.println("Orders veg cake");	
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		IParty party = new Party();
		party.InviteFriends(new String[] {"Phani","Gopal", "Banu","Kumar"});
		party.OrderCake(5, "Choclate");
	
		Party temp = (Party)party;
		temp.Dance();
		
		party = new MyPersonalParty();
		party.InviteFriends(new String[] {"Phani","Gopal", "Banu","Kumar"});
		party.OrderCake(5, "Vanilla");
	
	}