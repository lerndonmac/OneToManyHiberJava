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
@Table(name = "PUTEVKA")
public class Putevka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nomber")
    private String nomber;

    @Column(name = "dateOfExport")
    private String datoOfExport;

    @Column(name = "dateOfImport")
    private String dateOfImport;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "turoperator_id")
    private Turoperator turoperator;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "turist_id")
    private Turist turistCode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hostel_id")
    private Hostel hostelCode;
}
