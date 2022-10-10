package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 * @author C�lio M. Pereira
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
