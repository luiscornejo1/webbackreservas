
package com.zonificacion.backend.controller;

import com.zonificacion.backend.model.Asiento;
import com.zonificacion.backend.service.AsientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @CrossOrigin(origins = "http://localhost:4200") // Descomenta para pruebas locales
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
@RestController
@RequestMapping("/api/asientos")
public class AsientoController {
    @Autowired
    private AsientoService asientoService;

    // GET /api/asientos
    @GetMapping
    public List<Asiento> getAll() { return asientoService.getAll(); }

    // POST /api/asientos
    @PostMapping
    public Asiento save(@RequestBody Asiento asiento) { return asientoService.save(asiento); }

    // PUT /api/asientos/{id}
    @PutMapping("/{id}")
    public Asiento update(@PathVariable Long id, @RequestBody Asiento asiento) {
        asiento.setId(id);
        return asientoService.save(asiento);
    }

    // GET /api/asientos/{id}
    @GetMapping("/{id}")
    public Asiento getById(@PathVariable Long id) {
        return asientoService.findById(id);
    }

    // GET /api/asientos/zona/{zona}
    @GetMapping("/zona/{zona}")
    public List<Asiento> getByZona(@PathVariable String zona) {
        return asientoService.findByZona(zona);
    }

    // DELETE /api/asientos/zona/{zona}
    @DeleteMapping("/zona/{zona}")
    public void deleteByZona(@PathVariable String zona) {
        asientoService.deleteByZona(zona);
    }
        // DELETE /api/asientos/{id}
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        asientoService.delete(id);
    }
}