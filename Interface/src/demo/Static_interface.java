package demo;
interface bag
{
	void books ();
	static int price (int r) 
	{
		return r*r;
	}
}
 
class shop implements bag
{
	public void books ()
	{
		System.out.println("property");
	}
}

public class Static_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bag k=new shop();
		k.books();
		int o = bag.price(6);
		System.out.println(o);

	}

}
