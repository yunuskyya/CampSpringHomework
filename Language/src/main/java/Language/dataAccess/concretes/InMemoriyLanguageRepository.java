package Language.dataAccess.concretes;

import Language.dataAccess.abstracts.LanguageRepository;
import Language.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoriyLanguageRepository implements LanguageRepository {

    List<Language> languages;

    public InMemoriyLanguageRepository(){
        languages = new ArrayList<>();
        languages.add(new Language(1,"java"));
        languages.add(new Language(2,"C#"));
        languages.add(new Language(3,"Python"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }


    @Override
    public void add(Language language) {
        languages.add(language);

    }

    @Override
    public void delete(int id) {
        languages.remove(id);


    }

    @Override
    public void update(int id, String name) {
        Language upt= languages.get(id);
        upt.setName(name);

    }




}
