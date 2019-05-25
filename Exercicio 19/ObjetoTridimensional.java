package ponto2;

/**
 *
 * @author LuizGustavo
 */
public interface ObjetoTridimensional extends ObjetoGeometrico{
    /**
   	 * O método centro retorna o ponto em tres dimensões que corresponde ao centro
   	 * do objeto tridimensional.
   	 * @return uma instância da classe Ponto3D representando o centro do objeto
   	 *     	tridimensional.
     * @throws java.lang.Exception
   	 */
        @Override
        Ponto3D centro()throws Exception;
    
    /**
   	 * O método calculaSuperficie calcula a área da superficie do objeto tridimensional e retorna a área
   	 * como um valor do tipo double.
   	 * @return a área de superficie deste objeto tridimensional.
   	 */
   	double calculaSuperficie();
        
    /**
   	 * O método calculaVolume calcula o volume do objeto tridimensional e retorna o
   	 * volume como um valor do tipo double.
   	 * @return o volume deste objeto tridimensional.
   	 */
   	double calculaVolume();
}
