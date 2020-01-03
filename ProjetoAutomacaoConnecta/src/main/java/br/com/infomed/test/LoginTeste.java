package br.com.infomed.test;

import br.com.infomed.core.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import br.com.infomed.pages.LoginPage;

public class LoginTeste {
	
	private LoginPage page = new LoginPage();


	@Test
	public void logar(){
		page.acessarTelaInicial();
		page.setLogin(page.logingConnecta("ADMIN"));
		page.setSenha("remote");
		page.entrar();
		page.obterTexto("//*[@id=\"form1\"]/header/ul[1]/li[1]");
	}
}
