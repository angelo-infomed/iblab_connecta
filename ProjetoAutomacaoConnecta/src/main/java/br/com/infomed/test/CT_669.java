package br.com.infomed.test;

import br.com.infomed.core.BaseTestPrest;
import br.com.infomed.pages.GuiaSolicitacaoSPSADTPage;
import br.com.infomed.pages.HomePrestadorPage;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

//CT-669:CRIAÇÃO DE GUIA SADT LOCAL COM ANEXO QUIMOTERAPIA - EM ANÁLISE
public class CT_669 extends BaseTestPrest {
    GuiaSolicitacaoSPSADTPage pageSADTAnexoQuimioterapia = new GuiaSolicitacaoSPSADTPage();
    HomePrestadorPage pageHome = new HomePrestadorPage();

    @Test
    public void criarGuiaSADTAnexoQuimioterapiaEmAnalise() throws InterruptedException, IOException {

        pageHome.abrirMenuSolicitacao();
        pageHome.solicitacaoSPSADT();
        pageSADTAnexoQuimioterapia.numeroDaCarteira("1001000021000");
        pageSADTAnexoQuimioterapia.codigoNomeSolicitante("87210409");
        pageSADTAnexoQuimioterapia.selectEletiva("1-Eletiva");
        pageSADTAnexoQuimioterapia.selectComboTipoDoItem("Procedimento");
        pageSADTAnexoQuimioterapia.codigoDescricao("30307147");
        pageSADTAnexoQuimioterapia.textFieldQuantidade("2");
        pageSADTAnexoQuimioterapia.btnAdicinarItensSolicitacao();
        //Início do Anexo de Quimioterapia.
        pageSADTAnexoQuimioterapia.clicarBtnOk();
        pageSADTAnexoQuimioterapia.escreverPeso("7000");
        pageSADTAnexoQuimioterapia.escreverAltura("160");
        pageSADTAnexoQuimioterapia.escreverTelefone("999999999");
        pageSADTAnexoQuimioterapia.selectComboEstadiamento("I");
        pageSADTAnexoQuimioterapia.selectComboFinalidade("Curativa");
        pageSADTAnexoQuimioterapia.selectComboEcog("Totalmente ativo");
        pageSADTAnexoQuimioterapia.selectComboTipoQuimioterapia("1ª linha");
        pageSADTAnexoQuimioterapia.selectComboTumor("1-T1");
        pageSADTAnexoQuimioterapia.selectComboNódulo("1-N1");
        pageSADTAnexoQuimioterapia.selectComboMetástase("1-M1");
        pageSADTAnexoQuimioterapia.escreverPlanoTerapeutico("Plano Terapeutico");
        pageSADTAnexoQuimioterapia.escreverData("06/02/2020");
        pageSADTAnexoQuimioterapia.escreverCodMedicamento("90285050");
        pageSADTAnexoQuimioterapia.escreverDosagem("200");
        pageSADTAnexoQuimioterapia.selectComboViaAdm("Bucal");
        pageSADTAnexoQuimioterapia.escreverFrequencia("5");
        pageSADTAnexoQuimioterapia.selectComboUnidadeMedida("(AMP) Ampola");
        pageSADTAnexoQuimioterapia.escreverNumeroCiclos("5");
        pageSADTAnexoQuimioterapia.escreverCicloAtual("2");
        pageSADTAnexoQuimioterapia.escreverNumDiasDoCiclo("3");
        pageSADTAnexoQuimioterapia.escreverIntervaloCiclos("1");
        pageSADTAnexoQuimioterapia.btnAdicinarMedicamento();
        pageSADTAnexoQuimioterapia.btnEnviar();
        Assert.assertEquals("Em análise", pageSADTAnexoQuimioterapia.obterStatus());
        Assert.assertEquals("0", pageSADTAnexoQuimioterapia.obterValorQtdeAutorizada());
        Assert.assertEquals("30307147", pageSADTAnexoQuimioterapia.validarProcedimento());
        Assert.assertEquals("90285050", pageSADTAnexoQuimioterapia.validarMedicamento());

    }
}
