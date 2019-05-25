package exercicio.pkg23;

/**
 *
 * @author LuizGustavo
 */
import java.util.Random;
import java.util.Collections;
import java.util.*;
public class Exercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Exercicio 23)A) Colocar todas as palavras de um texto ordenadas 
         *              alfabeticamente. Não pode haver repetição de palavras.
        */
        String texto = "eu Gosto de poo poo ...";
        String[] vet = texto.split(" ");
        Set<String> s = new TreeSet<String>();
        
        for(int i=0 ; i<vet.length; i++){
            s.add(new String(vet[i]));
            
        }
        System.out.println("A)");
        System.out.println("String: " + texto);
        System.out.println("String ordenado: " + s);
        System.out.println("\n");
        
        /**
         * Exercicio 23)B) Contar a frequencia das palavras de um texto
         */
        String Texto = "um dois dois tres tres tres";
        String[] vet1 = Texto.split(" ");
        Map<String,Integer> m = new HashMap<String,Integer>();
        
        for(int i= 0; i<vet1.length; i++){
         
            if(m.containsKey(vet1[i])){
                    int cont = m.get(vet1[i]);                                
                    m.put(new String(vet1[i]), new Integer(cont+1));
                }
            else{
                   m.put(new String(vet1[i]), new Integer(1)); 
            }
        }
        System.out.println("B)");
        System.out.println("Mapa: " + m);
        System.out.println("\n");
        
        /**
         * Exercicio 23)C) A partir da leitura de um texto, 
         *              gerar o mesmo com as palavras embaralhadas.
         */
        
        String text = "um dois tres tres";
        String[] vet2 = text.split(" ");
        List<String> embaralha = new ArrayList<String>();
        
        for(int i=0 ; i<vet2.length; i++){
            embaralha.add(new String(vet2[i]));
            
        }
        System.out.println("C)");
        System.out.println("Texto: " + text);
        Collections.shuffle(embaralha);
        System.out.println("Texto embaralhado" + embaralha);
        System.out.println("\n");
        
        /**
         * Exercicio 23)D) Gerar 20 números sorteados de 1 a 50 sem repetição 
         *              e depois exibi-los em ordem crescente.
         */
        
        Set<Integer> Lista = new TreeSet<Integer>();
        Random gerador = new Random();
        
        for(int i=0 ; i<20; i++){
            Lista.add(new Integer(gerador.nextInt(51)));
        }
        System.out.println("D)");
        System.out.println("Lista ordenada" + Lista);
        System.out.println("\n");
        
        
        /**
         * Exercicio 23)E) Receber uma lista de nomes de pessoas numa ordem qualquer. 
         *             Manter a coleção de nomes ordenada alfabeticamente, 
         *             mesmo enquanto a entrada estiver sendo feita, 
         *             e também manter um campo com a quantidade de ocorrências.
         */
        
        String texxt = "Luiz Ze Luiz Joao Lucas Fabio Ze Luiz";
        String[] veet = texxt.split(" ");
        Map<String,Integer> TreeM = new TreeMap<String,Integer>();
        
        for(int i= 0; i<veet.length; i++){
                if(TreeM.containsKey(veet[i])){
                    int cont = TreeM.get(veet[i]);                                
                    TreeM.put(new String(veet[i]), new Integer(cont+1));
                    cont++;
                }
                else{
                   TreeM.put(new String(veet[i]), new Integer(1)); 
                }
        }
        System.out.println("E)");
        System.out.println("Lista ordenada" + TreeM);
    }
    
}
