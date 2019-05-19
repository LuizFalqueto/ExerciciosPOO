package ExerciciosPOO;
public class Funcionario extends Pessoa{
    private Data data_admissao;
    private double salario;
    
    public Funcionario(String _nome, String _identidade, Data _data_nascimento, Data _data_admissao, double _salario) {
	super(_nome, _identidade, _data_nascimento);
	this.setData_admissao(_data_admissao);
	this.setSalario(_salario);
    }
    
    public Funcionario(String _nome, String _identidade, String _data_nascimento, String _data_admissao, double _salario) throws Exception {
	super(_nome, _identidade, _data_nascimento);
	this.setData_admissao(new Data(_data_admissao));
	this.setSalario(_salario);
    }
    
    public Funcionario(String _nome, String _identidade, int _diaNasc, int _mesNasc, int _anoNasc, int _diaAdm, int _mesAdm, int _anoAdm, double _salario) throws Exception {
	super(_nome, _identidade, _diaNasc, _mesNasc, _anoNasc);
	this.setData_admissao(new Data(_diaAdm, _mesAdm, _anoAdm));
	this.setSalario(_salario);
    }
    
    public Data getData_admissao() {
        return this.data_admissao;
    }

    public void setData_admissao(Data data_admissao) {
        this.data_admissao = data_admissao;
    }
    
    public void ajustaSalario(double _taxa) {
	this.salario += this.salario*_taxa;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double maxEmprestimo() {
	return this.getSalario();
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append(super.toString());
        dados.append(", data admissao: ");
        dados.append(this.getData_admissao());
        dados.append(", salario: ");
        dados.append(this.getSalario());
        return dados.toString();
    }
    
    
    
}
