package com.energytracker.ingestion_service.controller;

import com.energytracker.ingestion_service.dto.EnergyUsageDto;
import com.energytracker.ingestion_service.service.IIngestionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ingestion")
public class IngestionController {
    private final IIngestionService ingestionService;

    public IngestionController(IIngestionService ingestionService){
        this.ingestionService = ingestionService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void ingestData(@RequestBody EnergyUsageDto usageDto){
        ingestionService.ingestEnergyUsage(usageDto);
    }

}
