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
public class RetanguloEscalavel implements ObjetoGeometrico,Escalavel{
    private Ponto2 supEsq, infDir;

    public RetanguloEscalavel(Ponto2 _supEsq, Ponto2 _infDir) {
        this.supEsq = _supEsq;
        this.infDir = _infDir;
    }

    @Override
    public Ponto2 centro() throws Exception{
        Ponto2 center = new Ponto2((this.supEsq.getX()+this.infDir.getX())/2,(this.supEsq.getY()+this.infDir.getY())/2);
        return center;
    }

    @Override
    public double calculaÁrea() {
        double area = (this.supEsq.getY()-this.infDir.getY())*(this.infDir.getX()-this.supEsq.getX());
        return area;
    }

    @Override
    public double calculaPerímetro() {
       double perimetro = 2*(this.supEsq.getY()-this.infDir.getY()) + 2*(this.infDir.getX()-this.supEsq.getX());
       return perimetro;
    }

    @Override
    public void amplia(double escala) throws Exception{
        this.infDir = new Ponto2(this.infDir.getX()*escala,this.infDir.getY());
        this.supEsq = new Ponto2(this.supEsq.getX(),this.supEsq.getY()*escala);
    }

    @Override
    public void espelha() throws Exception{
       this.infDir = new Ponto2(this.infDir.getX()*(-1),this.infDir.getY());
       this.supEsq = new Ponto2(this.supEsq.getX()*(-1),this.supEsq.getY());
    }
    
    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("RetanguloEscalavel{ supEsq= ");
        dados.append(this.supEsq);
        dados.append(", infDir= ");
        dados.append(this.infDir);
        dados.append(" }");
        return dados.toString();
    }

    @Override
    public Ponto2 clona() throws Exception{
        return this.centro();
    }
}
