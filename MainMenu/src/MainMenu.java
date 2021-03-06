import java.util.Scanner;

public class MainMenu {
	public static Boolean userMainMenu() {
		// TODO Auto-generated method stub
		boolean repeat = true;
		System.out.println("Design Patterns");
		System.out.println("Here is a list of design patterns.");
		System.out.println("Choose: 1) Strategy/Null Object Pattern, 2)Singleton Pattern 3)Factory Method Pattern 4)Adapter Pattern 5)Decorator Pattern");
		Scanner mainMenuExeInput = new Scanner(System.in);
		String input = mainMenuExeInput.nextLine();
		switch (input) {
		case "1":
			//https://www.youtube.com/watch?v=94t2ayF1l3o
			//Strategy.Execute();
			break;
		case "2":
			//https://www.youtube.com/watch?v=xgkbirZrwAs&index=4&list=PL8C53D99ABAD3F4C8			
			//Singleton.Execute();
			break;
		case "3":
			//https://www.youtube.com/watch?v=qzxp9p7UP_Y 
			//Factory.Execute();
			break;
		case "4":
			//https://www.dotnettricks.com/learn/designpatterns/adapter-design-pattern-dotnet
			//Adapter.Execute();
			break;
		case "5":
			//https://www.youtube.com/watch?v=nk9Z1vwO3RI
			//Decorator.Execute();
			break;
		default:
			System.out.println("Didn't Choose Anything.");
			break;
		}

		// System.out.println("Main Menu Exit: Go again? Y/N: ");
		System.out.println("Design Patterns main menu. Restart main design patterns main program? Y/N: ");
		char go; // Variable to hold user response.
		Scanner mainMenuExitInput = new Scanner(System.in);
		go = mainMenuExitInput.next().charAt(0);
		if (go == 'y' || go == 'Y') {
			repeat = true;
			// break; //break will exit your code, you don't want to do this, you want to
			// allow repeat to be assigned, that will break out of code.
			return repeat;
		} else if (go == 'n' || go == 'N') {
			repeat = false;
			System.out.println("Design Patterns main menu program ended.");
			return repeat;
			// break; //break will exit your code, you don't want to do this, you want to
			// allow repeat to be assigned, that will break out of code.
		} else {
			repeat = false;
			System.out.println("Not a listed option, Design Patterns main menu program ended.");
			return repeat;
		}
		// return null;
		// return true;
		// mainMenuExeInput.close(); //Not necessary. Errors when in.
		// mainMenuExitInput.close();

	}
}
