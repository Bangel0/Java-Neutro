package com.app.workinghours.adapters;

import java.util.List;

import com.app.workinghours.domain.IworkinghoursService;
import com.app.workinghours.domain.workinghours;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/workinghourss")
public class workinghoursController {
    private final IworkinghoursService workinghoursService;

    public workinghoursController(IworkinghoursService workinghoursService) {
        this.workinghoursService = workinghoursService;
    }

    @GetMapping
    public ResponseEntity<List<workinghours>> getAllworkinghourss() {
        List<workinghours> workinghourss = workinghoursService.findAll();
        return ResponseEntity.ok(workinghourss);
    }

    @GetMapping("/{id}")
    public ResponseEntity<workinghours> getworkinghoursById(@PathVariable Long id) {
        workinghours workinghours = workinghoursService.findById(id);
        return ResponseEntity.ok(workinghours);
    }

    @PostMapping
    public ResponseEntity<workinghours> createworkinghours(@RequestBody workinghours workinghours) {
        workinghours newworkinghours = workinghoursService.save(workinghours);
        return ResponseEntity.ok(newworkinghours);
    }

    @PutMapping("/{id}")
    public ResponseEntity<workinghours> updateworkinghours(@PathVariable Long id, @RequestBody workinghours workinghours) {
        workinghours updatedworkinghours = workinghoursService.update(workinghours, id);
        return ResponseEntity.ok(updatedworkinghours);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteworkinghours(@PathVariable Long id) {
        workinghoursService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
} 