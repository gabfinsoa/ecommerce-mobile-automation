package br.com.apparezzo.pages;

import java.net.MalformedURLException;
import br.com.apparezzo.elementMapper.MinhaContaPageElementMapper;
import br.com.apparezzo.stepdef.Hook;

public class MinhaContaPage extends BasePage{
	
	public MinhaContaPage(Hook hook) {
		super(hook);
	}
	
	public void verificaNomeCadastradoLogin() throws MalformedURLException {
		getDriver().findElement(MinhaContaPageElementMapper.getNOMEUSERCADASTRADO());
	}

}
