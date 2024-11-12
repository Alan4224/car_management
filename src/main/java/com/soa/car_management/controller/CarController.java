package com.soa.car_management.controller;

import com.soa.car_management.domain.entity.Car;
import com.soa.car_management.domain.entity.Sale;
import com.soa.car_management.domain.dto.CarUpdateRequest;
import com.soa.car_management.repository.CarRepository;
import com.soa.car_management.service.CarService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/car")
@Tag(name = "Car Management", description = "APIs for managing car data")
public class CarController {
    @Autowired
    CarService carService;

    @Operation(summary = "Crawl car data", description = "Crawl car data from external sources and store it in the system")
    @GetMapping("/crawdata")
    List<Car> crawData() {
        return carService.crawData();
    }

    @Operation(summary = "Get all companies", description = "Retrieve a list of all car companies")
    @GetMapping("/companies")
    ResponseEntity<List<String>> getAllCompanies() {
        return ResponseEntity.ok(carService.getAllCompany());
    }

    @Operation(summary = "Get all car names by company", description = "Retrieve a list of all car names for a specific company")
    @GetMapping("/dong-xe/{company}")
    ResponseEntity<List<String>> getAllCarNames(@Parameter(description = "Name of the company")@PathVariable String company){
        return ResponseEntity.ok(carService.getAllCarName(company));
    }

    @Operation(summary = "Get all car versions by company and car name", description = "Retrieve a list of all car versions for a specific company and car name")
    @GetMapping("/phien-ban/{company}/{carName}")
    ResponseEntity<List<String>> getAllCarVersions(@Parameter(description = "Name of the company") @PathVariable String company,
                                                   @Parameter(description = "Name of the car")@PathVariable String carName){
        return ResponseEntity.ok(carService.getAllVersion(company,carName));
    }

    @PostMapping
    @Operation(summary = "Create a new car", description = "Create a new car entry in the system")
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.createCar(car));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update a car", description = "Update an existing car entry in the system")
    public ResponseEntity<Car> updateCar( @Parameter(description = "ID of the car to be updated") @PathVariable String id, @RequestBody CarUpdateRequest carUpdateRequest) {
        return ResponseEntity.ok(carService.updateCar(id, carUpdateRequest));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a car", description = "Delete an existing car entry in the system")
    public ResponseEntity<Void> deleteCar(@Parameter(description = "ID of the car to be deleted") @PathVariable String id) {
        carService.deleteCar(id); return ResponseEntity.noContent().build();
    }

    @GetMapping
    @Operation(summary = "Get car information", description = "Retrieve car information based on company, name, and version")
    public ResponseEntity<List<Car>> getCarInfo( @Parameter(description = "Name of the company") @RequestParam(required = false) String company,
                                                 @Parameter(description = "Name of the car") @RequestParam(required = false) String name,
                                                 @Parameter(description = "Version of the car") @RequestParam(required = false) String version) {
        if (company == null && name == null && version == null) {
            return ResponseEntity.ok(carService.getAllCar());
        } else if (company != null && name == null && version == null) {
            return ResponseEntity.ok(carService.getCarByCompany(company));
        } else if (company != null && name != null && version == null) {
            return ResponseEntity.ok(carService.getCarByCompanyAndName(company, name));
        } else if (company != null && name != null && version != null) {
            return ResponseEntity.ok(carService.getCarByCompanyAndNameAndVersion(company, name, version));
        }
        return ResponseEntity.badRequest().body(null);
    }
}
