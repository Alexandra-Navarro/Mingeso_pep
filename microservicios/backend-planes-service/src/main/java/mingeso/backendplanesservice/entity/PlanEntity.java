package mingeso.backendplanesservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "plan_estudios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codcarr;
    private String codplan;
    private Integer nivel;
    private String codasig;
    private String nomasig;



}
