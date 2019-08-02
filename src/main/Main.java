package main;

import impuestos.ParafiscalesLogica;
import static constantes.ParafiscalesString.*;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {

    public static void main(String[] args){
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        simbolo.setDecimalSeparator(',');
        DecimalFormat formateador = new DecimalFormat("###,###.##", simbolo);

        ParafiscalesLogica parafiscalesLogica = new ParafiscalesLogica();


        String nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del empleado");
        String salario = JOptionPane.showInputDialog(null, "Ingresa el salario del empleado");

        parafiscalesLogica.setNombre(nombre);
        //convertir en double
        parafiscalesLogica.setSalario(Double.parseDouble(salario));
        JOptionPane.showMessageDialog(null, MENSAJE_NOMBRE.getMensaje() + parafiscalesLogica.getNombre() + "\n"
                + MENSAJE_BASE.getMensaje() + formateador.format( parafiscalesLogica.getSalario()) + "\n"
                + MENSAJE_SALUD.getMensaje() + formateador.format(parafiscalesLogica.calcularSalud())  + "\n"
                + MENSAJE_PENSIÓN.getMensaje() + formateador.format(parafiscalesLogica.calcularPension())  + "\n"
                + MENSAJE_TOTAL_SALARIO.getMensaje()+ formateador.format(parafiscalesLogica.totalSalario()));


    }
}
