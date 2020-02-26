package br.com.apparezzo.pages;

import java.net.MalformedURLException;

import br.com.apparezzo.elementMapper.PedidoPageElementMapper;
import br.com.apparezzo.stepdef.Hook;
import br.com.apparezzo.utils.Utils;

public class PedidoPage  extends BasePage{
	
	public PedidoPage(Hook hook) {
		super(hook);
	}
	
	public boolean pedidoConcluido() throws MalformedURLException {
		String mensagem = "";
		if(Utils.AREZZO) {mensagem = "PEDIDO CONCLUÍDO!";}
		if(Utils.SCHUTZ) {mensagem = "Pedido realizado com sucesso.";}

		return getDriver().findElement(PedidoPageElementMapper.getPEDIDOCONCLUIDO()).getText().contains(mensagem);
	}

}
