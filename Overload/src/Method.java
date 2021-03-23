
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload s = new Overload();
        System.out.println(s.sum(10, 20)); 
        System.out.println(s.sum(10, 20, 30)); 
        System.out.println(s.sum(10.5, 20.5)); 
        s.show("hello"); 
        s.show(250); 
        s.show('A'); 
       
        s.show("A"); 
	}
}
	