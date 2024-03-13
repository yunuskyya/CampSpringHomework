package Language.webApi.controllers;

import Language.business.abstracts.LanguageService;
import Language.business.dto.resposes.CreateLanguageRuquest;
import Language.business.dto.ruquests.GetAllLanguageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/language")
public class LanguageController {
    private LanguageService languageService;

    public LanguageController(LanguageService languageService){
        this.languageService = languageService;
    }
    @GetMapping("/getAll")
    public List<GetAllLanguageResponse> getAll(){
        return languageService.getAll();
    }
    @PostMapping("/add")
    public void add(CreateLanguageRuquest createLanguageRuquest){
        this.languageService.add(createLanguageRuquest);
    }
    public void update(CreateLanguageRuquest createLanguageRuquest ){
        this.languageService.update(createLanguageRuquest);
    }
}
