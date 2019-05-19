package ExerciciosPOO;
public class PacienteClinica extends Pessoa{
    private String planoSaude;
    
    public PacienteClinica(String _nome, String _identidade, Data _dtNasc, String _planoSaude) {
	super(_nome, _identidade, _dtNasc);
	this.setPlanoSaude(_planoSaude);
    }
    
    public PacienteClinica(String _nome, String _identidade, String _dtNascStr, String _planoSaude) throws Exception {
	super(_nome, _identidade, _dtNascStr);
	this.setPlanoSaude(_planoSaude);
    }
    
    public PacienteClinica(String _nome, String _identidade, int _diaNasc, int _mesNasc, int _anoNasc, String _planoSaude) throws Exception {
	super(_nome, _identidade, _diaNasc, _mesNasc, _anoNasc);
	this.setPlanoSaude(_planoSaude);
    }

    public String getPlanoSaude() {
        return this.planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append(super.toString());
        dados.append(", planoSaude: ");
        dados.append(this.getPlanoSaude());
        return dados.toString();
    }
    
    
    
}
