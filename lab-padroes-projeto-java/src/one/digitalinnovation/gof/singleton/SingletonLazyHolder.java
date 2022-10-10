package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 * @author Célio M. Pereira
 */
public class SingletonLazyHolder {

	private static class InstanceHolder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getIinstancia() {
		return InstanceHolder.instancia;
	}
}
