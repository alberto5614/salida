package algoritmo;

import java.util.List;

public class CalculoEdad implements ICalculoDescuento {
	@Override
	public double descuento(List<Detalle> detalles) {
		double totalDescuento = 0.0;

		for (Detalle detalle : detalles) {
			int edad = detalle.getEdad();

			if (edad <= 5) {
				totalDescuento += 0.05; // 5% de descuento
			} else if (edad >= 5 && edad < 13) {
				totalDescuento += 0.03; // 3% de descuento
			} else if (edad >= 60) {
				totalDescuento += 0.30; // 30% de descuento
			} else if (edad >= 35 && edad < 60) {
				totalDescuento += 0.10; // 10% de descuento
			}
			// No se aplica descuento si la edad está entre 13 y 35
		}

		return Math.min(totalDescuento, 1.0); // Limitar el descuento máximo al 100%
	}
}
