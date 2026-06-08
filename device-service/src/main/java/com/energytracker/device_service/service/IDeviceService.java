package com.energytracker.device_service.service;

import com.energytracker.device_service.dto.DeviceDto;
import org.springframework.stereotype.Service;

@Service
public interface IDeviceService {
    public DeviceDto getDeviceById(Long id);
    public DeviceDto createDevice(DeviceDto deviceDto);
    public DeviceDto updateDevice(Long id, DeviceDto deviceDto);
    public void deleteDevice(Long id);
}
