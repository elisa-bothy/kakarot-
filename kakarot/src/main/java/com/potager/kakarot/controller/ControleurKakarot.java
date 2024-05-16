package com.potager.kakarot.controller;

import com.potager.kakarot.entities.Plantes;
import java.time.LocalDate;
import java.time.Month;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.potager.kakarot.service.ImagePropertiesService;
import com.potager.kakarot.service.PlanteService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class ControleurKakarot {

    @Autowired
    private ImagePropertiesService imagePropertiesService;
    @Autowired
    private PlanteService planteService;

    @GetMapping
    public String home(Model model) {
        Month currentMonth = LocalDate.now().getMonth();
        String imagePath = imagePropertiesService.getImagePathForMonth(currentMonth.name());
        model.addAttribute("imagePath", imagePath);
        return "index3";
    }

    @GetMapping("/plantes-mois")
    public String description(Model model) {
        Month currentMonth = LocalDate.now().getMonth();
        String imagePath = imagePropertiesService.getImagePathForMonth(currentMonth.name());
        model.addAttribute("imagePath", imagePath);

        String legume = extractName(imagePath);
        System.out.println("extractLegume : " + legume);

        Plantes planteDuMois = planteService.findByNom("courgette");
        System.out.println("Astuce :" + planteDuMois.getAstuce());

        model.addAttribute("astuce", planteDuMois.getAstuce());

        return "plantes-mois";
    }

    @GetMapping("/rechercherRegion") //questioning url
    public String rechercherRegion(@RequestParam("query") String query, Model model) {
        String queryLowerCase = query.toLowerCase();
        List<Plantes> searchResults = planteService.rechercherPlante(queryLowerCase);
        model.addAttribute("searchResults", searchResults);
        model.addAttribute("searchQuery", queryLowerCase);
        return "rechercherRegion";
    }

    @GetMapping("/{id}") //questioning url
    public String deletePlante(@PathVariable("id") Integer id) {
        planteService.deleteById(id);
        return "redirect:/";
    }

    /**
     * Méthode pour la calendrier
     *
     * @param model Le modèle utilisé pour transmettre des données à la vue
     * @return La vue "index"
     */
    @GetMapping("/calendrier") //questioning url
    public String calendrier(Model model) {
        List<Plantes> plantes = planteService.list();
        model.addAttribute("plantes", plantes);
        return "calendrier";
    }

    public static String extractName(String path) {
        // Séparer le chemin en parties en utilisant le caractère '/'
        String[] parts = path.split("/");
        // Récupérer le dernier élément, qui contient le nom du fichier avec l'extension
        String filename = parts[parts.length - 1];
        // Supprimer l'extension du fichier en séparant par le point '.'
        String[] nameParts = filename.split("\\.");
        // Retourner le premier élément qui est le nom du fichier sans l'extension
        return nameParts[0];
    }
    
     @GetMapping("/ajouterPlante")
    public String afficherFormulaireAjout(Model model) {
        model.addAttribute("plante", new Plantes());
        return "ajouterPlante"; // Le nom du fichier HTML Thymeleaf pour le formulaire d'ajout
    }

    @PostMapping("/ajouterPlante")
    public String ajouterPlante(@ModelAttribute Plantes plante, RedirectAttributes redirectAttributes) {
        planteService.savePlante(plante);
        redirectAttributes.addFlashAttribute("message", "La plante a été bien ajouté !");
        return "index3"; // Redirige l'utilisateur vers la page d'accueil après l'ajout de la plante
    }
}
