package cafeteria;

public class Empregado extends Departamento {

    private int idEmpregado;
    private String nome;
    private String email;
    private String dataNasce;
    private double salario;

    private int idDepartamento;

    public Empregado(int idEmpregado, String nome, String email, String dataNasce, double salario, int idDepartamento) {
        super(idEmpregado, nome, email, dataNasce, salario);
        this.idEmpregado = idEmpregado;
        this.nome = nome;
        this.email = email;
        this.dataNasce = dataNasce;
        this.salario = salario;
        this.idDepartamento = idDepartamento;
    }

    public Empregado() {

    }

    public int getIdEmpregado() {
        return idEmpregado;
    }

    public void setIdEmpregado(int idEmpregado) {
        this.idEmpregado = idEmpregado;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNasce() {
        return dataNasce;
    }

    public void setDataNasce(String dataNasce) {
        this.dataNasce = dataNasce;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int getIdDepartamento() {
        return idDepartamento;
    }

    @Override
    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
}





