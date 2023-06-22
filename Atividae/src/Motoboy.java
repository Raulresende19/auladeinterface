import java.time.LocalDate;

public class Motoboy extends Funcionario{
    public String carteiraDeHabilitacao;

    public Motoboy(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase, String carteiraDeHabilitacao) {
        super(nome, dataNascimento, genero, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "carteiraDeHabilitacao='" + carteiraDeHabilitacao + '\'' +
                '}';
    }
}
