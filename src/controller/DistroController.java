package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DistroController {

	private String os() {
		String soNome = System.getProperty("os.name");
		return soNome;
	}

	public void exibeDistro() {
		String soNome = os();
		String nome = null;
		String versao = null;

		if (!soNome.contains("Linux")) {
			System.err.println("Sistema Operacional diferente de Linux, não é possivel continuar nesse sistema!");
		} else if (soNome.contains("Linux")) {
			try {
				Process p = Runtime.getRuntime().exec("cat /etc/os-release");
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				String[] separador;

				while (linha != null) {
					if (linha.contains("NAME")) {
						separador = linha.split("=");
						nome = separador[1];
						separador = null;
					} else if (linha.contains("VERSION_ID")) {
						separador = linha.split("=");
						versao = separador[1];
						break;
					}
					linha = buffer.readLine();
				}

			}
			catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Nome da distribuicao: " + nome + "\nVersao: " + versao);
		}
	}
}
