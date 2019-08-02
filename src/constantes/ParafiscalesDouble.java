package constantes;

public enum ParafiscalesDouble {

    PORCENTAJE_PUNTO_DOS(0.02),
    PORCENTAJE_PUNTO_TRES(0.03),
    PORCENTAJE_PUNTO_CUATRO(0.04),
    PORCENTAJE_PUNTO_CINCO(0.05);

    private double descuento;

    ParafiscalesDouble(double v){
        this.descuento = v;
    }

    public double getDescuento() {
        return descuento;
    }
}
