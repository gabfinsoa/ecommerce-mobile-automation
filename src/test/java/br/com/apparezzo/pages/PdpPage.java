package br.com.apparezzo.pages;

import java.net.MalformedURLException;
import br.com.apparezzo.elementMapper.PdpPageElementMapper;
import org.openqa.selenium.By;
import br.com.apparezzo.stepdef.Hook;

public class PdpPage extends BasePage{

	public PdpPage(Hook hook) {
		super(hook);
	}
	
	public String getNomeProduto() throws MalformedURLException {
		String nome;
		nome = getDriver().findElement(PdpPageElementMapper.getNOME()).getText();
		return nome;	
	}
	
	public void clicaNumeracao(String args) {
		String texto = "//android.widget.TextView[@text='"+ args +"']";
		click(By.xpath(texto));
	}
	
	public void clicaComprar() {
		click(PdpPageElementMapper.getCOMPRAR());
	}
	
	public void clicaFinalizarCompra() {
		click(PdpPageElementMapper.getFINALIZARCOMPRA());
	}
}
