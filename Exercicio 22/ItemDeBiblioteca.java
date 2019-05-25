package livro;
public interface ItemDeBiblioteca {
    public boolean isEmprestado();
    public void empresta();
    public void devolve();
    public String localiza();
    public String apresentaDescriçao();
}
