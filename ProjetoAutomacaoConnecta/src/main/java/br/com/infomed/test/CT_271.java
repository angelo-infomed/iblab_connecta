package br.com.infomed.test;

import br.com.infomed.core.BaseTestADMIN;
import br.com.infomed.pages.CadastroDeUsuarioPage;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import br.com.infomed.pages.LoginPage;
import br.com.infomed.utils.*;

//CT-271:Cadastro de usuário sem utilização de execução
public class CT_271 extends BaseTestADMIN {

    CadastroDeUsuarioPage pageCadastroUsuarioSemExecucao = new CadastroDeUsuarioPage();
    LoginPage usuarioCriado = new LoginPage();
    GeradorStringRandom loginGerado = new GeradorStringRandom();



    @Test
    public void cadastrar() throws InterruptedException, IOException {
    pageCadastroUsuarioSemExecucao.clicarLinkAdm();
    pageCadastroUsuarioSemExecucao.clicarLinkUser();
    pageCadastroUsuarioSemExecucao.clicarBotaoNovo();
    pageCadastroUsuarioSemExecucao.escreverCampoNome("testador");
    pageCadastroUsuarioSemExecucao.escreverEmail("testador@email.com.br");
    pageCadastroUsuarioSemExecucao.escreverLogin(loginGerado.getLoginRandom());
    pageCadastroUsuarioSemExecucao.escreverSenha("testador1234");
    pageCadastroUsuarioSemExecucao.validarSenha("testador1234");
    pageCadastroUsuarioSemExecucao.trocarSenha("N");
    pageCadastroUsuarioSemExecucao.selecionarPerfilPrestador();
    pageCadastroUsuarioSemExecucao.selecionarPapelPrestador("Prestador");
    pageCadastroUsuarioSemExecucao.codPrestador("87210409");
    pageCadastroUsuarioSemExecucao.naoRegistroDeExecucao("Não");
    pageCadastroUsuarioSemExecucao.guiaBeneficiario();
    pageCadastroUsuarioSemExecucao.guiaInternacao();
    pageCadastroUsuarioSemExecucao.guiaProrrogacao();
    pageCadastroUsuarioSemExecucao.clicarAdicionar();
    String loginCriado = pageCadastroUsuarioSemExecucao.obterLogin();
    pageCadastroUsuarioSemExecucao.clicarSalvar();
    pageCadastroUsuarioSemExecucao.clicarOk();
    pageCadastroUsuarioSemExecucao.clicarMenu();
    usuarioCriado.logar(loginCriado, "testador1234");
    Assert.assertEquals("Bem vindo(a),  testador", usuarioCriado.bemVindoTestador());
    }

}
