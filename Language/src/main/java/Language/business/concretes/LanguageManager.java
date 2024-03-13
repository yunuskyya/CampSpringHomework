package Language.business.concretes;

import Language.business.abstracts.LanguageService;
import Language.business.dto.resposes.CreateLanguageRuquest;
import Language.business.dto.ruquests.GetAllLanguageResponse;
import Language.dataAccess.abstracts.LanguageRepository;
import Language.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;

    public LanguageManager(LanguageRepository languageRepository){
        this.languageRepository = languageRepository;
    }

    public List<GetAllLanguageResponse> getAll(){

        List<Language> languages = languageRepository.findAll();
        List<GetAllLanguageResponse> languageResponse = new ArrayList<GetAllLanguageResponse>();

        for(Language language: languages){
            GetAllLanguageResponse responseItem = new GetAllLanguageResponse();
            responseItem.setId(language.getId());
            responseItem.setName(language.getName());
            languageResponse.add(responseItem);

        }
        return languageResponse;

    }

    @Override
    public void add(CreateLanguageRuquest createLanguageRuquest) {
        Language language = new Language();
        language.setName(createLanguageRuquest.getName());

        this.languageRepository.save(language);
    }

    @Override
    public void update(CreateLanguageRuquest createLanguageRuquest ,int id) {
        Language language = Language(id).orElse(null);
        if (language == null) {
            throw new Exception("ProgrammingLanguage could not find");
        }
        return new GetAllLanguageResponse(language);
    }


}
