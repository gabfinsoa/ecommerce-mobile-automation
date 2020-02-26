package br.com.apparezzo.pages;

import br.com.apparezzo.elementMapper.MenuPageElementMapper;
import br.com.apparezzo.stepdef.Hook;

public class MenuPage extends BasePage{
	
	public MenuPage(Hook hook) {
		super(hook);
	}
	
	public void clicaSapatos() {
		click(MenuPageElementMapper.getSAPATOS());
	}
	
	public void clicaVerTodos() {
		click(MenuPageElementMapper.getVERTODOS());
	}

}
