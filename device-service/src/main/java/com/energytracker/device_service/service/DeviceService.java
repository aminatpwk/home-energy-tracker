package com.energytracker.device_service.service;

import com.energytracker.device_service.dto.DeviceDto;
import com.energytracker.device_service.entity.Device;
import com.energytracker.device_service.repository.IDeviceRepository;
import org.springframework.stereotype.Service;

@Service
public class DeviceService implements IDeviceService{
    private IDeviceRepository deviceRepository;

    public DeviceService(IDeviceRepository deviceRepository){
        this.deviceRepository = deviceRepository;
    }

    public DeviceDto getDeviceById(Long id){
        Device device = deviceRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Device not found"));

        return mapToDto(device);
    }

    public DeviceDto createDevice(DeviceDto inputDevice){
        Device device = new Device();
        device.setName(inputDevice.getName());
        device.setType(inputDevice.getType());
        device.setLocation(inputDevice.getLocation());
        device.setUserId(inputDevice.getUserId());

        final Device savedDevice = deviceRepository.save(device);
        return mapToDto(savedDevice);
    }

    public DeviceDto updateDevice(Long id, DeviceDto inputDevice){
        Device existing = deviceRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Device not found"));
        existing.setName(inputDevice.getName());
        existing.setType(inputDevice.getType());
        existing.setLocation(inputDevice.getLocation());
        existing.setUserId(inputDevice.getUserId());

        final Device updatedDevice = deviceRepository.save(existing);
        return mapToDto(updatedDevice);
    }

    public void deleteDevice(Long id){
        if(!deviceRepository.existsById(id)){
            throw new IllegalArgumentException("Device not found");
        }

        deviceRepository.deleteById(id);
    }

    // PRIVATE HELPER METHODS
    private DeviceDto mapToDto(Device device){
        DeviceDto dto = new DeviceDto();
        dto.setId(device.getId());
        dto.setName(device.getName());
        dto.setType(device.getType());
        dto.setLocation(device.getLocation());
        dto.setUserId(device.getUserId());
        return dto;
    }
}
