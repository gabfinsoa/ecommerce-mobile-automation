package br.com.apparezzo.stepdef;

import java.net.MalformedURLException;

import br.com.apparezzo.pages.PdpPage;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class PdpSteps {
	
	public PdpSteps() {
		
	}
	private Hook hook;
	PdpPage pdp = new PdpPage(hook);
	
	@E("^clico na numeração (.*)$")
	public void selecionaNumeracao(String args) throws MalformedURLException {
		pdp.clicaNumeracao(args);
	}
	
	@Então("^visualizo a pdp$")
	public void visualizoPDP() throws MalformedURLException {
		pdp.getNomeProduto().contains("ANABELA");
	}
	
	@E("^clico em Comprar$")
	public void clicaComprar() throws MalformedURLException {
		pdp.clicaComprar();
	}
	
	@E("^clico em Finalizar$")
	public void clicaFinalizar() throws MalformedURLException {
		pdp.clicaFinalizarCompra();
	}

}
