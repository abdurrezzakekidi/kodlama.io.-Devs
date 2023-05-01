package kodlama.io.Devs5.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgramingLanguageResponse {

    private int id;
    private String name;
    private String technology;
}
