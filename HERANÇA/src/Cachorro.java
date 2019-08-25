
public class Cachorro extends Animal {
	public String raca;

	public Cachorro(String x) {
		super(x);

	}
@Override
	public void comer() {
		System.out.println("Estou comendo.");
	}
}
