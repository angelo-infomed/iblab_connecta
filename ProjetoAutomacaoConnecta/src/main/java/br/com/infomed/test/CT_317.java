package br.com.infomed.test;

import br.com.infomed.core.BaseTestADMIN;
import br.com.infomed.pages.CadastroAlteracaoPerfisPage;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
//CT-317:Cadastro/Alteração de Perfis
public class CT_317 extends BaseTestADMIN {

    CadastroAlteracaoPerfisPage pageCriarAlterarPerfis = new CadastroAlteracaoPerfisPage();
    @Test
    public void cadastrar() throws InterruptedException, IOException{
    pageCriarAlterarPerfis.clicarLinkAdm();
    pageCriarAlterarPerfis.clicarPerfis();
    pageCriarAlterarPerfis.clicarBotaoNovo();
    pageCriarAlterarPerfis.escreverCampoDescrição("prestadorteste");
    pageCriarAlterarPerfis.selecionarStatusAtivo("Ativo");
    pageCriarAlterarPerfis.clicarTodosServicos();
    pageCriarAlterarPerfis.clicarSalvar();
    Assert.assertEquals("Perfil inserido com sucesso.", pageCriarAlterarPerfis.perfilInseridoSucesso());
    pageCriarAlterarPerfis.clicarOk();
    pageCriarAlterarPerfis.selecionarRegistroPorPagina("50");
    pageCriarAlterarPerfis.clicarPerfilCriado();
    pageCriarAlterarPerfis.clicarAlterar();
    pageCriarAlterarPerfis.desmarcarEnvioArquivoXmlZip();
    pageCriarAlterarPerfis.clicarSalvar();
    Assert.assertEquals("Perfil alterado com sucesso.", pageCriarAlterarPerfis.perfilAlteradoSucesso());
    pageCriarAlterarPerfis.clicarOk();
    }
}
