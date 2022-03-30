import java.util.Calendar;

public class Lancamento {
    
    private double valor;
    private Calendar dia;

    public Lancamento(double valor) {
        this.valor = valor;
        this.dia = Calendar.getInstance();
    }

    public Calendar getDia() {
        return dia;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Movimentacao de R$" + valor + " no Dia " + dia.toString();
    }
}
