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

    public boolean passouDias(int dias){
        int dias_passados = Calendar.DAY_OF_MONTH - dia.get(Calendar.DAY_OF_MONTH);
        if (dias_passados < dias) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dia " + dia.get(Calendar.DAY_OF_MONTH) +": R$" + valor + "\n";
    }
}
