package demo;
interface husband
{ 
	void family();
	
}
interface wife
{
    void children();
}
public class Interface_Interface implements husband,wife
{
	public void family() 
	{
		System.out.println("happy");
	}

	public void children() 
	{
		System.out.println("rich");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_Interface k = new Interface_Interface();
		k.family();
		k.children();

	}

}
