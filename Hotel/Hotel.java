public class Hotel
{
	String hotelName=" A2B ";
	Menu menu = new Menu();
	
	void printDetails()
	{
		System.out.println("\n\t"+hotelName+"\n");
		menu.setItem();
		menu.printMenu();
	}
}