package kodlama.io.Devs5.business.concretes;

import kodlama.io.Devs5.business.abstracts.ProgramingLanguageService;
import kodlama.io.Devs5.business.requestes.CreateProgramingLanguageRequest;
import kodlama.io.Devs5.business.responses.GetAllProgramingLanguageResponse;
import kodlama.io.Devs5.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.Devs5.entities.concretes.ProgramingLanguage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public  class ProgramingLanguageManager implements ProgramingLanguageService {

    private ProgramingLanguageRepository programingLanguageRepository;


    @Override
    public void add(CreateProgramingLanguageRequest createProgramingLanguageRequest) {

        ProgramingLanguage programingLanguage = new ProgramingLanguage();
        programingLanguage.setTechnology(createProgramingLanguageRequest.getTechnology());
        programingLanguage.setName(createProgramingLanguageRequest.getName());
        this.programingLanguageRepository.save(programingLanguage);


    }

    @Override
    public List<GetAllProgramingLanguageResponse> getAll() {
        List<ProgramingLanguage>programingLanguages=programingLanguageRepository.findAll();
                List<GetAllProgramingLanguageResponse> programingLanguageResponse=new ArrayList<GetAllProgramingLanguageResponse>();

                for (ProgramingLanguage programingLanguage:programingLanguages){

                    GetAllProgramingLanguageResponse responseItem = new GetAllProgramingLanguageResponse();
                    responseItem.setId(programingLanguage.getId());
                    responseItem.setName(programingLanguage.getName());
                    responseItem.setTechnology(programingLanguage.getTechnology());
                    programingLanguageResponse.add(responseItem);
                }

        return programingLanguageResponse;
    }

    @Override
    public void delete(int id) {
        programingLanguageRepository.deleteById(id);

    }

    @Override
    public void update(int id, CreateProgramingLanguageRequest createProgramingLanguageRequest) {
        Optional<ProgramingLanguage>updateProgramingLanguage=programingLanguageRepository.findById(id);
        updateProgramingLanguage.get().setName(createProgramingLanguageRequest.getName());
        updateProgramingLanguage.get().setTechnology(createProgramingLanguageRequest.getName());
        this.programingLanguageRepository.save(updateProgramingLanguage.get());
    }


    @Override
    public ProgramingLanguage getProgramingLanguageById(int id) {
        return programingLanguageRepository.findById(id).get();

    }



}
