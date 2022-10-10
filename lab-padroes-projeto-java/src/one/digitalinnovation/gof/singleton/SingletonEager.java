package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 * @author Célio M. Pereira
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getIinstancia() {
		
		return instancia;
	}
}
