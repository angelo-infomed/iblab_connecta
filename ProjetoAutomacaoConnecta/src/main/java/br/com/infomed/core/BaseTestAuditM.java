package br.com.infomed.core;

import br.com.infomed.pages.LoginPage;
import br.com.infomed.test.CT_400;
import br.com.infomed.utils.Utils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

import java.util.List;

public class BaseTestAuditM {

    private LoginPage page = new LoginPage();
    private Utils utils = new Utils();
    protected List<String> data;

    public void parseTipos(List<String> tipos, String n){
        data = utils.returnGuiaSolicitacaoSADTEmAnalise(tipos, n);
    }

    @Rule
    public TestName testName = new TestName();

    @Before
    public void inicializa() {

        page.acessarTelaInicial();
        page.setLogin(SystemConst.AUTOAUDITM);
        page.setSenha(SystemConst.PASSWORDAUTOAUDITM);
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