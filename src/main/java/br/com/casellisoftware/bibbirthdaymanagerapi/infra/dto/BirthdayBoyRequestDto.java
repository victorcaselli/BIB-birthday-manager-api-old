package br.com.casellisoftware.bibbirthdaymanagerapi.infra.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BirthdayBoyRequestDto {

    private String name;
    private LocalDate birthday;
}