class Single {
	// static variable single_instance of type Singleton
	private static Single myvar1 = null;
	// private constructor restricted to this class itself. Key point to the singleton pattern.  
	private Single()
	{
		//Nothing goes here.
	}
	// static method to create instance of Singleton class and makes sure that only one is created. 
	public static Single GetInstance()
	{
		//if(null == myvar1){myvar1 = new Single();}
		//return myvar1;
		
		return myvar1 =  (myvar1==null) ? myvar1 = new Single() :null ;
	}
	//Showing that program is doing something. 
	public void DoSomething(String msg)
	{
		System.out.println(msg + " This is the second one.");
	}
}
