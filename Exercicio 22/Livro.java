package livro;
public class Livro {
    private String titulo, autor;
    private int paginas, anoEdiçao;
    
    public Livro(String titulo, String autor, int paginas, int anoEdiçao) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.anoEdiçao = anoEdiçao;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getAnoEdiçao() {
        return this.anoEdiçao;
    }

    public void setAnoEdiçao(int anoEdiçao) {
        this.anoEdiçao = anoEdiçao;
    }

    public String toString(){
        StringBuilder dados = new StringBuilder();
        dados.append(this.getTitulo());
        dados.append(" , ");
        dados.append(this.getAutor());
        dados.append(" , ");
        dados.append(this.getAnoEdiçao());
        return dados.toString();
    }
    
}
