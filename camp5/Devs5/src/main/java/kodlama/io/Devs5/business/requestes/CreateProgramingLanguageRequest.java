package kodlama.io.Devs5.business.requestes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProgramingLanguageRequest {
    private String name;
    private String technology;
}
