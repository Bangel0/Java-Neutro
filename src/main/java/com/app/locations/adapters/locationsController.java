package com.app.locations.adapters;

import java.util.List;

import com.app.locations.domain.IlocationsService;
import com.app.locations.domain.locations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/locationss")
public class locationsController {
    private final IlocationsService locationsService;

    public locationsController(IlocationsService locationsService) {
        this.locationsService = locationsService;
    }

    @GetMapping
    public ResponseEntity<List<locations>> getAlllocationss() {
        List<locations> locationss = locationsService.findAll();
        return ResponseEntity.ok(locationss);
    }

    @GetMapping("/{id}")
    public ResponseEntity<locations> getlocationsById(@PathVariable Long id) {
        locations locations = locationsService.findById(id);
        return ResponseEntity.ok(locations);
    }

    @PostMapping
    public ResponseEntity<locations> createlocations(@RequestBody locations locations) {
        locations newlocations = locationsService.save(locations);
        return ResponseEntity.ok(newlocations);
    }

    @PutMapping("/{id}")
    public ResponseEntity<locations> updatelocations(@PathVariable Long id, @RequestBody locations locations) {
        locations updatedlocations = locationsService.update(locations, id);
        return ResponseEntity.ok(updatedlocations);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletelocations(@PathVariable Long id) {
        locationsService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
} 