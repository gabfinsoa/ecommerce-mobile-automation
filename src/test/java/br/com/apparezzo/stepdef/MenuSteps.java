package br.com.apparezzo.stepdef;

import java.net.MalformedURLException;

import br.com.apparezzo.pages.MenuPage;
import cucumber.api.java.pt.E;

public class MenuSteps {
	
public MenuSteps() {}
	private Hook hook;
	MenuPage menu = new MenuPage(hook);
	
	@E("^clico em Sapatos$")
	public void clicaSapatos() throws MalformedURLException {
		MenuPage menu = new MenuPage(hook);
		menu.clicaSapatos();
	}
	
	@E("^clico em Ver Todos$")
	public void clicaVerTodos() throws MalformedURLException {
		MenuPage menu = new MenuPage(hook);
		menu.clicaVerTodos();
	}

}
