package ponto;
public class Ponto {
    private static double x,y;
    private final static double DEFAULT_LIMITEINFERIOR = 0;
    private final static double DEFAULT_LIMITESUPERIOR = 500;
    private static double limiteInferior = Ponto.DEFAULT_LIMITEINFERIOR;
    private static double limiteSuperior = Ponto.DEFAULT_LIMITESUPERIOR;
    
    //3 CONSTRUTORES SOBRECARREGADOS
    public Ponto()throws Exception{
        this.setPonto(0,0);
    }
    
    public Ponto(double _x, double _y)throws Exception {
        this.setPonto(_x,_y);
    }
    
    public Ponto(String _ponto)throws Exception {
        this.setPonto(_ponto);
    }

    //GET'S AND SETTER'S
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }

    public void setX(double _x)throws Exception {
        if(_x > DEFAULT_LIMITESUPERIOR || _x < DEFAULT_LIMITEINFERIOR){
            throw new Exception("Coordenada x fora do limite.");
        }
        this.x = _x;
    }

    public void setY(double _y)throws Exception {
        if(_y > DEFAULT_LIMITESUPERIOR || _y < DEFAULT_LIMITEINFERIOR){
            throw new Exception("Coordenada y fora do limite.");
        }
        this.y = _y;
    }
    
    public void setXY(double _x, double _y)throws Exception {
        if(_x > DEFAULT_LIMITESUPERIOR || _x < DEFAULT_LIMITEINFERIOR){
            throw new Exception("Coordenada x fora do limite.");
        }
        if(_y > DEFAULT_LIMITESUPERIOR || _y < DEFAULT_LIMITEINFERIOR){
            throw new Exception("Coordenada y fora do limite.");
        }
        this.x = _x;
        this.y = _y;
    }
    
    public void setPonto(String _ponto)throws Exception{
        if ((_ponto.substring(0,1).equals("(")) && (_ponto.indexOf(")") > 1)){//verifica se as coordenadas estao entre parenteses
            x = Double.parseDouble(_ponto.substring(1,_ponto.indexOf(",")));
            y = Double.parseDouble(_ponto.substring(_ponto.indexOf(",")+1,_ponto.indexOf(")")));
            this.setXY(x,y);
        }else{
            throw new Exception("Coordenadas fora do padrao: (x,y).");
        }
    }
    
    public void setPonto(double _x,double _y)throws Exception{
       this.setXY(_x,_y);
    }
    
    public static void setLimiteSuperior(double _Limite){
            Ponto.limiteSuperior = _Limite;
    }
    
    public static void setLimiteInferior(double _Limite){
            Ponto.limiteInferior = _Limite;
    }

    public boolean equals(Ponto _obj) {
        if ((this.getX() == _obj.getX()) && (this.getY() == _obj.getY())) {
            return true;
	}
        return false;
    }
    
    public Ponto criaSwap(double _x, double _y)throws Exception{
        Ponto invertido = new Ponto(_y, _x);
        return invertido;
    }
    
    public Ponto clonar(Object obj)throws Exception{
        Ponto clone = new Ponto(this.getX(),this.getY());
        return clone;
    }
    
    public boolean temEixoComum(Ponto _obj)throws Exception{
        if((this.getX() == _obj.getX()) || (this.getY() == _obj.getY())){
            return true;
        }
        return false;
    }
    
    static public double distancia(double x1, double y1, double x2, double y2){
        double d = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return d;
    }
    
    //Versões sobrecarregadas do metodo distancia()
    public double distancia(double _x, double _y)throws Exception{
        return Ponto.distancia(this.getX(),this.getY(),_x,_y);
    }
    
    public double distanciaDaOrigem(){
        return Ponto.distancia(this.getX(),this.getY(),0,0);
    }
    
    public double distancia(Ponto _aux) {
	return Ponto.distancia(this.getX(),this.getY(),_aux.getX(),_aux.getY());		
    }
    
    public int compareTo(Ponto ponto2)throws Exception{
        if (this.distanciaDaOrigem() > ponto2.distanciaDaOrigem()){
            return 1;
        }
        if (this.distanciaDaOrigem() < ponto2.distanciaDaOrigem()){
            return -1;
        }
        return 0;
    }
    
    public String toString() {
        StringBuilder xy = new StringBuilder(); 
        xy.append("(");
        xy.append(this.getX());
        xy.append(",");
        xy.append(this.getY());
        xy.append(")");
        return xy.toString();         
    }     
}
