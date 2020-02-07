package br.com.infomed.test;

import br.com.infomed.core.BaseTestPrest;
import br.com.infomed.pages.GuiaSolicitacaoSPSADTPage;
import br.com.infomed.pages.HomePrestadorPage;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

//CT-68:Criação de guia SADT Local - Em Análise
public class CT_68 extends BaseTestPrest {

    GuiaSolicitacaoSPSADTPage pageSPSADT = new GuiaSolicitacaoSPSADTPage();
    HomePrestadorPage pageHome = new HomePrestadorPage();

    @Test
    public void criarGuiaSADTLocalEmAnalise() throws InterruptedException, IOException {

        pageHome.abrirMenuSolicitacao();
        pageHome.solicitacaoSPSADT();
        pageSPSADT.numeroDaCarteira("1001000021000");
        pageSPSADT.codigoNomeSolicitante("87210409");
        pageSPSADT.selectEletiva("1-Eletiva");
        pageSPSADT.selectComboTipoDoItem("Procedimento");
        pageSPSADT.codigoDescricao("40101010");
        pageSPSADT.textFieldQuantidade("2");
        pageSPSADT.btnAdicinarItensSolicitacao();

        pageSPSADT.btnMenu();
        pageSPSADT.btnEnviar();

        Assert.assertEquals("Em análise", pageSPSADT.obterStatus());
        Assert.assertEquals("0", pageSPSADT.obterValorQtdeAutorizada());
    }
}
