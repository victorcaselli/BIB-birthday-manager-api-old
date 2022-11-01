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
public class BirthdayBoyResponseDto {

    private Long id;
    private String name;
    private LocalDate birthday;
    private int monthOfYear;
    private int dayOfMonth;
    private int interestType;
    private String job;
    private String email;
    private String phone;
}
