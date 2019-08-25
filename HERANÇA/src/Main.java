
public class Main {

	public static void main(String[] args) {
		String or = "New Guine";
		
		Animal robson = new Animal(or);
		Cachorro godofredo = new Cachorro(or);
		
		
		godofredo.comer();
		
		robson.comer();

		System.out.println(robson.origem);
		System.out.println(godofredo.origem);
	}

}
