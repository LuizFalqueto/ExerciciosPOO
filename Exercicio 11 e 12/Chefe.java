package ExerciciosPOO;
public class Chefe extends Funcionario{
    private String departamento;
    
    public Chefe(String _nome, String _identidade, Data _dtNasc, Data _dtAdmissao, double _salario, String _depto) {
	super(_nome, _identidade, _dtNasc, _dtAdmissao, _salario);
	this.setDepartamento(_depto);
    }
    
    public Chefe(String _nome, String _identidade, String _dtNascStr, String _dtAdmStr, double _salario, String _depto) throws Exception {
	super(_nome, _identidade, _dtNascStr, _dtAdmStr, _salario);
	this.setDepartamento(_depto);
    }
    
    public Chefe(String _nome, String _identidade, int _diaNasc, int _mesNasc, int _anoNasc, int _diaAdm, int _mesAdm, int _anoAdm, double _salario, String _depto) throws Exception {
	super(_nome, _identidade, _diaNasc, _mesNasc, _anoNasc, _diaAdm, _mesAdm, _anoAdm, _salario);
	this.setDepartamento(_depto);
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public double calculaMaxEmprestimo() {
	return super.maxEmprestimo()*2;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append(super.toString());
        dados.append(", departamneto: ");
        dados.append(this.getDepartamento());
        return dados.toString();
    }
    
    
}
