package com.project.idtrust.model;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_PRICES")
public class Price {

    private static final long serialVersionUID = -8398626409227580198L;

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "PRICE_ID")
    private Long price_id;

    private String name;
    private String ask;
}
