package com.api.WorkoutApp.service;

import com.api.WorkoutApp.dto.AthleteDto;

import java.util.List;

public interface AthleteService {
    AthleteDto createAthlete(AthleteDto athleteDto);
    List<AthleteDto> getAthletesByTrainersId(Long id);
    AthleteDto getAthleteById(Long id);

    AthleteDto updateAthlete(AthleteDto dto, Long id);

    void deleteAthlete(Long id);

}
