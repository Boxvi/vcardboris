package vcardboris.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Persona {

    private int id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String ciudad;
    private String pais;
    private String horario;
    private String celular;
    private String paginaWeb;
    private String email;
    private String fotoURL;

    public Persona() {
    }


}

