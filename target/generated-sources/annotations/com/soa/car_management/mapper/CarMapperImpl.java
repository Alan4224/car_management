package com.soa.car_management.mapper;

import com.soa.car_management.dto.request.CarRequestDTO;
import com.soa.car_management.dto.respond.CarRespondDTO;
import com.soa.car_management.entity.Car;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-25T17:55:08+0700",
    comments = "version: 1.6.2, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public CarRespondDTO toCarRespondDTO(Car car) {
        if ( car == null ) {
            return null;
        }

        CarRespondDTO carRespondDTO = new CarRespondDTO();

        carRespondDTO.setId( car.getId() );
        carRespondDTO.setName( car.getName() );
        carRespondDTO.setPrice( car.getPrice() );
        carRespondDTO.setImage( car.getImage() );
        carRespondDTO.setEngineType( car.getEngineType() );
        carRespondDTO.setEnginePower( car.getEnginePower() );
        carRespondDTO.setEngineTorque( car.getEngineTorque() );
        carRespondDTO.setGearBox( car.getGearBox() );
        carRespondDTO.setDriveSystem( car.getDriveSystem() );
        carRespondDTO.setFuelType( car.getFuelType() );
        carRespondDTO.setFuelConsumption( car.getFuelConsumption() );
        carRespondDTO.setOperatingRange( car.getOperatingRange() );
        carRespondDTO.setFastChargingTime( car.getFastChargingTime() );
        carRespondDTO.setBatteryType( car.getBatteryType() );
        carRespondDTO.setBatteryCapacity( car.getBatteryCapacity() );
        carRespondDTO.setHorsepower( car.getHorsepower() );
        carRespondDTO.setCapacity( car.getCapacity() );
        carRespondDTO.setTorque( car.getTorque() );
        carRespondDTO.setSeatNumber( car.getSeatNumber() );
        carRespondDTO.setDimensions( car.getDimensions() );
        carRespondDTO.setWheelbase( car.getWheelbase() );
        carRespondDTO.setGroundClearance( car.getGroundClearance() );
        carRespondDTO.setTurningRadius( car.getTurningRadius() );
        carRespondDTO.setFuelTankCapacity( car.getFuelTankCapacity() );
        carRespondDTO.setTireAndWheel( car.getTireAndWheel() );
        carRespondDTO.setLuggageCompartmentVolume( car.getLuggageCompartmentVolume() );
        carRespondDTO.setSelfWeight( car.getSelfWeight() );
        carRespondDTO.setFullLoadWeight( car.getFullLoadWeight() );
        carRespondDTO.setHighBeam( car.getHighBeam() );
        carRespondDTO.setProximityLights( car.getProximityLights() );
        carRespondDTO.setDaytimeLights( car.getDaytimeLights() );
        carRespondDTO.setTaillights( car.getTaillights() );
        carRespondDTO.setAutomaticHeadlights( car.getAutomaticHeadlights() );
        carRespondDTO.setAutomaticAngleHeadlights( car.getAutomaticAngleHeadlights() );
        carRespondDTO.setOverheadBrakeLights( car.getOverheadBrakeLights() );
        carRespondDTO.setRearviewMirrorDrying( car.getRearviewMirrorDrying() );
        carRespondDTO.setHeatedSideMirrors( car.getHeatedSideMirrors() );
        carRespondDTO.setFishFinAntenna( car.getFishFinAntenna() );
        carRespondDTO.setPowerTrunk( car.getPowerTrunk() );
        carRespondDTO.setOpenTrunkHandsFree( car.getOpenTrunkHandsFree() );
        carRespondDTO.setInhalationDoors( car.getInhalationDoors() );
        carRespondDTO.setAutomaticWipers( car.getAutomaticWipers() );
        carRespondDTO.setRearviewMirror( car.getRearviewMirror() );
        carRespondDTO.setAutoHeadlights( car.getAutoHeadlights() );
        carRespondDTO.setSteeringWheelCoverMaterial( car.getSteeringWheelCoverMaterial() );
        carRespondDTO.setSteeringWheelAdjustment( car.getSteeringWheelAdjustment() );
        carRespondDTO.setSteeringWheelHeating( car.getSteeringWheelHeating() );
        carRespondDTO.setSteeringWheelPositionMemory( car.getSteeringWheelPositionMemory() );
        carRespondDTO.setSeatCoverMaterial( car.getSeatCoverMaterial() );
        carRespondDTO.setDriversSeatAdjustment( car.getDriversSeatAdjustment() );
        carRespondDTO.setDriversSeatPositionMemory( car.getDriversSeatPositionMemory() );
        carRespondDTO.setPassengerSeatAdjustment( car.getPassengerSeatAdjustment() );
        carRespondDTO.setAirConditioning( car.getAirConditioning() );
        carRespondDTO.setEntertainmentScreen( car.getEntertainmentScreen() );
        carRespondDTO.setSpeakerSystem( car.getSpeakerSystem() );
        carRespondDTO.setDriversSeatCooling( car.getDriversSeatCooling() );
        carRespondDTO.setPassengersSeatCooling( car.getPassengersSeatCooling() );
        carRespondDTO.setDriversSeatHeating( car.getDriversSeatHeating() );
        carRespondDTO.setPassengersSeatHeating( car.getPassengersSeatHeating() );
        carRespondDTO.setSmartKey( car.getSmartKey() );
        carRespondDTO.setRearSeatAirVents( car.getRearSeatAirVents() );
        carRespondDTO.setAppleCarPlayConnection( car.getAppleCarPlayConnection() );
        carRespondDTO.setAndroidAutoConnection( car.getAndroidAutoConnection() );
        carRespondDTO.setVoiceCommand( car.getVoiceCommand() );
        carRespondDTO.setHandsFreeTalk( car.getHandsFreeTalk() );
        carRespondDTO.setAirFilter( car.getAirFilter() );
        carRespondDTO.setAirQualityControl( car.getAirQualityControl() );
        carRespondDTO.setVirtualAssistant( car.getVirtualAssistant() );
        carRespondDTO.setWiFiStreaming( car.getWiFiStreaming() );
        carRespondDTO.setWirelessCharging( car.getWirelessCharging() );
        carRespondDTO.setACOutlet( car.getACOutlet() );
        carRespondDTO.setPanoramicSunroof( car.getPanoramicSunroof() );
        carRespondDTO.setDriversDashboard( car.getDriversDashboard() );
        carRespondDTO.setOneTouchWindows( car.getOneTouchWindows() );
        carRespondDTO.setSunroof( car.getSunroof() );
        carRespondDTO.setPowerDriversSeat( car.getPowerDriversSeat() );
        carRespondDTO.setElectricPassengerSeat( car.getElectricPassengerSeat() );
        carRespondDTO.setAutoDimmingInteriorRearviewMirror( car.getAutoDimmingInteriorRearviewMirror() );
        carRespondDTO.setSecondRowSeats( car.getSecondRowSeats() );
        carRespondDTO.setBluetoothConnection( car.getBluetoothConnection() );
        carRespondDTO.setUSBConnection( car.getUSBConnection() );
        carRespondDTO.setWiFiConnection( car.getWiFiConnection() );
        carRespondDTO.setPushButtonStart( car.getPushButtonStart() );
        carRespondDTO.setCentralScreen( car.getCentralScreen() );
        carRespondDTO.setDriverSeatMassage( car.getDriverSeatMassage() );
        carRespondDTO.setPassengerSeatMassage( car.getPassengerSeatMassage() );
        carRespondDTO.setSteeringWheelIntegratedButtons( car.getSteeringWheelIntegratedButtons() );
        carRespondDTO.setAMFMRadio( car.getAMFMRadio() );
        carRespondDTO.setRearSeatArmrest( car.getRearSeatArmrest() );
        carRespondDTO.setFrontSeatArmrest( car.getFrontSeatArmrest() );
        carRespondDTO.setAUXConnection( car.getAUXConnection() );
        carRespondDTO.setThirdRow( car.getThirdRow() );
        carRespondDTO.setPowerSteering( car.getPowerSteering() );
        carRespondDTO.setMultipleDrivingModes( car.getMultipleDrivingModes() );
        carRespondDTO.setElectronicHandbrake( car.getElectronicHandbrake() );
        carRespondDTO.setAutomaticBrakeHold( car.getAutomaticBrakeHold() );
        carRespondDTO.setActiveParkingAssist( car.getActiveParkingAssist() );
        carRespondDTO.setSupportReadingTrafficSignsAndSignals( car.getSupportReadingTrafficSignsAndSignals() );
        carRespondDTO.setVehicleManagementViaPhoneApp( car.getVehicleManagementViaPhoneApp() );
        carRespondDTO.setDisplayInformationOnTheWindshield( car.getDisplayInformationOnTheWindshield() );
        carRespondDTO.setSteeringAssistWhenCornering( car.getSteeringAssistWhenCornering() );
        carRespondDTO.setAccelerationControl( car.getAccelerationControl() );
        carRespondDTO.setCruiseControl( car.getCruiseControl() );
        carRespondDTO.setAdaptiveCruiseControl( car.getAdaptiveCruiseControl() );
        carRespondDTO.setSteeringWheelPaddleShifters( car.getSteeringWheelPaddleShifters() );
        carRespondDTO.setIdlingStop( car.getIdlingStop() );
        carRespondDTO.setElectronicBrake( car.getElectronicBrake() );
        carRespondDTO.setIdlingStopStartStop( car.getIdlingStopStartStop() );
        carRespondDTO.setAirbags( car.getAirbags() );
        carRespondDTO.setAdaptiveCruiseControl2( car.getAdaptiveCruiseControl2() );
        carRespondDTO.setAntiLockBrakingSystem( car.getAntiLockBrakingSystem() );
        carRespondDTO.setEmergencyBrakeAssist( car.getEmergencyBrakeAssist() );
        carRespondDTO.setElectronicBrakeForceDistribution( car.getElectronicBrakeForceDistribution() );
        carRespondDTO.setElectronicStabilityControl( car.getElectronicStabilityControl() );
        carRespondDTO.setBlindSpotWarning( car.getBlindSpotWarning() );
        carRespondDTO.setReverseSensor( car.getReverseSensor() );
        carRespondDTO.setReverseCamera( car.getReverseCamera() );
        carRespondDTO.setLaneDepartureWarning( car.getLaneDepartureWarning() );
        carRespondDTO.setLaneKeepingAssist( car.getLaneKeepingAssist() );
        carRespondDTO.setAutomaticLaneChange( car.getAutomaticLaneChange() );
        carRespondDTO.setAutomaticCollisionMitigationBrakeAssist( car.getAutomaticCollisionMitigationBrakeAssist() );
        carRespondDTO.setCrossTrafficWarningWhenReversing( car.getCrossTrafficWarningWhenReversing() );
        carRespondDTO.setDrowsyDriverWarning( car.getDrowsyDriverWarning() );
        carRespondDTO.setIsoFixChildSafetySeatHooks( car.getIsoFixChildSafetySeatHooks() );
        carRespondDTO.setTirePressureSensor( car.getTirePressureSensor() );
        carRespondDTO.setFrontDistanceSensor( car.getFrontDistanceSensor() );
        carRespondDTO.setPreCollisionWarning( car.getPreCollisionWarning() );
        carRespondDTO.setLaneChangeAssist( car.getLaneChangeAssist() );
        carRespondDTO.setTrafficWarningWhenOpeningTheDoor( car.getTrafficWarningWhenOpeningTheDoor() );
        carRespondDTO.setTrafficSignRecognition( car.getTrafficSignRecognition() );
        carRespondDTO.setThree60degreeCamera( car.getThree60degreeCamera() );
        carRespondDTO.setTractionControl( car.getTractionControl() );
        carRespondDTO.setHillStartAssist( car.getHillStartAssist() );
        carRespondDTO.setHillDescentAssist( car.getHillDescentAssist() );
        carRespondDTO.setBlindSpotCamera( car.getBlindSpotCamera() );
        carRespondDTO.setRearBrakes( car.getRearBrakes() );
        carRespondDTO.setFrontBrakes( car.getFrontBrakes() );
        carRespondDTO.setRearSuspension( car.getRearSuspension() );
        carRespondDTO.setFrontSuspension( car.getFrontSuspension() );

        return carRespondDTO;
    }

    @Override
    public Car toCar(CarRequestDTO carRequestDTO) {
        if ( carRequestDTO == null ) {
            return null;
        }

        Car.CarBuilder car = Car.builder();

        car.id( carRequestDTO.getId() );
        car.name( carRequestDTO.getName() );
        car.price( carRequestDTO.getPrice() );
        car.image( carRequestDTO.getImage() );
        car.engineType( carRequestDTO.getEngineType() );
        car.enginePower( carRequestDTO.getEnginePower() );
        car.engineTorque( carRequestDTO.getEngineTorque() );
        car.gearBox( carRequestDTO.getGearBox() );
        car.driveSystem( carRequestDTO.getDriveSystem() );
        car.fuelType( carRequestDTO.getFuelType() );
        car.fuelConsumption( carRequestDTO.getFuelConsumption() );
        car.operatingRange( carRequestDTO.getOperatingRange() );
        car.fastChargingTime( carRequestDTO.getFastChargingTime() );
        car.batteryType( carRequestDTO.getBatteryType() );
        car.batteryCapacity( carRequestDTO.getBatteryCapacity() );
        car.horsepower( carRequestDTO.getHorsepower() );
        car.capacity( carRequestDTO.getCapacity() );
        car.torque( carRequestDTO.getTorque() );
        car.seatNumber( carRequestDTO.getSeatNumber() );
        car.dimensions( carRequestDTO.getDimensions() );
        car.wheelbase( carRequestDTO.getWheelbase() );
        car.groundClearance( carRequestDTO.getGroundClearance() );
        car.turningRadius( carRequestDTO.getTurningRadius() );
        car.fuelTankCapacity( carRequestDTO.getFuelTankCapacity() );
        car.tireAndWheel( carRequestDTO.getTireAndWheel() );
        car.luggageCompartmentVolume( carRequestDTO.getLuggageCompartmentVolume() );
        car.selfWeight( carRequestDTO.getSelfWeight() );
        car.fullLoadWeight( carRequestDTO.getFullLoadWeight() );
        car.highBeam( carRequestDTO.getHighBeam() );
        car.proximityLights( carRequestDTO.getProximityLights() );
        car.daytimeLights( carRequestDTO.getDaytimeLights() );
        car.taillights( carRequestDTO.getTaillights() );
        car.automaticHeadlights( carRequestDTO.getAutomaticHeadlights() );
        car.automaticAngleHeadlights( carRequestDTO.getAutomaticAngleHeadlights() );
        car.overheadBrakeLights( carRequestDTO.getOverheadBrakeLights() );
        car.rearviewMirrorDrying( carRequestDTO.getRearviewMirrorDrying() );
        car.heatedSideMirrors( carRequestDTO.getHeatedSideMirrors() );
        car.fishFinAntenna( carRequestDTO.getFishFinAntenna() );
        car.powerTrunk( carRequestDTO.getPowerTrunk() );
        car.openTrunkHandsFree( carRequestDTO.getOpenTrunkHandsFree() );
        car.inhalationDoors( carRequestDTO.getInhalationDoors() );
        car.automaticWipers( carRequestDTO.getAutomaticWipers() );
        car.rearviewMirror( carRequestDTO.getRearviewMirror() );
        car.autoHeadlights( carRequestDTO.getAutoHeadlights() );
        car.steeringWheelCoverMaterial( carRequestDTO.getSteeringWheelCoverMaterial() );
        car.steeringWheelAdjustment( carRequestDTO.getSteeringWheelAdjustment() );
        car.steeringWheelHeating( carRequestDTO.getSteeringWheelHeating() );
        car.steeringWheelPositionMemory( carRequestDTO.getSteeringWheelPositionMemory() );
        car.seatCoverMaterial( carRequestDTO.getSeatCoverMaterial() );
        car.driversSeatAdjustment( carRequestDTO.getDriversSeatAdjustment() );
        car.driversSeatPositionMemory( carRequestDTO.getDriversSeatPositionMemory() );
        car.passengerSeatAdjustment( carRequestDTO.getPassengerSeatAdjustment() );
        car.airConditioning( carRequestDTO.getAirConditioning() );
        car.entertainmentScreen( carRequestDTO.getEntertainmentScreen() );
        car.speakerSystem( carRequestDTO.getSpeakerSystem() );
        car.driversSeatCooling( carRequestDTO.getDriversSeatCooling() );
        car.passengersSeatCooling( carRequestDTO.getPassengersSeatCooling() );
        car.driversSeatHeating( carRequestDTO.getDriversSeatHeating() );
        car.passengersSeatHeating( carRequestDTO.getPassengersSeatHeating() );
        car.smartKey( carRequestDTO.getSmartKey() );
        car.rearSeatAirVents( carRequestDTO.getRearSeatAirVents() );
        car.appleCarPlayConnection( carRequestDTO.getAppleCarPlayConnection() );
        car.androidAutoConnection( carRequestDTO.getAndroidAutoConnection() );
        car.voiceCommand( carRequestDTO.getVoiceCommand() );
        car.handsFreeTalk( carRequestDTO.getHandsFreeTalk() );
        car.airFilter( carRequestDTO.getAirFilter() );
        car.airQualityControl( carRequestDTO.getAirQualityControl() );
        car.virtualAssistant( carRequestDTO.getVirtualAssistant() );
        car.wiFiStreaming( carRequestDTO.getWiFiStreaming() );
        car.wirelessCharging( carRequestDTO.getWirelessCharging() );
        car.panoramicSunroof( carRequestDTO.getPanoramicSunroof() );
        car.driversDashboard( carRequestDTO.getDriversDashboard() );
        car.oneTouchWindows( carRequestDTO.getOneTouchWindows() );
        car.sunroof( carRequestDTO.getSunroof() );
        car.powerDriversSeat( carRequestDTO.getPowerDriversSeat() );
        car.electricPassengerSeat( carRequestDTO.getElectricPassengerSeat() );
        car.autoDimmingInteriorRearviewMirror( carRequestDTO.getAutoDimmingInteriorRearviewMirror() );
        car.secondRowSeats( carRequestDTO.getSecondRowSeats() );
        car.bluetoothConnection( carRequestDTO.getBluetoothConnection() );
        car.wiFiConnection( carRequestDTO.getWiFiConnection() );
        car.pushButtonStart( carRequestDTO.getPushButtonStart() );
        car.centralScreen( carRequestDTO.getCentralScreen() );
        car.driverSeatMassage( carRequestDTO.getDriverSeatMassage() );
        car.passengerSeatMassage( carRequestDTO.getPassengerSeatMassage() );
        car.steeringWheelIntegratedButtons( carRequestDTO.getSteeringWheelIntegratedButtons() );
        car.rearSeatArmrest( carRequestDTO.getRearSeatArmrest() );
        car.frontSeatArmrest( carRequestDTO.getFrontSeatArmrest() );
        car.thirdRow( carRequestDTO.getThirdRow() );
        car.powerSteering( carRequestDTO.getPowerSteering() );
        car.multipleDrivingModes( carRequestDTO.getMultipleDrivingModes() );
        car.electronicHandbrake( carRequestDTO.getElectronicHandbrake() );
        car.automaticBrakeHold( carRequestDTO.getAutomaticBrakeHold() );
        car.activeParkingAssist( carRequestDTO.getActiveParkingAssist() );
        car.supportReadingTrafficSignsAndSignals( carRequestDTO.getSupportReadingTrafficSignsAndSignals() );
        car.vehicleManagementViaPhoneApp( carRequestDTO.getVehicleManagementViaPhoneApp() );
        car.displayInformationOnTheWindshield( carRequestDTO.getDisplayInformationOnTheWindshield() );
        car.steeringAssistWhenCornering( carRequestDTO.getSteeringAssistWhenCornering() );
        car.accelerationControl( carRequestDTO.getAccelerationControl() );
        car.cruiseControl( carRequestDTO.getCruiseControl() );
        car.adaptiveCruiseControl( carRequestDTO.getAdaptiveCruiseControl() );
        car.steeringWheelPaddleShifters( carRequestDTO.getSteeringWheelPaddleShifters() );
        car.idlingStop( carRequestDTO.getIdlingStop() );
        car.electronicBrake( carRequestDTO.getElectronicBrake() );
        car.idlingStopStartStop( carRequestDTO.getIdlingStopStartStop() );
        car.airbags( carRequestDTO.getAirbags() );
        car.adaptiveCruiseControl2( carRequestDTO.getAdaptiveCruiseControl2() );
        car.antiLockBrakingSystem( carRequestDTO.getAntiLockBrakingSystem() );
        car.emergencyBrakeAssist( carRequestDTO.getEmergencyBrakeAssist() );
        car.electronicBrakeForceDistribution( carRequestDTO.getElectronicBrakeForceDistribution() );
        car.electronicStabilityControl( carRequestDTO.getElectronicStabilityControl() );
        car.blindSpotWarning( carRequestDTO.getBlindSpotWarning() );
        car.reverseSensor( carRequestDTO.getReverseSensor() );
        car.reverseCamera( carRequestDTO.getReverseCamera() );
        car.laneDepartureWarning( carRequestDTO.getLaneDepartureWarning() );
        car.laneKeepingAssist( carRequestDTO.getLaneKeepingAssist() );
        car.automaticLaneChange( carRequestDTO.getAutomaticLaneChange() );
        car.automaticCollisionMitigationBrakeAssist( carRequestDTO.getAutomaticCollisionMitigationBrakeAssist() );
        car.crossTrafficWarningWhenReversing( carRequestDTO.getCrossTrafficWarningWhenReversing() );
        car.drowsyDriverWarning( carRequestDTO.getDrowsyDriverWarning() );
        car.isoFixChildSafetySeatHooks( carRequestDTO.getIsoFixChildSafetySeatHooks() );
        car.tirePressureSensor( carRequestDTO.getTirePressureSensor() );
        car.frontDistanceSensor( carRequestDTO.getFrontDistanceSensor() );
        car.preCollisionWarning( carRequestDTO.getPreCollisionWarning() );
        car.laneChangeAssist( carRequestDTO.getLaneChangeAssist() );
        car.trafficWarningWhenOpeningTheDoor( carRequestDTO.getTrafficWarningWhenOpeningTheDoor() );
        car.trafficSignRecognition( carRequestDTO.getTrafficSignRecognition() );
        car.three60degreeCamera( carRequestDTO.getThree60degreeCamera() );
        car.tractionControl( carRequestDTO.getTractionControl() );
        car.hillStartAssist( carRequestDTO.getHillStartAssist() );
        car.hillDescentAssist( carRequestDTO.getHillDescentAssist() );
        car.blindSpotCamera( carRequestDTO.getBlindSpotCamera() );
        car.rearBrakes( carRequestDTO.getRearBrakes() );
        car.frontBrakes( carRequestDTO.getFrontBrakes() );
        car.rearSuspension( carRequestDTO.getRearSuspension() );
        car.frontSuspension( carRequestDTO.getFrontSuspension() );

        return car.build();
    }
}