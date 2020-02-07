package br.com.infomed.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.infomed.test.CT_160;
import br.com.infomed.test.CT_58;
import br.com.infomed.test.CT_60;
import br.com.infomed.test.CT_63;
import br.com.infomed.test.CT_68;

@RunWith(Suite.class)
@SuiteClasses({
//        CadastrarOcorrenciaTest.class,
       CT_60.class//,CT_58.class,CT_63.class,CT_68.class,CT_160.class
})

public class SuiteExemplo {
}
