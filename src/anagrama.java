import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class anagrama {

	public static void main(String[] args) {
		//instruções para receber a palavra digitada pelo usuário
		//Scanner entrada = new Scanner(System.in);
		String entrada;
		entrada = JOptionPane.showInputDialog("Digite uma palavra qualquer:");
		String palavraTeste = entrada;
		//apresenta a resposta
		JOptionPane.showMessageDialog(null, "A palavra inserida tem " + contador(palavraTeste) + " pares de anagramas.");
	}

	
	public static int contador(String anagrama) {
		//cria o array para comparar as letras das strings, retornando o número de repetições
		ArrayList<String> subS = new ArrayList<String>();
		int x = 0;

		//percorre as substrings e testa
		for (int i = 1; i <= anagrama.length(); i++) {
			for (int j = 0; j <= anagrama.length() - i; j++) {
				subS.add(anagrama.substring(j, j + i));
			}
		}
		for (int i = 0; i < subS.size(); i++) {
			for (int j = i + 1; j < subS.size(); j++) {
				if (comparar(subS.get(i), subS.get(j)))
					x++;
			}
		}
		return x;
	}

	public static boolean comparar(String primeira, String segunda) {
		//variáveis de caracteres
		char verifica1[] = primeira.toCharArray();
		char verifica2[] = segunda.toCharArray();
		//ordenação de arrays
		Arrays.sort(verifica1);
		Arrays.sort(verifica2);
		//comparação das letras
		String a = new String(verifica1);
		String b = new String(verifica2);
		//retorno da equiparação
		return a.equals(b);
	}
}