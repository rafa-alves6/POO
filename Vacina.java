import java.time.LocalDate;

class Vacina {
    private String nome;
    private String lote;
    private LocalDate dtVencimento;

    public Vacina() {
    }

    public Vacina(String nome, String lote, LocalDate dtVencimento) {
        this.nome = nome;
        this.lote = lote;
        this.dtVencimento = dtVencimento;
    }

    public String getNome() {
        return nome;
    }

    public String getLote() {
        return lote;
    }

    public LocalDate getDtVencimento() {
        return dtVencimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public void setDtVencimento(LocalDate dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    @Override
    public String toString() {
        return "Nome = " + this.nome + " Lote = " + this.lote + " Data de Vencimento: " + this.dtVencimento;
    }
}