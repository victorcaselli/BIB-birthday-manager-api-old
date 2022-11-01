package br.com.casellisoftware.bibbirthdaymanagerapi.infra.gateway.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "birthday_boy")
public class BirthdayBoyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
