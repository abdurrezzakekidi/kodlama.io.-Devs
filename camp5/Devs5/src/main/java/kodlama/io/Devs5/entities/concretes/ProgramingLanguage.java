package kodlama.io.Devs5.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "ProgramingLanguage")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProgramingLanguage {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "technology")
    private String technology;
}
