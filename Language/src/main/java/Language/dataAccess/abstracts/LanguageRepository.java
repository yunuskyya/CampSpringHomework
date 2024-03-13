package Language.dataAccess.abstracts;

import Language.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LanguageRepository extends JpaRepository <Language ,Integer> {
}
