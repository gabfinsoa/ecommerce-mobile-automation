package br.com.apparezzo.elementMapper;


import br.com.apparezzo.utils.Utils;
import org.openqa.selenium.By;

public class CheckoutPageElementMapper {

    public static By getCRIARCONTA(){
        if (Utils.AREZZO) {return By.xpath("//*[@text='CRIAR CONTA AREZZO']");}
        if (Utils.SCHUTZ) {return By.xpath("//*[@text='CADASTRE-SE']");}
        return null;
    }

    public static By getEMAILCADASTRO(){
        if (Utils.AREZZO) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.EditText");}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText");}
        return null;
    }

    public static By getNOMECADASTRO(){
        if (Utils.AREZZO) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.EditText");}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");}
        return null;
    }

    public static By getSOBRENOMECADASTRO(){
        if (Utils.AREZZO) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.EditText");}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");}
        return null;
    }

    public static By getSENHACADASTRO(){
        if (Utils.AREZZO) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.EditText");}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText");}
        return null;
    }

    public static By getCONFIRMASENHACADASTRO(){
        if (Utils.AREZZO) {return By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.EditText");}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText");}
        return null;
    }

    public static By getCLICARTERMOS(){
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup");}
        return null;
    }

    public static By getCADASTRARCONTA(){
        if (Utils.AREZZO || Utils.SCHUTZ){return By.xpath("//android.widget.TextView[@text='CADASTRAR']");}
        return null;
    }

    public static By getPREENCHERDATANASCIMENTO(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText");}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");}
        return null;
    }

    public static By getPREENCHERCPF(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText");}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");}
        return null;
    }

    public static By getPREENCHERTELEFONE(){
        if (Utils.AREZZO) {}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText");}
        return null;
    }

    public static By getCLICARENVIAR(){
        if (Utils.AREZZO) {return By.xpath("//android.widget.TextView[@text='ENVIAR']");}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.TextView[@text='CONFIRMAR']");}
        return null;
    }

    public static By getPREENCHERCEP(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='CEP']]//android.widget.EditText");}
        if (Utils.SCHUTZ) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='CEP']]//android.widget.EditText");}
        return null;
    }

    public static By getPREENCHERNUMEROENDERECO(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='NÚMERO']]//android.widget.EditText");}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.EditText");}
        return null;
    }

    public static By getDESTINATARIOENDERECO(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='DESTINATÁRIO']]//android.widget.EditText");}
     //   if (Utils.SCHUTZ) {return By.xpath("");}
        return null;
    }

    public static By getIDENTIFICACAOENDERECO(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='IDENTIFICAÇÃO DO ENDEREÇO']]//android.widget.EditText");}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[10]/android.widget.EditText");}
        return null;
    }

    public static By getTELEFONEENDERECO(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='TELEFONE']]//android.widget.EditText");}
    //    if (Utils.SCHUTZ) {return By.xpath("");}
        return null;
    }

    public static By getCLICARSALVARENDERECO(){
        if (Utils.AREZZO) {return By.xpath("//android.widget.TextView[@text='SALVAR ENDEREÇO']");}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.TextView[@text='ADICIONAR ENDEREÇO']");}
        return null;
    }

    public static By getCLICARUTILIZARENDERECO(){
        if (Utils.AREZZO) {return By.xpath("//android.widget.TextView[@text='UTILIZAR ESTE ENDEREÇO']");}
        return null;
    }

    public static By getCLICARFORMADEENTREGAEXPRESSO(){
        if (Utils.AREZZO) {return By.xpath("//*[@text='EXPRESSO']");}
        if (Utils.SCHUTZ) {return By.xpath("//*[contains(@text,'Expresso')]");}
        return null;
    }

    public static By getCLICARIRPARAPAGAMENTO(){
        if (Utils.AREZZO) {return By.xpath("//*[@text='IR PARA O PAGAMENTO']");}
        if (Utils.SCHUTZ) {return By.xpath("");}
        return null;
    }

    public static By getCLICARCARTAODECREDITO(){
        if (Utils.AREZZO) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup[1]/android.view.ViewGroup");}
        if (Utils.SCHUTZ) {return By.xpath("");}
        return null;
    }

    public static By getCLICAREMCARTAODECREDITO(){
        if (Utils.AREZZO) {return By.xpath("//*[@text='CARTÃO DE CRÉDITO']");}
        if (Utils.SCHUTZ) {return By.xpath("//*[@text='Cartão de Crédito']");}
        return null;
    }

    public static By getCLICAREMNOVOCARTAODECREDITO(){
        if (Utils.SCHUTZ) {return By.xpath("//*[@text='Novo cartão de crédito']");}
        return null;
    }

    public static By getPREENCHERCARTAOCREDITO(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='NÚMERO DO CARTÃO']]//android.widget.EditText");}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");}
        return null;
    }

    public static By getPREENCHERNOMECARTAO(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='NOME DO TITULAR']]//android.widget.EditText");}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");}
        return null;
    }

    public static By getPREENCHERCPFCARTAO(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='CPF']]//android.widget.EditText");}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");}
        return null;
    }

    public static By getPREENCHERCODSEGCARTAO(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='CÓDIGO DE SEGURANÇA']]//android.widget.EditText");}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");}
        return null;
    }

    public static By getPREENCHERVALIDADECTSCHUTZ(){
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");}
        return null;
    }

    public static By getCLICARABRIRMESVALIDADECARTAO(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='MÊS DE VALIDADE']]");}
        if (Utils.SCHUTZ) {return By.xpath("");}
        return null;
    }

    public static By getCLICARMESVALIDADECARTAO(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='10']]//android.widget.TextView");}
        if (Utils.SCHUTZ) {return By.xpath("");}
        return null;
    }

    public static By getCLICARABRIRANOVALIDADECARTAO(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='ANO DE VALIDADE']]");}
        if (Utils.SCHUTZ) {return By.xpath("");}
        return null;
    }

    public static By getCLICARANOVALIDADECARTAO(){
        if (Utils.AREZZO) {return By.xpath("//*[@text='2020']");}
        if (Utils.SCHUTZ) {return By.xpath("");}
        return null;
    }

    public static By getCLICARPARCELAMENTOCARTAO(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='PARCELAMENTO']]");}
        if (Utils.SCHUTZ) {return By.xpath("");}
        return null;
    }

    public static By getCLICARUMAVEZPARCELAMENTOCARTAO(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[android.widget.TextView[@text='PARCELAMENTO']]//android.view.ViewGroup[@index='0']//android.widget.TextView");}
        if (Utils.SCHUTZ) {return By.xpath("//*[@text='1x']");}
        return null;
    }

    public static By getCLICARCONTINUAR(){
        if (Utils.AREZZO) {return By.xpath("//*[@text='CONTINUAR']");}
        if (Utils.SCHUTZ) {return By.xpath("//*[contains(@text,'AVANÇAR')]");}
        return null;
    }

    public static By getCLICARPROXIMO(){
        if (Utils.SCHUTZ) {return By.xpath("//*[@text='Próximo']");}
        return null;
    }

    public static By getCLICARCADASTRARCARTAO(){
        if (Utils.SCHUTZ) {return By.xpath("//*[contains(@text,'Cadastrar')]");}
        return null;
    }

    public static By getCLICARBOLETO(){
        if (Utils.AREZZO) {return By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[1]");}
        if (Utils.SCHUTZ) {return By.xpath("//*[contains(@text,'Boleto')]");}
        return null;
    }

    public static By getCLICARFINALIZARPEDIDO(){
        if (Utils.AREZZO) {return By.xpath("//android.widget.TextView[@text='FINALIZAR COMPRA']");}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.TextView[@text='FINALIZAR PEDIDO']");}
        return null;
    }

}

