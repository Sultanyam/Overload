
 class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}	

		//Overloading with method return values
	    public int sum(int x, int y) 
	    { 
	        return (x + y); 
	    } 
	    
	    public int sum(int x, int y, int z) 
	    { 
	        return (x + y + z); 
	    } 
	   
	    public double sum(double x, double y) 
	    { 
	        return (x + y); 
	    } 
	    
	    
	  //Overloading with method don't return any values  
	    public void show(int x) 
	    { 
	        System.out.println("In int" + x); 
	    } 
	    public void show(String s) 
	    { 
	        System.out.println("In String" + s); 
	    } 
	    public void show(byte b) 
	    { 
	        System.out.println("In byte" + b); 
	    } 
 }
 

 
 


			


	

