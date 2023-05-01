package kodlama.io.Devs5.dataAccess.abstracts;

import kodlama.io.Devs5.entities.concretes.ProgramingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramingLanguageRepository extends JpaRepository<ProgramingLanguage,Integer> {
}
