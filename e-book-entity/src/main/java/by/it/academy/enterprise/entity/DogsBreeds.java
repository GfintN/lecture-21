package by.it.academy.enterprise.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
public class DogsBreeds {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @SequenceGenerator(name = "seq", sequenceName = "serial", allocationSize = 1)
    @Column
    private Long id;

    @Column(unique = true, nullable = false)
    private String breed;
}
