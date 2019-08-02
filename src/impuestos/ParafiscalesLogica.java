package impuestos;

import static constantes.ParafiscalesEnteros.NOVECIENTOS_MIL;
import static constantes.ParafiscalesDouble.*;
//clase hija para heredar la logica
public class ParafiscalesLogica extends ParafiscalesNombre{


public double calcularSalud(){
    if(this.getSalario() > NOVECIENTOS_MIL.getNumero()){

    return (this.getSalario() * PORCENTAJE_PUNTO_CUATRO.getDescuento());
}else{
        return (this.getSalario() * PORCENTAJE_PUNTO_DOS.getDescuento());
    }
}



    public double calcularPension(){
        if(this.getSalario() > NOVECIENTOS_MIL.getNumero()){

            return (this.getSalario() * PORCENTAJE_PUNTO_CINCO.getDescuento());
        }else{
            return (this.getSalario() * PORCENTAJE_PUNTO_TRES.getDescuento());
        }
    }

public double totalSalario(){
    return (this.getSalario() - (this.calcularSalud() + this.calcularPension()));
}
}
