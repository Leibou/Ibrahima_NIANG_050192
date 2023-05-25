package org.anywrtest.entities;
import jakarta.persistence.*;
import lombok.*;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "classes")
public class ClassRoom {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

}
