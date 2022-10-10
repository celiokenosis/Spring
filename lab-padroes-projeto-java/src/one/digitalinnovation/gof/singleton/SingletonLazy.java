package one.digitalinnovation.gof.singleton;

/**
 * Singleton "pregui�oso"
 * @author C�lio M. Pereira
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
