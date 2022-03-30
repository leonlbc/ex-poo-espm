import java.util.Calendar;

public class Lancamento {
    
    private double valor;
    private Calendar dia;

    public Lancamento(double valor, Calendar dia) {
        this.setValor(valor);
        this.setDia(Calendar.getInstance());
    }

    public Calendar getDia() {
        return dia;
    }

    public void setDia(Calendar dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
