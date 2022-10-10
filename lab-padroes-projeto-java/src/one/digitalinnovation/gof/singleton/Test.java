package one.digitalinnovation.gof.singleton;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {

		//Singleton
		SingletonLazy lazy = SingletonLazy.getIinstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getIinstancia();
		System.out.println(lazy);
		System.out.println("======================================================");
		
		SingletonEager eager = SingletonEager.getIinstancia();
		System.out.println(eager);
		lazy = SingletonLazy.getIinstancia();
		System.out.println(eager);
		System.out.println("======================================================");
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getIinstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getIinstancia();
		System.out.println(lazyHolder);
		System.out.println("======================================================");
		
		//Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
		
	}

}
