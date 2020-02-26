package br.com.apparezzo.pages;

import br.com.apparezzo.elementMapper.CheckoutPageElementMapper;
import br.com.apparezzo.stepdef.Hook;
import br.com.apparezzo.utils.Utils;
import java.net.MalformedURLException;

public class CheckoutPage extends BasePage{

	public CheckoutPage(Hook hook) {
		super(hook);
	}

	public void clicaCriarConta() throws MalformedURLException {
		click(CheckoutPageElementMapper.getCRIARCONTA());
	}
	
	public void cadastrarUser() throws MalformedURLException {
	preencheEmailCadastro();
	preencheNomeCadastro();
	preencheSobreNomeCadastro();
	getDriver().hideKeyboard();
	preencheSenhaCadastro();
	getDriver().hideKeyboard();
	if(Utils.SCHUTZ) {
		preencheConfirmaSenhaCadastro();
		getDriver().hideKeyboard();
//		click(CheckoutPageElementMapper.getCLICARTERMOS());
	}
	click(CheckoutPageElementMapper.getCADASTRARCONTA());
	}
	
	public void preencheEmailCadastro(){
		String email = emailnovo();
		clear(CheckoutPageElementMapper.getEMAILCADASTRO());
		sendKeys(CheckoutPageElementMapper.getEMAILCADASTRO(), email);
	}
	
	public void preencheNomeCadastro() {
		sendKeys(CheckoutPageElementMapper.getNOMECADASTRO(),"Douglas");
	}
	
	public void preencheSobreNomeCadastro() {
		sendKeys(CheckoutPageElementMapper.getSOBRENOMECADASTRO(),"Golke");
	}
	
	public void preencheSenhaCadastro() {
		sendKeys(CheckoutPageElementMapper.getSENHACADASTRO(),"zero123@");
	}

	public void preencheConfirmaSenhaCadastro() throws MalformedURLException {
		sendKeys(CheckoutPageElementMapper.getCONFIRMASENHACADASTRO(),"zero123@");
	}
	
	public void preenchoDataNascimento() {
		clear(CheckoutPageElementMapper.getPREENCHERDATANASCIMENTO());
	   sendKeys(CheckoutPageElementMapper.getPREENCHERDATANASCIMENTO(), "01061985");
	}
	
	public void preenchoCPF() {
		clear(CheckoutPageElementMapper.getPREENCHERCPF());
		sendKeys(CheckoutPageElementMapper.getPREENCHERCPF(), "01233091077");
	}

	public void clicoEnviar() {
		click(CheckoutPageElementMapper.getCLICARENVIAR());
	}
	
	public void preenchoCEP() {
		clear(CheckoutPageElementMapper.getPREENCHERCEP());
		sendKeys(CheckoutPageElementMapper.getPREENCHERCEP(), "93042082");
	}
	
	public void preenchoNumeroEndereco() {
		clear(CheckoutPageElementMapper.getPREENCHERNUMEROENDERECO());
		sendKeys(CheckoutPageElementMapper.getPREENCHERNUMEROENDERECO(), "2500");
	}
	
	public void preenchoDestinatarioEndereco() {
		clear(CheckoutPageElementMapper.getDESTINATARIOENDERECO());
		sendKeys(CheckoutPageElementMapper.getDESTINATARIOENDERECO(),"Douglas Golke");
	}
	
	public void preenchoIdentificacaoEndereco() {
		clear(CheckoutPageElementMapper.getIDENTIFICACAOENDERECO());
		sendKeys(CheckoutPageElementMapper.getIDENTIFICACAOENDERECO(), "Casa");
	}
	
	public void preenchoTelefoneEndereco() {
		clear(CheckoutPageElementMapper.getTELEFONEENDERECO());
		sendKeys(CheckoutPageElementMapper.getTELEFONEENDERECO(), "51997435572");
	}
	
	public void preencherEndereco() throws MalformedURLException, InterruptedException {
		preenchoCEP();
		getDriver().hideKeyboard();
		preenchoNumeroEndereco();
		getDriver().hideKeyboard();
		Thread.sleep(1000);
		scrollDown();
		scrollDown();
		if (Utils.AREZZO) {
			preenchoDestinatarioEndereco();
			getDriver().hideKeyboard();
			preenchoTelefoneEndereco();
			getDriver().hideKeyboard();
		}
		preenchoIdentificacaoEndereco();
		getDriver().hideKeyboard();
		click(CheckoutPageElementMapper.getCLICARSALVARENDERECO());
		if (Utils.AREZZO) {
			click(CheckoutPageElementMapper.getCLICARUTILIZARENDERECO());
		}
	}
	
	public void clicaFormaDeEntregaExpresso() {
		click(CheckoutPageElementMapper.getCLICARFORMADEENTREGAEXPRESSO());
	}
	
	public void clicaIrParaPagamento() {
		if(Utils.AREZZO) {
			click(CheckoutPageElementMapper.getCLICARIRPARAPAGAMENTO());
		}
	}
	
	public void formaDePagamento() throws InterruptedException {
		clicaFormaDeEntregaExpresso();
		Thread.sleep(1000);
		clicaIrParaPagamento();
	}
	
