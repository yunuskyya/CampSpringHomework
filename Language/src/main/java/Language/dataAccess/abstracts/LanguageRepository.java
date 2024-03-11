package Language.dataAccess.abstracts;

import Language.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {
    List<Language> getAll();
    public void add(Language language);
    public void delete(int id);
    public void update(int id, String name);

}