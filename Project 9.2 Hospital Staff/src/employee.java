
abstract public class employee 

{

	protected String name;
	protected String phone;
	protected String address;
	protected String social;
	
	public employee(String Name, String Phone, String Address, String Social)
	{
		name = Name;
		phone = Phone;
		address = Address;
		social = Social;
	}
	
	public void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Phone: " + phone);
		System.out.println("Address: " + address);
		System.out.println("Social: " + social);
	}
}
