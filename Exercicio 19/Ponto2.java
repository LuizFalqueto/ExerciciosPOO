package ponto2;
public class Ponto2 {
    private double x, y ;
   	public static final double LIMITE_INF_DEFAULT = 0;
   	public static final double LIMITE_SUP_DEFAULT = 500;
   	private static double LIMITE_INF = Ponto2.LIMITE_INF_DEFAULT;
   	private static double LIMITE_SUP = Ponto2.LIMITE_SUP_DEFAULT;
 
   	public Ponto2() throws Exception {
         	this(0,0);
   	}
   	
        public Ponto2(double _x, double _y) throws Exception {
         	this.setX(_x);
         	this.setY(_y);
   	}
   	public static boolean isLimite(double coordenada) {
         	return coordenada >= Ponto2.LIMITE_INF && coordenada <= Ponto2.LIMITE_SUP;
   	}
   	public void setX(double _x)throws Exception{
         	if(Ponto2.isLimite(_x)) 	
                	this.x = _x;
         	else
                	throw new Exception ("valor de x fora dos limites");
   	}
   	public void setY(double _y)throws Exception{
         	if(Ponto2.isLimite(_y)) 	
                    this.y = _y;
         	else
                	throw new Exception ("valor de y fora dos limites");
   	}
   	public double getX(){
         	return this.x;
   	}
   	public double getY(){
         	return this.y;
   	}
   	public static double getLIMITE_INF() {
         	return Ponto2.LIMITE_INF;
   	}
   	public static double getLIMITE_SUP() {
         	return Ponto2.LIMITE_SUP;
   	}
   	public static void setLIMITE_INF(double inferior) {
         	Ponto2.LIMITE_INF = inferior;
   	}
   	public static void setLIMITE_SUP(double superior) {
         	Ponto2.LIMITE_SUP = superior;
   	}
   	public static double getLIMITE_SUP_DEFAULT() {
         	return LIMITE_SUP_DEFAULT;
   	}
   	public Ponto2 clonar() throws Exception {
         	return new Ponto2(this.getX(), this.getY());
   	}
   	public Ponto2 criaSwap() throws Exception {
         	return new Ponto2(this.getY(), this.getX());
   	}
   	public boolean temEixoComum(Ponto2 _ponto){
         	return this.getX() == _ponto.getX() || this.getY() == _ponto.getY();
   	}
   	static public double distancia(double x1, double y1, double x2, double y2){
         	return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
   	}
   	public double distancia(Ponto2 _ponto){
         	return Ponto2.distancia(this.getX(),this.getY(),_ponto.getX(),_ponto.getY());
   	}
   	public double distancia(double _x, double _y){
         	return Ponto2.distancia(this.getX(),this.getY(),_x,_y);
   	}
   	public double distanciaDaOrigem(){
         	return Ponto2.distancia(this.getX(),this.getY(),0,0);
   	}
   	public int compareTo(Ponto2 _ponto){
         	if (this.distanciaDaOrigem() > _ponto.distanciaDaOrigem())
                	return 1;
         	else if(this.distanciaDaOrigem() < _ponto.distanciaDaOrigem())
                	return -1;
         	else
                	return 0;
   	}
   	public boolean equals(Object obj) {
         	if (this == obj)
                	return true;
         	if (obj == null)
                	return false;
         	if (getClass() != obj.getClass())
                	return false;
         	final Ponto2 other = (Ponto2) obj;
         	if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
                	return false;
         	if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
                	return false;
         	return true;
   	}
   	public String toString(){
         	StringBuilder coord = new StringBuilder();
         	coord.append("(");
         	coord.append(this.getX());
         	coord.append(",");
         	coord.append(+this.getY());
         	coord.append(")");
         	return coord.toString();
   	}

}
