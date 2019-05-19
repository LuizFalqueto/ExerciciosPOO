package ExerciciosPOO;
public class Pessoa {
    private String nome;
    private String identidade;
    private Data data_nascimento;

    public Pessoa(String _nome, String _identidade, int _dia, int _mes, int _ano) throws Exception {
        this.setData_nascimento(new Data(_dia,_mes,_ano));
        this.nome = _nome;
        this.identidade = _identidade;
    }

    public Pessoa(String _nome, String _identidade, String _data_nascimento) throws Exception {
	this.setNome(_nome);
	this.setIdentidade(_identidade);
	this.setData_nascimento(new Data(_data_nascimento));
    }

    public Pessoa(String _nome, String _identidade, Data _data_nascimento) {
	this.setNome(_nome);
	this.setIdentidade(_identidade);
	this.setData_nascimento(data_nascimento);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentidade() {
        return this.identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public Data getData_nascimento() {
        return this.data_nascimento;
    }

    public void setData_nascimento(Data data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
    public double maxEmprestimo() {
	return 1000;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("Pessoa{ Nome: ");
        dados.append(this.getNome());
        dados.append(", identidade ");
        dados.append(this.getIdentidade());
        dados.append(", data nascimento ");
        dados.append(this.getData_nascimento());
        return dados.toString();
    }
    
    
}
