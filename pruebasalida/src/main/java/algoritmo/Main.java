package algoritmo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Detalle> detalles = new ArrayList<>();
        
        //Agregamos detalles de pacientes para pruebas
        /*detalles.add(new Detalle(3));  // 5% de descuento
        detalles.add(new Detalle(8));  // 3% de descuento
        detalles.add(new Detalle(20)); // Sin descuento
        detalles.add(new Detalle(40)); // 10% de descuento
        detalles.add(new Detalle(65)); // 30% de descuento*/

        // Agregamos detalles de médicos para pruebas
        detalles.add(new Detalle("Cardiologo", 12));  // 15% de descuento
        detalles.add(new Detalle("Neurologo", 15));   // 5% de descuento
        detalles.add(new Detalle("Endocrinologo", 8)); // 10% de descuento
        detalles.add(new Detalle("Oncologo", 6));       // 10% de descuento
        detalles.add(new Detalle("Dermatologo", 12));  // Sin descuento
        detalles.add(new Detalle("Cirujano", 25));      // 5% de descuento

        //ICalculoDescuento calculoEdad = new CalculoEdad();
        ICalculoDescuento calculoEspecialidadExperiencia = new CalculoEspecialidadExperiencia();

        //double descuentoPorEdad = calculoEdad.descuento(detalles) * 100; // Convertir a porcentaje
        double descuentoPorEspecialidadExperiencia = calculoEspecialidadExperiencia.descuento(detalles) * 100; // Convertir a porcentaje

        //System.out.println("Descuento por Edad: " + descuentoPorEdad + "%");
        System.out.println("Descuento por Especialidad y Experiencia: " + descuentoPorEspecialidadExperiencia + "%");
    }
}
