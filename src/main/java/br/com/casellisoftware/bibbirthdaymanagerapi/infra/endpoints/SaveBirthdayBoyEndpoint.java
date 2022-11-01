package br.com.casellisoftware.bibbirthdaymanagerapi.infra.endpoints;

import br.com.casellisoftware.bibbirthdaymanagerapi.infra.dto.BirthdayBoyRequestDto;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.dto.BirthdayBoyResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface SaveBirthdayBoyEndpoint {

    @PostMapping
    BirthdayBoyResponseDto execute(@RequestBody BirthdayBoyRequestDto dto);
}
