package br.com.apparezzo.pages;

import br.com.apparezzo.elementMapper.CategoriaPageElementMapper;
import br.com.apparezzo.stepdef.Hook;

public class CategoriaPage extends BasePage {
	
	public CategoriaPage(Hook hook) {
		super(hook);
	}
	
	public void clicaPrimeiroSapato(){
		click(CategoriaPageElementMapper.getCLICAPRIMEIROSAPATO());
	}

	public void clicaSegundoSapato() {
		click(CategoriaPageElementMapper.getCLICASEGUNDOSAPATO());
	}

}
