import java.time.LocalDate;

class Cachorro {
    private String nome;
    private String raca;
    private char sexo;
    private LocalDate dtNascimento;
    private Pessoa pessoa;
    private double peso;
    private String[] vacinas = new String[30];

    public Cachorro() {
    }

    public Cachorro(String nome, String raca, char sexo, LocalDate dtNascimento) {
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.dtNascimento = dtNascimento;
    }

    public Cachorro(String nome, String raca, char sexo, LocalDate dtNascimento, double peso) {
        this(nome, raca, sexo, dtNascimento);
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String[] getVacinas() {
        return vacinas;
    }

    public void setVacinas(String[] vacinas) {
        this.vacinas = vacinas;
    }
}