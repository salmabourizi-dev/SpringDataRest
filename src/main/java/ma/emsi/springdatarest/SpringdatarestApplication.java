package ma.emsi.springdatarest;

import ma.emsi.springdatarest.enums.Genre;
import ma.emsi.springdatarest.model.Centre;
import ma.emsi.springdatarest.model.Etudiant;
import ma.emsi.springdatarest.repositories.CentreRepository;
import ma.emsi.springdatarest.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdatarestApplication implements CommandLineRunner {

    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private CentreRepository centreRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringdatarestApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Centre ct1 = Centre.builder()
                .nomCentre("Emsi-Maarif")
                .adresse("Casa")
                .build();
        centreRepository.save(ct1);

        Centre ct2 = Centre.builder()
                .nomCentre("Emsi-Centre")
                .adresse("Casa")
                .build();
        centreRepository.save(ct2);

        Etudiant et1 = Etudiant.builder()
                .nom("Bourizi")
                .prenom("Salma")
                .genre(Genre.FEMME)
                .centre(ct1)
                .build();

        Etudiant et2 = Etudiant.builder()
                .nom("Tounia")
                .prenom("Sara")
                .genre(Genre.FEMME)
                .centre(ct1)
                .build();

        Etudiant et3 = Etudiant.builder()
                .nom("Ouirzane")
                .prenom("Ayoub")
                .genre(Genre.HOMME)
                .centre(ct2)
                .build();

        etudiantRepository.save(et1);
        etudiantRepository.save(et2);
        etudiantRepository.save(et3);
    }
}
