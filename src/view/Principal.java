package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
		IArquivosController arqCont = new ArquivosController();
		String path = "//Users/T-Gamer/Desktop/Temp";
		String arq = "teste.csv";
		String nome = "Felipe";
		int cod = 4;
		String email="email@email.com";
		
		try {
			arqCont.verificaDirTemp(path);
			arqCont.imprimeCadastro(path,nome,cod);
			arqCont.insereCadastro(path,arq,cod, nome, email);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}