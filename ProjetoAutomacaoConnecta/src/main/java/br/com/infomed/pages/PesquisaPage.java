package br.com.infomed.pages;

import org.openqa.selenium.By;

import br.com.infomed.core.BasePage;

public class PesquisaPage extends BasePage{
	
	public void setCampoPesquisa(String texto) {
		//escrever(By.xpath("/html/body/div/div[1]/section[2]/div/div/form/div[2]/input"), texto);
		escreverPorXpath("//input[@name='codigo']", texto);
	}
	
	public void clicarComboBranco() {
		
		clicarBotao(By.xpath("//*[@id=\"selecao\"]"));
		selecionarCombo(By.xpath("//*[@id=\"selecao\"]"), "--------");
	}
	
	public void clicarComboNome() {
		
		clicarBotao(By.xpath("//*[@id=\"selecao\"]"));
		selecionarCombo(By.xpath("//*[@id=\"selecao\"]"), "Nome");
	}
	
	public void clicarComboEndereco() {
		
		clicarBotao(By.xpath("//*[@id=\"selecao\"]"));
		selecionarCombo(By.xpath("//*[@id=\"selecao\"]"), "Endere�o");
	}
	
	public void clicarComboOcorrencia() {
		
		clicarBotao(By.xpath("//*[@id=\"selecao\"]"));
		selecionarCombo(By.xpath("//*[@id=\"selecao\"]"), "N� Processo / Ocorr�ncia ");
	}
	
	public void setBotaoPesquisar() {
		clicarBotao(By.xpath("//button[.=' Pesquisar']"));
	}
	
	public void setBotaoVoltar() {
		clicarBotao(By.xpath("//button/../a"));
	}
	
	public void clicarAnexar() {
		clicarBotao(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div/table/tbody/tr/td[6]/a[3]"));
	}
	
	
	/********* ACESSO AO MENU ************/
	
	public void ClicarPesquisarMenu() {
		clicarBotao(By.xpath("/html/body/div/aside[1]/section/ul/li[5]/a/span[1]"));
	}
	
	public void ClicarPesquisarOcorrencia() {
		clicarBotao(By.xpath("/html/body/div/aside[1]/section/ul/li[5]/ul/li/a"));
	}

}

