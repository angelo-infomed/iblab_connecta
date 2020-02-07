package br.com.infomed.test;

import br.com.infomed.core.BaseTestPrest;
import br.com.infomed.pages.GuiaSolicitacaoSPSADTPage;
import br.com.infomed.pages.HomePrestadorPage;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

// CT-160:Criação de guia SADT Local - Autorizado Total
public class CT_160 extends BaseTestPrest {

    GuiaSolicitacaoSPSADTPage pageSPSADT = new GuiaSolicitacaoSPSADTPage();
    HomePrestadorPage pageHome = new HomePrestadorPage();

    @Test
    public void criarGuiaSADTLocalAutorizadoTotal() throws InterruptedException, IOException {

        pageHome.abrirMenuSolicitacao();
        pageHome.solicitacaoSPSADT();
        pageSPSADT.numeroDaCarteira("1001000021000");
        pageSPSADT.codigoNomeSolicitante("87210409");
        pageSPSADT.selectEletiva("1-Eletiva");
        pageSPSADT.selectComboTipoDoItem("Procedimento");
        pageSPSADT.codigoDescricao("10101012");
        pageSPSADT.textFieldQuantidade("2");
        pageSPSADT.btnAdicinarItensSolicitacao();

        pageSPSADT.btnMenu();
        pageSPSADT.btnEnviar();
        
        Assert.assertEquals("Autorizado", pageSPSADT.obterStatus());
        Assert.assertEquals("2", pageSPSADT.obterValorQtdeAutorizada());
    }
}
