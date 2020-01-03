package br.com.infomed.test;

import org.junit.Test;

import br.com.infomed.core.BaseTest;
import br.com.infomed.pages.PesquisaPage;

public class PesquisaTest extends BaseTest{
	
	private PesquisaPage pesquisaPage = new PesquisaPage();
	
	@Test
	
	public void testPesquisarOcorrencia() {
		
		pesquisaPage.ClicarPesquisarMenu();
		pesquisaPage.ClicarPesquisarOcorrencia();
		pesquisaPage.setCampoPesquisa("Fabrica");
		pesquisaPage.clicarComboNome();
		pesquisaPage.setBotaoPesquisar();
		pesquisaPage.clicarAnexar();
	}

}
