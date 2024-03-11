package Language.business.abstracts;

import Language.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAll();
    public void add(Language language);
    public void delete(int id);
    public void update(int id, String name);

}
