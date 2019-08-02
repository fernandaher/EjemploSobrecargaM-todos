package constantes;

public enum ParafiscalesEnteros {

    CERO(0),
    NOVECIENTOS_MIL(900000);
    private int numero;

    ParafiscalesEnteros(int i) {
        this.numero = i;

    }

    public int getNumero() {
        return numero;
    }
}
