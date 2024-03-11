package Language.business.concretes;

import Language.business.abstracts.LanguageService;
import Language.dataAccess.abstracts.LanguageRepository;
import Language.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageManager implements LanguageService {

    private  LanguageRepository languageRepository;

    public LanguageManager(LanguageRepository languageRepository){
        this. languageRepository = languageRepository;
    }
    @Override
    public List<Language> getAll() {

        return languageRepository.getAll();
    }

    @Override
    public void add(Language language) {
        List<Language> languages = languageRepository.getAll();
        for (Language programingLanguage1 :languages){
            if (programingLanguage1.getName().equals(language.getName()) || language.getName().isBlank()) {
                throw new RuntimeException("Programlama dili boş veya zaten var");
            }
        }
        languageRepository.add(language);

    }

    @Override
    public void delete(int id) {
        languageRepository.delete(id);

    }

    @Override
    public void update(int id, String name) {
        List<Language> languages = languageRepository.getAll();
        for(Language programingLanguage:languages){
            if(programingLanguage.getName().equals(name) || name.isBlank()){
                throw new RuntimeException("programlama dili girilemez.");
            }

        }
        languageRepository.update(id,name);
    }
}
