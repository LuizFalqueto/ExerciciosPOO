package contabancaria;

import java.util.Objects;

public class Conta {
    private String  nomeCorrentista;
    private double saldo;
    static final double DEFAULT_TAXAJUROS =  0.5;
    private static double Juros = Conta.DEFAULT_TAXAJUROS;

    public Conta(String _nomeCorrentista, double _saldo)throws Exception {
        this.setNomeCorrentista(_nomeCorrentista);
        this.setSaldo(_saldo);
    }

    public Conta(double _saldo) {
        this.nomeCorrentista = "sem nome";
        this.saldo = corrigeSaldo(_saldo);
    }

    public String getNomeCorrentista() {
        return this.nomeCorrentista;
    }

    public void setNomeCorrentista(String _nomeCorrentista) {
        this.nomeCorrentista = _nomeCorrentista;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double _saldo) throws Exception{
       if(_saldo>=0){
           this.saldo = corrigeSaldo(_saldo);
       }
       else{
           throw new Exception("Saldo negativo.");
       }
    }

    public static double getJuros() {
        return Juros;
    }

    public static void setJuros(double Juros) {
        Conta.Juros = Juros;
    }
    
    public static double corrigeSaldo(double _saldo){
       double corrige = _saldo * Conta.getJuros();
       return corrige;
    }
    
    public int compareTo(Object obj){
        Conta aux = (Conta) obj;
            if(this.getSaldo() > aux.getSaldo()){
                return 1;
            }else if(this.getSaldo() < aux.getSaldo()){
                return -1;
            }
       return 0; 
    }

    public String toString() {
        StringBuilder dados  = new StringBuilder();
        dados.append("Conta {");
        dados.append("nomeCorrentista= ");
        dados.append(this.getNomeCorrentista());
        dados.append(", saldo= ");
        dados.append(this.getSaldo());
        dados.append("}");
        return dados.toString();
    }    
}
