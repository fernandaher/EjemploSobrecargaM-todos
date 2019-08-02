package constantes;

public enum ParafiscalesString {

    MENSAJE_NOMBRE("Emplead@: "),
    MENSAJE_BASE("Su salario base es: $"),
    MENSAJE_SALUD("Su descuento de salud es: $"),
    MENSAJE_PENSIÓN("Su descuento de pensión es: $"),
    MENSAJE_TOTAL_SALARIO("Su salario final es: $");

    private String mensaje;

    ParafiscalesString(String m) {
        this.mensaje = m;
    }

    public String getMensaje() {
        return mensaje;
    }
}
