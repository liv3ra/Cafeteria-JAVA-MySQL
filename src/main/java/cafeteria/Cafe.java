package cafeteria;

public class Cafe extends Departamento{
    private int idCafe;
    private String nome;
    private double validade;

    private int idResponsavel;

    public Cafe(int idCafe, String nome, double validade, int idResponsavel) {
        super(idCafe, nome, validade);
        this.idCafe = idCafe;
        this.nome = nome;
        this.validade = validade;
        this.idResponsavel = idResponsavel;
    }

    public int getIdCafe() {
        return idCafe;
    }

    public void setIdCafe(int idCafe) {
        this.idCafe = idCafe;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValidade() {
        return validade;
    }

    public void setValidade(double validade) {
        this.validade = validade;
    }

    public int getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(int idResponsavel) {
        this.idResponsavel = idResponsavel;
    }
}

