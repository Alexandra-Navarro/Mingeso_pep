package mingeso.backendplanesservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "planestudioo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codcarr;
    private String codplan;
    private String nivel;
    private String codasig;
    private String nomasig;
}
