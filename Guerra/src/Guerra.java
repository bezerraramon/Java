import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;

public class Guerra {

	public static void main(String[] args) throws MalformedURLException,ProtocolException, IOException {

		Guerreiro g = new Guerreiro("Vegeta");
		Mago m = new Mago("Babidi");

		m.invocar();
		g.invocar();

		g.defender(37.5);
		//g.atacarPerto();
		
		m.atacarLonge();
		//m.defender();
	}

}
