package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
    private final List<Vizitka> seznamVizitek=List.of(
            new Vizitka("Dita (Přikrylová) Formánková", "Czechitas z. s.", "Podlipného 810/14", "Praha 8-Libeň, 180 00","dita@czechitas.cs","+420 800 123 456", "www.czechitas.cz"),
            new Vizitka("Barbora Bühnová", "Czechitas z. s.", "Sokolovská 139/320", "Praha 9, 190 00",null,"+420 294 367 948", "www.czechitas.cz"),
            new Vizitka("Monika Ptáčníková", "Czechitas z. s.", "Botanická 828/45", "Brno-střed-Veveří, 602 00","monika@czechitas.cs","+420 763 947", "www.czechitas.cz"),
            new Vizitka("Mirka Zatloukalová", "Czechitas z. s.", "Klímova 2127/4", "Brno-Žabovřesky, 616 00","mirka@czechitas.cs",null, "www.czechitas.cz")
    );

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("seznam");
        modelAndView.addObject("vizitky", seznamVizitek);
        return modelAndView;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("vizitka", seznamVizitek.get(id));
        return modelAndView;
    }
}
