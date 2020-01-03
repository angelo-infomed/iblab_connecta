package br.com.infomed.pages;


import org.openqa.selenium.By;

import br.com.infomed.core.BasePage;
import br.com.infomed.core.DriverFactory;

//Locators ATT
public class LoginPage extends BasePage {
	

	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("http://jpa-apl201.infomedbenner.com.br/connecta_automacao/");
	}

	public void setLogin(String texto) {
		escrever("txbUsuario", texto);

	}
	public void setSenha(String texto){

		escrever("txbSenha", texto);
	}
	
	public void entrar(){

		clicarBotao(By.id("btnEntrar"));
	}
	/*
	public void sair(){
		clicarBotao("//span[.='None']");
	}
	
	public void deslogar(){
		clicarBotao("//a[.='Sair']");
	}
	
	public void esqueceuSenha(){
		//clicarBotao("/html/body/div/div/form/small/a");
		clicarLink("Esqueceu a senha?");
	}
	
	public void setEmail(String texto){
		//escreverPorXpath("/html/body/div/div/form/fieldset/div/div/input", texto);
		escrever("id_email", texto);
	}
	
	public void enviarEmail(){
		clicarBotaoPorTexto("Enviar");
	}
	
	public void acessarEsqueciSenha(){
		DriverFactory.getDriver().get("http://eregular.fabrica.unipe.br:8050/autenticacao/password-reset/");
	}
	
	public void voltarBotao(){
		clicarBotaoPorTexto("Voltar");
	}
	*/
}
