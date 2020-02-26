package br.com.apparezzo.elementMapper;

import br.com.apparezzo.utils.Utils;
import org.openqa.selenium.By;

public class MinhaContaPageElementMapper {

	public static By getNOMEUSERCADASTRADO(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='Olá, Douglas Golke']");}
		if (Utils.SCHUTZ) {return By.xpath("//*[@text='Douglas Golke']");}
		return null;
	}

	public static By getMEUPERFIL(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='MEU PERFIL']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getMINHASCOMPRAS(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='MINHAS COMPRAS']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getLISTADEDESEJOS(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='LISTA DE DESEJOS']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getMENSAGENS(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='MENSAGENS']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getAJUDAESUPORTE(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='AJUDA E SUPORTE']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getTERMOSEPRIVACIDADE(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='TERMOS E PRIVACIDADE']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getSAIR(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='SAIR']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getMINHASINFORMACOES(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='MINHAS INFORMAÇÕES']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getENDERECOS(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='ENDEREÇOS']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getDADOSDEPAGAMENTO(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='DADOS DE PAGAMENTO']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getALTERARSENHA (){
		if (Utils.AREZZO) {return By.xpath("//*[@text='ALTERAR SENHA']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getALTERAREMAIL(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='ALTERAR EMAIL']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getCREDITOSAREZZO(){
		if (Utils.AREZZO) {return By.xpath("//*[@text='CRÉDITOS AREZZO']");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getEDITARNOME(){
		if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[/android.widget.TextView[@text='NOME']]//android.widget.EditText");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getEDITARSOBRENOME(){
		if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[/android.widget.TextView[@text='SOBRENOME']]//android.widget.EditText");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getEDITAREMAIL(){
		if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[/android.widget.TextView[@text='EMAIL']]//android.widget.EditText");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getEDITARCPF(){
		if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[/android.widget.TextView[@text='CPF']]//android.widget.EditText");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getEDITARDATADENASCIMENTO(){
		if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[/android.widget.TextView[@text='DATA DE NASCIMENTO']]//android.widget.EditText");}
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

}
