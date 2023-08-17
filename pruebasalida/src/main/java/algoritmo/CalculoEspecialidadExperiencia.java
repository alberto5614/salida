package algoritmo;

import java.util.List;

public class CalculoEspecialidadExperiencia implements ICalculoDescuento {

	@Override
	public double descuento(List<Detalle> detalles) {
		double totalDescuento = 0.0;

		for (Detalle detalle : detalles) {
			String especialidad = detalle.getEspecialidad();
			int experiencia = detalle.getExperiencia();

			if (experiencia < 10) {
				totalDescuento += 0.15; // 15% de descuento
			} else if ((especialidad.equals("Cardiologo") || especialidad.equals("Neurologo")) && experiencia > 10
					&& experiencia < 20) {
				totalDescuento += 0.05; // 5% de descuento
			} else if ((especialidad.equals("Endocrinologo") || especialidad.equals("Oncologo")) && experiencia > 5) {
				totalDescuento += 0.10; // 10% de descuento
			} else if (especialidad.equals("Dermatologo")) {
				totalDescuento += 0.0; // Sin descuento
			} else if (experiencia > 20) {
				totalDescuento += 0.05; // 5% de descuento
			}

		}

		return Math.min(totalDescuento, 1.0); // Limitar el descuento máximo al 100%
	}
}
