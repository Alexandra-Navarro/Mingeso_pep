package mingeso.backendplanesservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "prerrequisitos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrerrequisitosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codasig;
    private String codprerreq;

}
