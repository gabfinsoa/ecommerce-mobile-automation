package br.com.apparezzo.pages;

import br.com.apparezzo.elementMapper.CartPageElementMapper;
import br.com.apparezzo.stepdef.Hook;
import br.com.apparezzo.utils.Utils;

public class CartPage extends BasePage{

	public CartPage(Hook hook) {
		super(hook);
	}
	
	public void clicaConcluirCompra() {
		click(CartPageElementMapper.getCONCLUIRCOMPRA());
	}
	
	public void clicaDiminuirQtd() {
		click(CartPageElementMapper.getCLICARDIMINUIRQTD());
	}
	
	public void clicaAumentarQtd() {
		click(CartPageElementMapper.getCLICARAUMENTARQTD());
	}
	
	public String getQtdProdutos() {
		click(CartPageElementMapper.getVERIFICARQTD());
		return getText(CartPageElementMapper.getVERIFICARQTD());
	}

	
}
