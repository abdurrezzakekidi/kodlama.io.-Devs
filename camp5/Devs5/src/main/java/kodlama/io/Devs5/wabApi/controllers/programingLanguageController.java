package kodlama.io.Devs5.wabApi.controllers;


import kodlama.io.Devs5.business.abstracts.ProgramingLanguageService;
import kodlama.io.Devs5.business.requestes.CreateProgramingLanguageRequest;
import kodlama.io.Devs5.business.responses.GetAllProgramingLanguageResponse;
import kodlama.io.Devs5.entities.concretes.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/programingLanguage")
public class programingLanguageController {

    private ProgramingLanguageService programingLanguageService;


    @Autowired
    public programingLanguageController(ProgramingLanguageService programingLanguageService) {
        this.programingLanguageService = programingLanguageService;

    }

    @GetMapping("/listAll")
    public List<GetAllProgramingLanguageResponse> listAll() {
        return programingLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody() CreateProgramingLanguageRequest createProgramingLanguageRequest) {
        this.programingLanguageService.add(createProgramingLanguageRequest);
    }

    @GetMapping("/getLanguageById/{languageId}")
    public ProgramingLanguage getProgramingLanguageById(@PathVariable("languageId") int id) {
        return programingLanguageService.getProgramingLanguageById(id);
    }

    @DeleteMapping("delete/{languageId}")
    public void deleteProgramingLanguage(@PathVariable("languageId") int id) {
        this.programingLanguageService.delete(id);
    }

    @PutMapping("/update/{languageId}")
    public void update(@PathVariable("languageId") int id, CreateProgramingLanguageRequest createProgramingLanguageRequest) {
        this.programingLanguageService.update(id, createProgramingLanguageRequest);
    }


}
