package mingeso.backendcarrerasservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "carreras")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CarrerasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String codigo;
    private String nombrecarr;

}
