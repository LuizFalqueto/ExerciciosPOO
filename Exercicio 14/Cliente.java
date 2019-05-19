package exercicio.pkg14;

import java.util.Objects;

public class Cliente extends Contato{
    private int celular;
    private String endereço;
    static final double DEFAULT_RENDAFAMILIAR = 2000.0;
    static private double rendaFamiliar = Cliente.DEFAULT_RENDAFAMILIAR;

    public Cliente(String _descricaoDoEmail, String _nome, int _celular, String _endereço) throws Exception {
        super(_descricaoDoEmail, _nome);
        this.setCelular(_celular);
        this.setEndereço(_endereço);
    }

    public Cliente(int celular, String endereço) throws Exception {
        super("Sem email", "Sem nome");
        this.celular = celular;
        this.endereço = endereço;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int _celular) {
        this.celular = _celular;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String _endereço) {
        this.endereço = _endereço;
    }

    public static double getRendaFamiliar() {
        return rendaFamiliar;
    }

    public static void setRendaFamiliar(double _rendaFamiliar) {
        Cliente.rendaFamiliar = _rendaFamiliar;
    }
    
    public String categoriaCliente(double _renda){
        String categoria;
        if(_renda < DEFAULT_RENDAFAMILIAR){
            categoria = "usual";
        }else{
            categoria = "top";
        }
        return categoria;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.celular != other.celular) {
            return false;
        }
        if (!Objects.equals(this.endereço, other.endereço)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append(super.toString());
        dados.append("Celular: ");
        dados.append(this.getCelular());
        dados.append("Endereço: ");
        dados.append(this.getEndereço());
        return dados.toString();
    }
    
    
}
