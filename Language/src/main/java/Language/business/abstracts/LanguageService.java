package Language.business.abstracts;

import Language.business.dto.resposes.CreateLanguageRuquest;
import Language.business.dto.ruquests.GetAllLanguageResponse;
import Language.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<GetAllLanguageResponse> getAll();
    void add(CreateLanguageRuquest createLanguageRuquest);
    void update(CreateLanguageRuquest createLanguageRuquest ,int id);


}
