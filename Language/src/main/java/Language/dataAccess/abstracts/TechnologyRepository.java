package Language.dataAccess.abstracts;

import Language.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository <Technology, Integer> {
}
