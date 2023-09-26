package demo;
interface college
{
	void Soliders ();
}
interface students extends college
{
	void Workers();
}


public class Interface_class implements students
{
	public void Soliders ()
	{
		System.out.println("ready for war");
	}
	public void Workers()
	{
		System.out.println("war");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface_class k= new Interface_class();
		k.Workers();
		k.Soliders();
	}

}
