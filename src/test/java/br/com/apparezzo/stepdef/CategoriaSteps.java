package br.com.apparezzo.stepdef;

import java.net.MalformedURLException;

import br.com.apparezzo.pages.CategoriaPage;
import cucumber.api.java.pt.E;

public class CategoriaSteps {

	public CategoriaSteps() {

	}

	private Hook hook;

	@E("^clico no Sapato$")
	public void clicaPrimeiroProduto() throws MalformedURLException {
		CategoriaPage categoria = new CategoriaPage(hook);
		categoria.clicaSegundoSapato();
	}
}
