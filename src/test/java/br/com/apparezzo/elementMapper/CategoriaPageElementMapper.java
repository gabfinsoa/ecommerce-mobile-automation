package br.com.apparezzo.elementMapper;

import br.com.apparezzo.utils.Utils;
import org.openqa.selenium.By;

public class CategoriaPageElementMapper {

	public static By getCLICAPRIMEIROSAPATO(){
		if (Utils.AREZZO) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]"); }
		if (Utils.SCHUTZ) {return By.xpath("");}
		return null;
	}

	public static By getCLICASEGUNDOSAPATO(){
		if (Utils.AREZZO) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]");}
		if (Utils.SCHUTZ) {return By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView");}
		return null;
	}

}
