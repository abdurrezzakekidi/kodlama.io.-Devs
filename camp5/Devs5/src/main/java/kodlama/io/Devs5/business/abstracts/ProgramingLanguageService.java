package kodlama.io.Devs5.business.abstracts;

import kodlama.io.Devs5.business.requestes.CreateProgramingLanguageRequest;
import kodlama.io.Devs5.business.responses.GetAllProgramingLanguageResponse;
import kodlama.io.Devs5.entities.concretes.ProgramingLanguage;

import java.util.List;

public interface ProgramingLanguageService {
    void add(CreateProgramingLanguageRequest createProgramingLanguageRequest);

    List<GetAllProgramingLanguageResponse> getAll();

    void delete(int id);

    void update(int id, CreateProgramingLanguageRequest createProgramingLanguageRequest);

    ProgramingLanguage getProgramingLanguageById(int id);
}
