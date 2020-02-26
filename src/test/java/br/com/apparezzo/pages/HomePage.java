package br.com.apparezzo.pages;

import br.com.apparezzo.elementMapper.HomePageElementMapper;
import br.com.apparezzo.stepdef.Hook;

public class HomePage extends BasePage{
	
	public HomePage(Hook hook) {
		super(hook);
	}

	public void clicaSair() {
		click(HomePageElementMapper.getAGORANAO());
	}
	
	public void clicaBuscar() {
		click(HomePageElementMapper.getBUSCAR());
	}
	
	public void clicaMinhaConta() {
		click(HomePageElementMapper.getMINHACONTA());
	}
	
	public void clicaCriarConta() {
		click(HomePageElementMapper.getCRIARCONTAAREZZO());
	}

	public void clicoEmEntrar() {
		click(HomePageElementMapper.getENTRARCONTAAREZZO());
	}

	public void clicoEmEntrarFace() {
		click(HomePageElementMapper.getENTRARFACEBOOK());
	}

	
}
