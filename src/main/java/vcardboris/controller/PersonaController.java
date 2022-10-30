package vcardboris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vcardboris.domain.PersonaUse;

@Controller
public class PersonaController {

    @Autowired
    private PersonaUse personaUse;

    @GetMapping({"/", "", "/index"})
    public String index(Model model) {
        model.addAttribute("personaUse", personaUse);
        return "index";
    }

}
