package uz.pdp.market.entity.organization;

import lombok.*;
import uz.pdp.market.entity.Auditable;
import uz.pdp.market.entity.BaseEntity;
import uz.pdp.market.enums.Status;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "organization", schema = "organization")
public class Organization extends Auditable implements BaseEntity {
    private String name;

    private String website;

    private String phone;

    private String code;

    private String email;

    @Enumerated(EnumType.STRING)
    private Status status;
}



