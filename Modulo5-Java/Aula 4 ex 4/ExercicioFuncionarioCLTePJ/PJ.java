
public class PJ extends Funcionario{

    public PJ(){}

    public PJ(String nome, int horasTrabalhada) {
        super(nome, horasTrabalhada);
    }

    public double pagamento(int horasTrab, double valorHora){
        double pagamento;

        pagamento = valorHora * horasTrab;

        return pagamento;
    }

}
