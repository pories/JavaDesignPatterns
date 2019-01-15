import java.util.List;

public class ThirdPartyBillingSystem {

	
	private ITarget employeeSource;

    public ThirdPartyBillingSystem(ITarget employeeSource)
    {
        this.employeeSource = employeeSource;
    }

    public void ShowEmployeeList()
    {
        List<String> employee = employeeSource.GetEmployeeList();
        //To DO: Implement you business logic

        System.out.println("######### Employee List ##########");
        
        //foreach (var item in employee){System.out.println("Var in list");}
        //try one
        for(String item : employee)
        {
        	//System.out.println(item); //This has a carriage return.
        	System.out.print(item);
        }

    }
}
