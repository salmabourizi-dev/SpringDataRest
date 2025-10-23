package ma.emsi.springdatarest.repositories;

import ma.emsi.springdatarest.model.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CentreRepository extends JpaRepository<Centre, Long> {
}