package ponto2;

/**
 *
 * @author LuizGustavo
 */
public class Ponto3D extends Ponto2{
    private double z;
    
    public Ponto3D(double _x, double _y, double _z)throws Exception{
        super(_x,_y);
        this.setZ(_z);
    }
    
    public Ponto3D(Ponto3D _ponto)throws Exception{
        super(_ponto.getX(),_ponto.getY());
        this.setZ(_ponto.getZ());
    }

    public double getZ() {
        return z;
    }

    public void setZ(double _z) throws Exception{
        if(Ponto2.isLimite(_z)){
            this.z = _z;
        }else{
            throw new Exception ("valor de z fora dos limites");
        }        
    }
    
    public Ponto3D clonar() throws Exception {
         	return new Ponto3D(super.getX(), super.getY(), this.getZ());
    }
    
    public Ponto3D criaSwap() throws Exception {
         	return new Ponto3D(this.getZ(), super.getY(), super.getX());
    }
    
    public boolean temEixoComum(Ponto3D _ponto){
         	return super.getX() == _ponto.getX() || super.getY() == _ponto.getY() || this.getZ() == _ponto.getZ();
   	}
    
    static public double distancia(double x1, double y1, double z1, double x2, double y2, double z2){
         	return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)+(z1-z2)*(z1-z2));
   	}
    
    public double distancia(Ponto3D _ponto){
         	return Ponto3D.distancia(super.getX(),super.getY(),this.getZ(),_ponto.getX(),_ponto.getY(),this.getZ());
   	}
    
    public double distancia(double _x, double _y, double _z){
         	return Ponto3D.distancia(super.getX(),super.getY(),this.getZ(),_x,_y,_y);
   	}
    
    public double distanciaDaOrigem(){
         	return Ponto3D.distancia(super.getX(),super.getY(),this.getZ(),0,0,0);
   	}
    
    public int compareTo(Ponto3D _ponto){
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
         	final Ponto3D other = (Ponto3D) obj;
                
         	if (Double.doubleToLongBits(super.getX()) != Double.doubleToLongBits(other.getX()))
                	return false;
         	if (Double.doubleToLongBits(super.getY()) != Double.doubleToLongBits(other.getY()))
                	return false;
                if (Double.doubleToLongBits(this.getZ()) != Double.doubleToLongBits(other.getZ()))
                	return false;
         	return true;
   	}
   	public String toString(){
         	StringBuilder coord = new StringBuilder();
         	coord.append("(");
         	coord.append(super.getX());
         	coord.append(",");
         	coord.append(super.getY());
                coord.append(",");
                coord.append(this.getZ());
         	coord.append(")");
         	return coord.toString();
   	}
}
