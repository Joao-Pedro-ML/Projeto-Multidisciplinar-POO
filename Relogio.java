package Pacote;

import java.text.DecimalFormat;

public class Relogio {

	private int hora;
    private int minuto;
    private int segundo;

    public Relogio() {
        setHora(0, 0, 0);
    }

    public Relogio(int h) {
        setHora(h, 0, 0);
    }

    public Relogio(int h, int m) {
        setHora(h, m, 0);
    }

    public Relogio(int h, int m, int s) {
        setHora(h, m, s);
    }

    public Relogio(Relogio hora) {
        setHora(hora.hora, hora.minuto, hora.segundo);
    }

    public void setHora(int h, int m, int s) {

        this.hora = ((h >= 0 && h < 24) ? h : 0);
        this.minuto = ((m >= 0 && m <= 59) ? m : 0);
        this.segundo = ((s >= 0 && s <= 59) ? s : 0);

    }

    public String converterHora() {

        DecimalFormat doisDigitos = new DecimalFormat("00");
        return doisDigitos.format(this.hora) + " : " + doisDigitos.format(this.minuto) + " : "
                + doisDigitos.format(this.segundo);

    }

    public String toString() {
        DecimalFormat doisDigitos = new DecimalFormat("00");

        return ((hora == 12 || hora == 0) ? 12 : hora % 12) + " : " + doisDigitos.format(this.minuto) + " : "
                + doisDigitos.format(this.segundo) + (hora < 12 ? " AM" : " PM");
    }
	
}
