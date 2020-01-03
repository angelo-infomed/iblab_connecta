package br.com.infomed.suites;

import br.com.infomed.test.CadastrarOcorrenciaTest;
import br.com.infomed.core.DriverFactory;
import br.com.infomed.pages.LoginPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        CadastrarOcorrenciaTest.class,
//        LoginTeste.class,
})

public class SuiteGeral {

    private static LoginPage page = new LoginPage();

    @BeforeClass
    public static void inicializa() {
        page.acessarTelaInicial();
        page.setLogin("admin");
        page.setSenha("fabricaD");
        page.entrar();
    }

    @AfterClass
    public static void finaliza(){
        DriverFactory.killDriver();
    }
}
