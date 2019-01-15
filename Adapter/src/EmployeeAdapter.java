import java.util.LinkedList;
import java.util.List;

public class EmployeeAdapter extends HRStstem implements ITarget {


	@Override
	public List<String> GetEmployeeList() {
		// TODO Auto-generated method stub
		//Original below
		//List<String> employeeList = new List<String>();
		
		//Try 1 below, Works, but do I want an array.  
		//List<String> employeeList = new ArrayList<String>();
		//Try 2 below, Works, but do I want an linked list.  
		List<String> employeeList = new LinkedList<String>();
		
        String[][] employees = GetEmployees();
        
        //Try One
        for(String[] item : employees)
        {
            employeeList.add(item[0]);
            employeeList.add(",");
            employeeList.add(item[1]);
            employeeList.add(",");
            employeeList.add(item[2]);
            employeeList.add("\n");
        }
        /*
        foreach (string[] employee in employees)
        {
            employeeList.Add(employee[0]);
            employeeList.Add(",");
            employeeList.Add(employee[1]);
            employeeList.Add(",");
            employeeList.Add(employee[2]);
            employeeList.Add("\n");
        }
		*/
        
        return employeeList;
		//return null;
	}

}
