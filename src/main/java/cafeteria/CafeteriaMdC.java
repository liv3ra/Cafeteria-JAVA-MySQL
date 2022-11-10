package cafeteria;

public class CafeteriaMdC {
    public static void main(String[] args) {

        Departamento departamento1 = new Departamento(1, "atendente", 1800.0);
        Departamento departamento2 = new Departamento(2,"cozinheiro", 3000.0);
        Departamento departamento3 = new Departamento(3, "garçom", 1200.0);

        Empregado empregado1 = new Empregado(1, "Anna", "miguel@gmail.com", "1997-04-03", 1800.0, 1);
        Empregado empregado2 = new Empregado(2, "Paulo", "joaoPaulo@gmail.com", "1998-02-03", 2000.0, 2);
        Empregado empregado3 = new Empregado(3, "Andre", "andre@gmail.com", "1978-01-03", 1200.0, 3);

        Cafe cafe1 = new Cafe(1, "Pimpinela", 2023.03, 1);
        Cafe cafe2 = new Cafe(1, "Três Corações", 2023.03, 2);
        Cafe cafe3 = new Cafe(1, "Favorito", 2023.02, 3);

        empregado1.setIdDepartamento(1);
        cafe2.setIdResponsavel(1);

        empregado2.setIdDepartamento(2);
        cafe1.setIdResponsavel(2);

        empregado3.setIdDepartamento(3);
        cafe3.setIdResponsavel(3);

        departamento3.setNome("garçom");

        departamento1.setNome("atendente");

        departamento2.setNome("cozinheiro");
    }
}
