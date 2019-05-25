/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponto2;

/**
 * A classe Circulo implementa as interfaces ObjetoGeometrico e Escalavel, e
 * representa um círculo cujo tamanho pode ser modificado em função do seu tamanho
 * anterior. Esta classe encapsula o ponto central do círculo e seu raio. Todos os
 * métodos declarados nas interfaces ObjetoGeometrico e Escalavel são implementados.
 */
public class CirculoEscalavel implements ObjetoGeometrico,Escalavel {
   	/**
   	 * Declaração dos campos da classe
   	 */
   	private Ponto2 centro;
   	private double raio;
 
   	/**
   	 * O construtor para a classe CirculoEscalavel, que recebe argumentos para
   	 * inicializar todos os campos da classe. Este é o construtor "completo".
   	 * @param centro o centro do círculo (uma instância da classe Ponto2D)
   	 * @param raio o raio do círculo
   	 */
   	public CirculoEscalavel(Ponto2 _centro,double _raio) {
         	this.centro = _centro; // Note o uso da palavra-chave this para marcar os campos
         	this.raio = _raio; 	// da classe que tem o mesmo nome dos argumentos
   	}
 
   	/**
   	 * O método centro retorna o ponto em duas dimensões que corresponde ao centro do
   	 * círculo. Neste caso, basta retornar a instância da classe Ponto2D que representa
   	 * o próprio centro.
   	 * @return uma instância da classe Ponto2D representando o centro do círculo
   	 */
   	public Ponto2 centro() {
         	return this.centro;
   	}
 
   	/**
   	 * O método calculaÁrea calcula a área do círculo e retorna a área como um valor do
   	 * tipo double.
   	 * @return a área deste círculo
   	 */
   	public double calculaÁrea() {
         	return Math.PI*raio*raio;
   	}
 
   	/**
   	 * O método calculaPerímetro calcula o perímetro do círculo e retorna o perímetro
   	 * como um valor do tipo double.
   	 * @return o perímetro deste círculo
   	 */
   	public double calculaPerímetro() {
         	return 2.0*Math.PI*this.raio;
   	}
 
   	/**
   	 * O método amplia modifica o raio do círculo de acordo com o valor passado como
   	 * argumento, efetivamente modificando o tamanho do círculo.
   	 * @param escala a escala para modificação do círculo
   	 */
   	public void amplia(double _escala) {
         	this.raio *= _escala;
   	}
 
   	/**
   	 * O método espelha modifica o centro do círculo para alterar a sua posição (fazendo
   	 * com que o círculo fique refletido nas suas coordenadas horizontais)
   	 */
   	public void espelha() throws Exception{
         	this.centro = new Ponto2(this.centro.getX()*(-1),this.centro.getY());
   	}
   	/**
   	 * O método toString retorna os valores dos campos do círculo formatados em uma
   	 * string.
   	 * @return uma string contendo uma representação dos campos do círculo
   	 */
   	public String toString() {
         	// Retorna diretamente uma string criada com os valores dos campos. O método
         	// toString da classe Ponto2D é chamado implicitamente.
         	return centro + "-" + this.raio;
   	}

    @Override
    public Ponto2 clona() {
        return this.centro;
    }
}


