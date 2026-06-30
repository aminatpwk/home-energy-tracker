package com.energytracker.ingestion_service.service;

import com.energytracker.ingestion_service.dto.EnergyUsageDto;

public interface IIngestionService {
    public void ingestEnergyUsage(EnergyUsageDto input);
}
