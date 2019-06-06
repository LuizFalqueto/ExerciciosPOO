/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteio;

/**
 *
 * @author Luiz Gustavo Falqueto
 */

import java.util.LinkedList;
import java.util.List;

public class ConjuntoSorteio {
	private List<Sorteio> grupo;

	ConjuntoSorteio() {
		grupo = new LinkedList<Sorteio>();
	}

	/**
	 * Insere uma instância da classe Sorteio
	 *
	 * @param _data data inicial para ser incluída na coleção
	 * @param _quantidade quantidade de sorteios que deverá realizar
	 * @throws Exception 
	 */
	public void insere(Data _data, int _quantidade) throws Exception {
		
		for(int i=0; i<_quantidade; i++) {
			Sorteio sort = null;
			sort = new Sorteio(_data.incrementa(1));
			this.grupo.add(sort);
		}
	}

	/**
	 * Sobreposição do método toString para retornar todo o conteúdo da coleção
	 * separando os elementos em linhas.
	 * @return retorna ums String com todos os dados
	 */
	public String toString() {
		StringBuilder dados = new StringBuilder();
		for (int i = 0; i < this.grupo.size(); i++)
			dados.append(this.grupo.get(i) + "\n");
		return dados.toString();
	}
}
