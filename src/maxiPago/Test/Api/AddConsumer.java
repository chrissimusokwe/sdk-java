package maxiPago.Test.Api;

import maxiPago.Gateway.Api;

public class AddConsumer {
	public static void main(String[] args) {
		
		Api api = new Api();
		
		try{
		api.AddConsumer("100", //ID_LOJA
				"merchant_key", //CHAVE_LOJA
				"123.456.789-12", //CPF_CLIENTE
				"Fulando", //NOME_CLIENTE
				"de Tal",//SOBRENOME_CLIENTE
				"Rua da republica", //ENDERECO_CLIENTE
				"Casa", //ENDERECO2_CLIENTE
				"Guarulhos", //CIDADE_CLIENTE
				"SP", //ESTADO_CLIENTE
				"07000-000", //CEP_CLIENTE
				"(11) 99999-9999", //TELEFONE_CLIENTE 
				"email@email.com", //EMAIL_CLIENTE
				"dd/mm/aaaa", //DATA_NASCIMENTO_CLIENTE
				"123.456.789-12", //CPF_CNPJ_CLIENTE
				"M"); //SEXO_CLIENTE
		
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}