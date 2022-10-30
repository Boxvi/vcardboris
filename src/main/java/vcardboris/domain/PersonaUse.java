package vcardboris.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@AllArgsConstructor
@Component
public class PersonaUse {

    @Autowired
    private List<Persona> personitas;

    public PersonaUse() {
    }
}
