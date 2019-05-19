package ponto;
public class Uso {
    public static void main(String[] args)throws Exception {
        try{
            double x=0,y=0;
            Ponto origem = new Ponto(0,0); 
            for(int i=0; i<3 ; i++){
               x++;
               y++;
               Ponto gerador = new Ponto(x,y);
               System.out.println(gerador);
               double d = origem.distancia(gerador);
               System.out.println(d);
            }
        }catch (Exception e){
        }
    }    
}
