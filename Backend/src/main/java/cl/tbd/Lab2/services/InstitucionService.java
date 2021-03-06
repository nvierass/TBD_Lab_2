package cl.tbd.Lab2.services;

import cl.tbd.Lab2.models.Institucion;
import org.springframework.web.bind.annotation.*;

import cl.tbd.Lab2.repositories.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class InstitucionService {

    private final InstitucionRepository institucionRepository;
    InstitucionService(InstitucionRepository institucionRepository){
        this.institucionRepository = institucionRepository;
    }

    @GetMapping("/instituciones/")
    public List<Institucion> getAllInstituciones(){
        return institucionRepository.getAllInstituciones();
    }
    @PostMapping("/instituciones/")
    public Institucion addInstitution(@RequestBody Institucion institucion) {
        return institucionRepository.addInstitucion(institucion);
    }
    @DeleteMapping("/instituciones/")
    public String deleteAllInstituciones(){
        institucionRepository.deleteAllInstituciones();
        return "Se han eliminado todas las instituciones";
    }
    @PutMapping("/instituciones/")
    public String updateAllInstituciones(){
        return "Método no permitido en esta URI";
    }


    @PostMapping("/instituciones/{id}")
    public String addInstitucion(@PathVariable int id){
        return "Método no permitido en esta URI";
    }
    @GetMapping("/instituciones/{id}")
    public Institucion getInstitucion(@PathVariable int id){
        return institucionRepository.getInstitucionById(id);
    }
    @DeleteMapping("/instituciones/{id}")
    public String deleteInstitucion(@PathVariable int id){
        institucionRepository.deleteInstitucionById(id);
        return String.format("Se ha eliminado la institución con id=%s",id);
    }
    @PutMapping("/instituciones/{id}")
    public Institucion updateInstitucionById(@PathVariable int id,@RequestBody Institucion institucion){
        return institucionRepository.updateInstitucionById(id,institucion);
    }



    @GetMapping("/instituciones/count")
    public String countInstituciones(){
        int total = institucionRepository.countInstitucion();
        return String.format("Existen %s instituciones",total);
    }


}
