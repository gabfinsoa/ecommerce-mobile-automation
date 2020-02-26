package br.com.apparezzo.elementMapper;

import br.com.apparezzo.utils.Utils;
import org.openqa.selenium.By;

public class CartPageElementMapper {

    public static By getCONCLUIRCOMPRA(){
        if (Utils.AREZZO) {return By.xpath("//*[@text='CONCLUIR COMPRA']");}
        if (Utils.SCHUTZ) {return By.xpath("//android.widget.TextView[@text='FINALIZAR COMPRA']");}
        return null;
    }

    public static By getCLICARAUMENTARQTD(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[@index='8']//android.view.ViewGroup[@index='2']/android.widget.TextView");}
        if (Utils.SCHUTZ) {return By.xpath("");}
        return null;
    }

    public static By getCLICARDIMINUIRQTD(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[@index='8']//android.view.ViewGroup[@index='0']/android.widget.TextView");}
        if (Utils.SCHUTZ) {return By.xpath("");}
        return null;
    }

    public static By getVERIFICARQTD(){
        if (Utils.AREZZO) {return By.xpath("//android.view.ViewGroup[@index='8']//android.widget.TextView[@index='1']");}
        if (Utils.SCHUTZ) {return By.xpath("");}
        return null;
    }

}