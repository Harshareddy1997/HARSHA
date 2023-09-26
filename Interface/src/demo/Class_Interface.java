package demo;
interface Kingdom
{
	void Soliders();
}
class KING implements Kingdom { 
	public void Soliders()
	{
		System.out.println("war");
	}
}
class queen implements Kingdom
{
	public void Soliders () {
		System.out.println("ready for war");
	}
	}
public class Class_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queen k =new queen();
		k.Soliders();
	}

}