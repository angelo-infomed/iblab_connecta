package br.com.infomed.test;

import br.com.infomed.core.BaseTestPrest;
import br.com.infomed.pages.GuiaSolicitacaoInternacaoPage;
import br.com.infomed.pages.HomePrestadorPage;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

//CT-63:Guia Internação - Autorizado parcialmente
public class CT_63 extends BaseTestPrest {
    GuiaSolicitacaoInternacaoPage pageInternacao = new GuiaSolicitacaoInternacaoPage();
    HomePrestadorPage pageHome = new HomePrestadorPage();

    @Test
    public void cadastrarGuiaInternacaoAutParcial() throws InterruptedException, IOException {
        pageHome.abrirMenuSolicitacao();
        pageHome.solicitacaoInternacao();
        pageInternacao.numeroCarteira("1001000021000");
        pageInternacao.codNomeHospital("58670572");
        pageInternacao.caraterAtendimento("1-Eletiva");
        pageInternacao.tipoInternacao("1-Clínica");
        pageInternacao.regimeInternacao("1-Hospitalar");
        pageInternacao.acomodacaoSolicitada("18 - 60000112 - DIÁRIA COMPACTA DE ENFERMARIA DE 3 LEITOS COM BANHEIRO PRIVATIVO");
        pageInternacao.quantidadeAS("5");
        pageInternacao.indicacaoClinica("Paciente com défice de cálcio");
        pageInternacao.indicacaoAcidente("9-Não Acidentes");
        pageInternacao.tipoProcSolicitado("Procedimento");
        pageInternacao.codDescricaoPS("10101012");
        pageInternacao.quantidadePS("3");
        pageInternacao.botaoAdd();
        pageInternacao.menu();
        pageInternacao.enviar();
        Assert.assertEquals("Autorizado parcialmente", pageInternacao.statusAutorizado());
        Assert.assertEquals("3", pageInternacao.quantidadeAutorizada());
    }
}
