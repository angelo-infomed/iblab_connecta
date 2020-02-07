package br.com.infomed.core;

import java.io.File;
import java.io.IOException;

import br.com.infomed.pages.LoginPage;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTestADMIN {

	private LoginPage page = new LoginPage();

	@Rule
	public TestName testName = new TestName();

	@Before
	public void inicializa() {
		page.acessarTelaInicial();
		page.setLogin(SystemConst.ADMIN);
		page.setSenha(SystemConst.PASSWORDADMIN);
		page.entrar();
	}

	@After
	public void finaliza() throws IOException{
		TakesScreenshot ss = (TakesScreenshot) DriverFactory.getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
				File.separator + testName.getMethodName() + ".jpg"));

		if(Propriedades.FECHAR_BROWSER) {
			DriverFactory.killDriver();
		}
	}
}

