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
@Table(name = "TUROPERATOR")
public class Turoperator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    @Column(name = "name",nullable = false)
    private String name;

    @OneToMany(mappedBy = "turoperator")
    private Set<Putevka> putevka;
}
