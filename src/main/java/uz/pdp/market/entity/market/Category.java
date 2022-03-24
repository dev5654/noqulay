package uz.pdp.market.entity.market;

import lombok.*;
import org.hibernate.id.factory.IdentifierGeneratorFactory;
import uz.pdp.market.entity.Auditable;
import uz.pdp.market.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "category", schema = "market")
public class Category extends Auditable implements BaseEntity {
    private String name;

    private boolean active;
}