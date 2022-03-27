package view;

import java.util.concurrent.Semaphore;
import Controller.ThreadPorta;

public class Main {

	public static void main(String[] args) {
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);

		for (int idPessoa = 1; idPessoa < 5; idPessoa++) {
			Thread pessoa = new Thread pessoa(pessoa, semaforo);
			pessoa.start();
		}
	}
	
}