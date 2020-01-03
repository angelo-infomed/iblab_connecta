package br.com.infomed.pages;

import br.com.infomed.utils.enums.OcorrenciaTipoEnum;
import br.com.infomed.core.BasePage;
import org.openqa.selenium.By;

public class RegistroOcorrenciaPage extends BasePage {


	/* Dados do Registro de Ocorrencia */

	public String getProtocolo() {
		return obterValorCampo("id_protocolo");
	}

	public void setTipoOcorrencia(OcorrenciaTipoEnum tipo) {
		selecionarCombo(By.id("id_tipo"), tipo.toString());
	}

	public String getSituacao() {
		return obterValorCampo("id_sts_default");
	}

	public void setDataOcorrencia(String texto) {
		escrever("id_data_ocorrencia", texto);
	}

	/* dados pessoais */

	public void setNome(String texto) {
		escrever("id_morador_nome", texto);
	}

	public void setCPF(String texto) {
		escrever("id_morador_cpf", texto);
	}

	public void setTelefone(String texto) {
		escrever("id_morador_telefone", texto);
	}

	/* endereço */

	public void setEnderecoCep(String texto) {
		escrever("id_cep_morador", texto);
	}

	public void setEnderecoLogradouro(String texto) {
		escrever("id_logradouro_morador", texto);
	}

	public void setEnderecoNumero(String texto) {
		escrever("id_numero_res_morador", texto);
	}

	public void setEnderecoBairro(String texto) {
		escrever("id_bairro_res_morador", texto);
	}

	public void setEnderecoComplemento(String texto) {
		escrever("id_complemento_res_morador", texto);
	}

	/* Caracteristicas Socio-Economicas */
	
	public void setQuantidadeAdultos(Integer quantidade) {
		escrever("id_qtd_adultos", quantidade.toString());
	}
	
	public void setQuantidadeCriancas(Integer quantidade) {
		escrever("id_qtd_criancas", quantidade.toString());
	}
	
	public void setQuantidadeIdosos(Integer quantidade) {
		escrever("id_qtd_idosos", quantidade.toString());
	}
	
	public void setQuantidadeEspeciais(Integer quantidade) {
		escrever("id_qtd_especiais", quantidade.toString());
	}
	
	public void clicarNaoInformado() {
		clicarCheck("id_nao_informa");
	}
	
	/* 	Descricao do Registro de Ocorrencia */
	
	public void setDescricaoRegistroOcorrencia(String descricao) {
		escrever("id_descricao_os", descricao);
	}


	/* Buttons */

	public void clicarBotaoCancelar() {
		clicarBotao("/html/body/div/div[1]/section[2]/div/div/form/div/div/div/a");
	}

	public void clicarBotaoSalvar() {
		clicarBotao("/html/body/div/div[1]/section[2]/div/div/form/div/div/div/button");
	}



}