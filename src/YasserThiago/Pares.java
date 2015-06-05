package YasserThiago;

import java.util.ArrayList;
import java.util.Collections;

public class Pares {

	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<String>();

		alunos.add("|  Marcus   |");
		alunos.add("|  Thiago   |");
		alunos.add("| Raphael B.|");
		alunos.add("|  Juliana  |");
		alunos.add("|  Eduardo  |");
		alunos.add("|   Amanda  |");
		alunos.add("|  Abimael  |");
		alunos.add("| Guilherme |");
		alunos.add("|   Lucas   |");
		alunos.add("| Rafael R. |");
		alunos.add("|   Yasser  |");
		alunos.add("|   Johan   |");

		Collections.sort(alunos);
		String[][] matriz = gerarMatriz(alunos);

		String aluno1;
		String aluno2;
		String aux;
		Collections.shuffle(alunos);

		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < alunos.size(); i = i + 2) {
			aluno1 = alunos.get(i);
			aluno2 = alunos.get(i + 1);
			
			int teste = aluno1.compareTo(aluno2);
						
			if (teste > 0) {
				aux = aluno1;
				aluno1 = aluno2;
				aluno2 = aux;
			}

			for (int j = 0; j < matriz.length; j++) {
				if (matriz[j][0].toString().equals(aluno2)) {
					index1 = j;
				}
				if (matriz[0][j].toString().equals(aluno1)) {
					index2 = j;
				}
			}

			matriz[index1][index2] = "|     X     |";
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static String[][] gerarMatriz(ArrayList<String> alunos) {
		String[][] matriz = new String[13][13];
		int cont = 0;
		for (int i = 1; i < matriz.length; i++) {
			matriz[0][i] = alunos.get(cont).toString();
			cont++;
		}

		Collections.reverse(alunos);
		cont = 0;
		for (int i = 1; i < matriz.length; i++) {
			matriz[i][0] = alunos.get(cont).toString();
			cont++;
		}

		cont = 12;
		for (int i = 0; i < matriz.length; i++) {
			if (i != 0) {
				matriz[i][cont] = "|||||||||||||";
				cont--;
			}
			for (int j = 0; j < matriz.length; j++) {

				if (matriz[i][j] == null) {
					matriz[i][j] = "|           |";
				}
			}
		}
		return matriz;
	}

}
