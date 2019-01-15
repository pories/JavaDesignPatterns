
public class Owner {
	private ISpreadsheet myvar1;
	public void SetSpreadsheet(ISpreadsheet DifferentSpreadSheet) 
	{
		myvar1 = DifferentSpreadSheet;
	}
	
	public void WorkOn()
	{
		myvar1.open();
	}	
}
