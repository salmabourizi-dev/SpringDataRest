package ma.emsi.springdatarest;

import ma.emsi.springdatarest.enums.Genre;
import ma.emsi.springdatarest.model.Etudiant;
import ma.emsi.springdatarest.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdatarestApplication {
@Autowired
    EtudiantRepository etudiantRepository;

public void run(String... args) throws Exception {
    Etudiant et1 = Etudiant.builder()
            .nom("bourizi")
            .prenom("salma")
            .genre(Genre.FEMME)
            .build();
    etudiantRepository.save(et1);
    Etudiant et2 = Etudiant.builder()
            .nom("tounia")
            .prenom("sara")
            .genre(Genre.FEMME)
            .build();
    etudiantRepository.save(et1);
    Etudiant et3 = Etudiant.builder()
            .nom("ouirzane")
            .prenom("ayoub")
            .genre(Genre.FEMME)
            .build();
    etudiantRepository.save(et1);
}
    public static void main(String[] args) {
        SpringApplication.run(SpringdatarestApplication.class, args);
    }

}
