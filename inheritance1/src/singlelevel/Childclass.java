package singlelevel;

public class Childclass extends Parentclass  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass h=new Childclass();
		h.engine();
		h.gear();
		h.colour();
		h.oil();
		

	}
        public void engine() {
        	System.out.println("four stroke");
        	
        }
        public void gear() {
        	System.out.println("automated");
        }
} 
