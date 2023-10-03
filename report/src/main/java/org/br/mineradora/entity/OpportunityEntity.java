package org.br.mineradora.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name="opportunity")
public class OpportunityEntity {

    @Id
    @GeneratedValue
    private Long id;

    private Date date;

    @Column(name = "price_tonne")
    private BigDecimal priceTonne;

    @Column(name = "last_currency_quotation")
    private BigDecimal lastDollarQuotation;
}
