package cafeteria;

public class Departamento {

    private int idDepartamento;
    private String nome;
    private double salario;

    public Departamento(int idDepartamento, String nome, double salario) {
        this.idDepartamento = idDepartamento;
        this.nome = nome;
        this.salario = salario;
    }

    public Departamento() {

    }

    public Departamento(int idEmpregado, String nome, String email, String dataNasce, double salario) {
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