	public void clicaCartaoCredito() {
		click(CheckoutPageElementMapper.getCLICAREMCARTAODECREDITO());
	}

	public void clicaNovoCartaoCredito() {
		click(CheckoutPageElementMapper.getCLICAREMNOVOCARTAODECREDITO());
	}
	
	public void preencheCartaoCredito() throws InterruptedException {
		clear(CheckoutPageElementMapper.getPREENCHERCARTAOCREDITO());
		Thread.sleep(1000);
		sendKeys(CheckoutPageElementMapper.getPREENCHERCARTAOCREDITO(), "4111111111111111");
	}
	
	public void preencheNomeCartao() {
		clear(CheckoutPageElementMapper.getPREENCHERNOMECARTAO());
		sendKeys(CheckoutPageElementMapper.getPREENCHERNOMECARTAO(),"Douglas Golke");
	}
	
	public void preencheCPFCartao() {
		clear(CheckoutPageElementMapper.getPREENCHERCPFCARTAO());
		sendKeys(CheckoutPageElementMapper.getPREENCHERCPFCARTAO(),"01233091077");
	}
	
	public void preencheCodSegCartao() {
		clear(CheckoutPageElementMapper.getPREENCHERCODSEGCARTAO());
		sendKeys(CheckoutPageElementMapper.getPREENCHERCODSEGCARTAO(),"737");
	}

	public void preencheValidadeCartaoSchutz() throws InterruptedException {
		clear(CheckoutPageElementMapper.getPREENCHERVALIDADECTSCHUTZ());
		sendKeys(CheckoutPageElementMapper.getPREENCHERVALIDADECTSCHUTZ(),"1020");
		Thread.sleep(1000);
	}
	
	public void clicaAbrirMesValidadeCartao() {
		click(CheckoutPageElementMapper.getCLICARABRIRMESVALIDADECARTAO());
	}
	
	public void clicaMesValidadeCartao() {
		click(CheckoutPageElementMapper.getCLICARMESVALIDADECARTAO());
	}
	
	public void clicaAbrirAnoValidadeCartao() {
		click(CheckoutPageElementMapper.getCLICARABRIRANOVALIDADECARTAO());
	}
	
	public void clicaAnoValidadeCartao() {
		click(CheckoutPageElementMapper.getCLICARANOVALIDADECARTAO());
	}
	
	public void clicaParcelamentoCartao() {
		click(CheckoutPageElementMapper.getCLICARPARCELAMENTOCARTAO());
	}
	
	public void clicaUmaVezParcelamentoCartao()  {
		click(CheckoutPageElementMapper.getCLICARUMAVEZPARCELAMENTOCARTAO());
	}
	
	public void clicaContinuar() {
		click(CheckoutPageElementMapper.getCLICARCONTINUAR());
	}

	public void clicaProximo() {
		click(CheckoutPageElementMapper.getCLICARPROXIMO());
	}

	public void clicaCadastrarCartao() {
		click(CheckoutPageElementMapper.getCLICARCADASTRARCARTAO());
	}
	
	public void preenchoCT() throws MalformedURLException, InterruptedException {
		clicaCartaoCredito();
		preencheCartaoCredito();
		getDriver().hideKeyboard();
		preencheNomeCartao();
		driver.hideKeyboard();
		preencheCPFCartao();
		getDriver().hideKeyboard();
		preencheCodSegCartao();
		getDriver().hideKeyboard();
		clicaAbrirMesValidadeCartao();
		scrollDown();
		Thread.sleep(500);
		scrollDown();
		Thread.sleep(500);
		clicaMesValidadeCartao();
		Thread.sleep(500);
		clicaAbrirAnoValidadeCartao();
		Thread.sleep(500);
		clicaAnoValidadeCartao();
		Thread.sleep(500);
		clicaParcelamentoCartao();
		Thread.sleep(500);
		clicaUmaVezParcelamentoCartao();
		Thread.sleep(1000);
	}

	public void preenchoCTSCHUTZ() throws MalformedURLException, InterruptedException {
		clicaCartaoCredito();
		clicaNovoCartaoCredito();
		preencheCartaoCredito();
		Thread.sleep(1000);
		clicaProximo();
		preencheNomeCartao();
        clicaProximo();
        preencheValidadeCartaoSchutz();
		Thread.sleep(1000);
		clicaProximo();
		preencheCPFCartao();
		clicaCadastrarCartao();
		preencheCodSegCartao();
		getDriver().hideKeyboard();
		clicaUmaVezParcelamentoCartao();
		Thread.sleep(1000);
	}
	
	public void clicaBoleto() {
		click(CheckoutPageElementMapper.getCLICARBOLETO());
	}
	
	public void finalizarPedido()  {
		click(CheckoutPageElementMapper.getCLICARFINALIZARPEDIDO());
	}

	public void preenchoTELEFONE() {
		clear(CheckoutPageElementMapper.getPREENCHERTELEFONE());
		sendKeys(CheckoutPageElementMapper.getPREENCHERTELEFONE(), "51997435572");
	}
}
