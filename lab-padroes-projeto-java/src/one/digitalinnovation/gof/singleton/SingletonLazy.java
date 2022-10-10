package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso"
 * @author Célio M. Pereira
 */
public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getIinstancia() {
		
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		
		return instancia;
	}
}
