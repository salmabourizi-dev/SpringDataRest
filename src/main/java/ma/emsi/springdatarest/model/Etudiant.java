package ma.emsi.springdatarest.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.springdatarest.enums.Genre;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
@Builder
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(name = "nomEt" , nullable = false)
    private String nom ;
    @Column(name = "prenomEt" , nullable = false)
    private String prenom ;
    @Enumerated(EnumType.STRING)
    Genre genre;
}
