/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponto2;

/**
 *
 * @author LuizGustavo
 */
public class Esfera implements ObjetoTridimensional{
    private double raio;
    private Ponto3D centro;

    public Esfera(double raio, Ponto3D centro) {
        this.raio = raio;
        this.centro = centro;
    }
    
    @Override
    public Ponto3D centro() throws Exception {
        return this.centro;
    }

    @Override
    public double calculaSuperficie() {
        double areaSup = this.raio*this.raio*4*Math.PI;
        return areaSup;
    }

    @Override
    public double calculaVolume() {
        double volume = (4*Math.PI*this.raio*this.raio*this.raio)/3;
        return volume;
    }

    @Override
    public double calculaÁrea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculaPerímetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("Esfera{ raio= ");
        dados.append(this.raio);
        dados.append(", centro= ");
        dados.append(this.centro);
        dados.append(" }");
        return dados.toString();
    }

    @Override
    public Ponto3D clona() {
        return this.centro;
    }
    
    
    
}
