package ma.emsi.springdatarest.repositories;

import ma.emsi.springdatarest.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path = "eleve1")
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer>
{
    public List<Etudiant> findEtudiantByNom(@Param("n") String nom);
}
