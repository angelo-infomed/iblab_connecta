package br.com.infomed.pages;


import org.openqa.selenium.By;

import br.com.infomed.core.BasePage;

public class Dashboard extends BasePage{
	
	public void clicarBotaoCollapse() {
		
		clicarBotao(By.xpath("//button[@type='button']"));
	}
}
