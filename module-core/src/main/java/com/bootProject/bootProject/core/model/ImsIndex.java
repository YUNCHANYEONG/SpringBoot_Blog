package com.bootProject.bootProject.core.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SequenceGenerator(
        name="seq_index_idx",
        sequenceName = "seq_index_idx",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class ImsIndex {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_index_idx")
    private Long idx;
    private String userid;
    private String name;

}
