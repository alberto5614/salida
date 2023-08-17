package cl.awake.pruebasalida.model.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_Facturas")
    private int id;

    @Column(name = "Monto")
    private BigDecimal monto;

    @Column(name = "Fecha_Pago")
    private Date fechaPago;

	public Factura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Factura(int id, BigDecimal monto, Date fechaPago) {
		super();
		this.id = id;
		this.monto = monto;
		this.fechaPago = fechaPago;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", monto=" + monto + ", fechaPago=" + fechaPago + "]";
	}

    
}