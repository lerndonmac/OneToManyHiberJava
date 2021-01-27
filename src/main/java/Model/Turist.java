package Model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "TURIST")
public class Turist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "lastName", nullable = false)
    private String lastName;
    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "fatheric", nullable = false)
    private String fatheric;
    @Column(name = "passportCode", nullable = false)
    private String passportCode;
    @Column(name = "PassportNomber", nullable = false)
    private String PassportNomber;
    @OneToMany(mappedBy = "turistCode")
    private Set<Putevka> putevka;
}
