package br.com.infomed.pages;

import org.openqa.selenium.By;

import br.com.infomed.core.BasePage;
import br.com.infomed.core.DriverFactory;

import static br.com.infomed.core.SystemConst.*;

//Locators ATT
public class LoginPage extends BasePage {
	

	public void acessarTelaInicial() {
		DriverFactory.getDriver().get(AUTOCONNECTA);
	}

	public void setLogin(String login) {
		writeByID("txbUsuario", login);

	}
	public void setSenha(String senha){

		writeByID("txbSenha", senha);
	}
	
	public void entrar(){

		clickBtnBy(By.id("btnEntrar"));
	}

	public void logar(String login, String senha){
		explicitWaitVisibilityElement("input[name='btnEntrar']");
		setLogin(login);
		setSenha(senha);
		entrar();
	}
	public String bemVindoTestador(){
		return getTextByXpath("//*[@class='modalBemvindo']//li");
	}
}
