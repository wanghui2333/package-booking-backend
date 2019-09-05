package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Express;
import tws.repository.ExpressMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/express")
public class ExpressController {

    @Autowired
    private ExpressMapper expressMapper;

    @GetMapping("")
    @CrossOrigin
    public ResponseEntity<List<Express>> getAll() {
        return ResponseEntity.ok(expressMapper.selectAll());
    }

    @PostMapping("")
    @CrossOrigin
    public ResponseEntity<Express> insert(@RequestBody Express express) {
        expressMapper.insert(express);
        return ResponseEntity.created(URI.create("/express/" + express.getId())).body(express);
    }
}
