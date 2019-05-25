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
public class Paralelepipedo implements ObjetoTridimensional{
    private Ponto3D pontoInfEsq, pontoAltoDir;
    private final double a = this.pontoInfEsq.getX()-this.pontoAltoDir.getX();
    private final double b = this.pontoAltoDir.getY()-this.pontoInfEsq.getY();
    private final double c = this.pontoAltoDir.getZ()-this.pontoInfEsq.getZ();
    

    public Paralelepipedo(Ponto3D _pontoInfEsq, Ponto3D _pontoAltoDir) {
        this.pontoInfEsq = _pontoInfEsq;
        this.pontoAltoDir = _pontoAltoDir;
    }
    
    @Override
    public Ponto3D centro() throws Exception {
        Ponto3D center = new Ponto3D(this.a,this.b,this.c);
        return center;
    }

    @Override
    public double calculaSuperficie() {
        double superficie = 2*((this.a*this.b) + (this.b*this.c) + (this.a*this.c));
        return superficie;
    }

    @Override
    public double calculaVolume() {
        double volume = this.a*this.b*this.c;
        return volume;
    }

    @Override
    public double calculaÁrea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculaPerímetro() {
        double perimetro = 4*(this.a+this.b+this.c);
        return perimetro;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("Paralelepipedo{ pontoInfEsq= ");
        dados.append(this.pontoInfEsq);
        dados.append(", pontoAltoDir= ");
        dados.append(this.pontoAltoDir);
        dados.append(" }");
        return dados.toString();
    }   

    @Override
    public Ponto3D clona() throws Exception{
        Ponto3D clone = new Ponto3D(this.a,this.b,this.c);
        return clone;
    }
}
