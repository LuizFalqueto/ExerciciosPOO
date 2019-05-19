package ExerciciosPOO;
public class Diretor extends Chefe{
    private Data data_promocao;

    public Diretor(String _nome, String _identidade, Data _dtNasc, Data _dtAdmissao, double _salario, String _depto, Data _dataPromocao) {
        super(_nome, _identidade, _dtNasc, _dtAdmissao, _salario, _depto);
        this.setData_promocao(_dataPromocao);
    }

    public Diretor(String _nome, String _identidade, String _dtNascStr, String _dtAdmStr, double _salario, String _depto, String _dataPromocao) throws Exception {
        super(_nome, _identidade, _dtNascStr, _dtAdmStr, _salario, _depto);
        this.setData_promocao(new Data(_dataPromocao));
    }

    public Diretor(String _nome, String _identidade, int _diaNasc, int _mesNasc, int _anoNasc, int _diaAdm, int _mesAdm, int _anoAdm, double _salario, String _depto, int diaProm, int mesProm, int anoProm) throws Exception {
        super(_nome, _identidade, _diaNasc, _mesNasc, _anoNasc, _diaAdm, _mesAdm, _anoAdm, _salario, _depto);
        this.setData_promocao(new Data(diaProm,mesProm,anoProm));
    }

    public Data getData_promocao() {
        return data_promocao;
    }

    public void setData_promocao(Data data_promocao) {
        this.data_promocao = data_promocao;
    }
    
    public double maxEmprestimo() {
		return super.maxEmprestimo()*1.5;
    }

    @Override
    public String toString() {
        return "Diretor{" + "data_promocao=" + data_promocao + '}';
    }
}
