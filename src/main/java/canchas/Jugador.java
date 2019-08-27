package canchas;

import javax.persistence.*;
import java.util.Date;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@Table()
public abstract class Jugador {

  @Id
  @GeneratedValue
  private Long jugadorId;
	
  private String nombre;
  
  private String apellido;
  
  private String domicilio;
  
  private String telefono;
  
  private Date fechaNacimiento;

  @OneToOne
  private Paleta paleta;

  public Inscripcion crearInscripcion() {
    return new Inscripcion(this, this.paleta);
  }

  public void setPaleta(Paleta paletaB) {
    this.paleta = paleta;
  }
  
}
