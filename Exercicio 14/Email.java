package exercicio.pkg14;

import java.util.Objects;

public class Email {
    private String descricaoDoEmail;

    public Email(String _descricaoDoEmail)throws Exception {
        this.setDescricaoDoEmail(_descricaoDoEmail);
    }

    public Email() {
        this.descricaoDoEmail = "Sem email";
    }   

    public String getDescricaoDoEmail() {
        return this.descricaoDoEmail;
    }

    public void setDescricaoDoEmail(String _descricaoDoEmail)throws Exception {
        int i;
        char c = '@';
        for(i=1; i<=_descricaoDoEmail.length() ; i++){
            if (_descricaoDoEmail.charAt(i) == c){
                this.descricaoDoEmail = _descricaoDoEmail;
            }
            if (i == _descricaoDoEmail.length()){
                throw new Exception ("Faltou o @");
            }
        }     
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
        final Email other = (Email) obj;
        if (!Objects.equals(this.descricaoDoEmail, other.descricaoDoEmail)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("Email: ");
        dados.append(this.getDescricaoDoEmail());
        return dados.toString();
    }    
}
