package by.it.academy.enterprise.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Dogs {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @SequenceGenerator(name = "seq", sequenceName = "serial", allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private Short age;

    @Column
    private String breed;
}
