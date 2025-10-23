package ma.emsi.springdatarest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Clubs")
public class Centre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom_centre", nullable = false)
    private String nomCentre;

    @Column(name = "adresse_centre", nullable = false)
    private String adresse;

    @OneToMany(mappedBy = "centre", cascade = CascadeType.ALL)
    private List<Etudiant> etudiants;
}
