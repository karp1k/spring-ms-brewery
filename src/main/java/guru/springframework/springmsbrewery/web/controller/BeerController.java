package guru.springframework.springmsbrewery.web.controller;

import guru.springframework.springmsbrewery.web.model.BeerDto;
import guru.springframework.springmsbrewery.web.services.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author kas
 */
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerDto(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDto> handlePost(@RequestBody BeerDto beerDto) {
        BeerDto beerDtoSaved = beerService.save(beerDto);
        HttpHeaders httpHeaders = new HttpHeaders();
        // by convection providing location
        httpHeaders.add("Location", "/api/v1/beer/" + beerDtoSaved.getId().toString());
        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable UUID beerId, @RequestBody BeerDto beerDto) {
        beerService.updateBeer(beerId, beerDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);

    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId) {
        beerService.deleteById(beerId);
    }

}
