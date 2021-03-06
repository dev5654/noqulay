package uz.pdp.market.entity.market;

import lombok.*;
import uz.pdp.market.entity.Auditable;
import uz.pdp.market.entity.BaseEntity;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "output_product", schema = "market")
public class OutputProduct extends Auditable implements BaseEntity {

    private Double price;

    private Double discountedPrice;

    @ManyToOne
    @JoinColumn(name = "currency_id", referencedColumnName = "id")
    private Currency currency;

    @Column(nullable = false)
    private double amount;

    @ManyToOne
    @JoinColumn(name = "measurement_id", referencedColumnName = "id")
    private Measurement measurement;

    @OneToOne
    @JoinColumn(name = "input_product_id")
    private InputProduct inputProduct;

}
