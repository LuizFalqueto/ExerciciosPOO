package exercicio.pkg14;

import java.util.Objects;

public class Contato extends Email{
    private String nome;

    public Contato(String _descricaoDoEmail, String _nome) throws Exception{
        super(_descricaoDoEmail);
        this.setNome(_nome);
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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
        final Contato other = (Contato) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("Contato: ");
        dados.append(this.getNome());
        dados.append(super.toString());
        return dados.toString();
    }
    
    
    
}

   
