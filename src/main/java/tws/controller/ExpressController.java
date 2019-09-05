package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Express;
import tws.repository.ExpressMapper;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/express")
public class ExpressController {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

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

        express.setDate(DATE_FORMAT.format(new Date()));

        expressMapper.insert(express);

        return ResponseEntity.created(URI.create("/express/" + express.getId())).body(express);
    }

    @PatchMapping("")
    @CrossOrigin
    public ResponseEntity<Express> patchStatus(@RequestBody Express express) {

        express.setDate(DATE_FORMAT.format(new Date()));

        expressMapper.patchStatus(express);

        return ResponseEntity.created(URI.create("/express/" + express.getId())).body(express);
    }
}
