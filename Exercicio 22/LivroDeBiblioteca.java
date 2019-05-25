package livro;
public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{    
    public Emprestimo statusEmprestimo;
    public String localizaçao, descriçao;

    public LivroDeBiblioteca(String _titulo, String _autor, int _paginas, int _anoEdiçao, 
            Emprestimo _statusEmprestimo, String _localizacao, String _descricao) {
        super(_titulo, _autor, _paginas, _anoEdiçao);
        this.setStatusEmprestimo(_statusEmprestimo);
	this.setLocalizaçao(_localizacao);
	this.setLocalizaçao(_localizacao);
    }

    public Emprestimo getStatusEmprestimo() {
	return this.statusEmprestimo;
    }

    public void setStatusEmprestimo(Emprestimo _statusEmprestimo) {
	this.statusEmprestimo = _statusEmprestimo;
    }

    public String getLocalizaçao() {
        return this.localizaçao;
    }

    public void setLocalizaçao(String _localizaçao) {
        this.localizaçao = _localizaçao;
    }

    public String getDescriçao() {
        return this.descriçao;
    }

    public void setDescriçao(String _descriçao) {
        this.descriçao = _descriçao;
    }
    
    @Override
    public boolean isEmprestado() {
        if(this.getStatusEmprestimo() == Emprestimo.EMPRESTADO)
			return true;
		return false;
    }

    @Override
    public void empresta() {
        if(this.getStatusEmprestimo() == Emprestimo.DEVOLVIDO)
            this.setStatusEmprestimo(Emprestimo.EMPRESTADO);
    }

    @Override
    public void devolve() {
        if(this.isEmprestado() || (this.getStatusEmprestimo() == Emprestimo.EMATRASO) )
            this.setStatusEmprestimo(Emprestimo.DEVOLVIDO);
    }

    @Override
    public String localiza() {
        return this.getLocalizaçao();
    }

    @Override
    public String apresentaDescriçao() {
        return this.getDescriçao();
    }
    
    public String toString(){
        StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append(",statusEmprestimo: ");
		dados.append(this.getStatusEmprestimo());
		dados.append(", localizacao: ");
		dados.append(this.getLocalizaçao());
		dados.append(", descricao: ");
		dados.append(this.getDescriçao());
		return dados.toString();
    }
 }

