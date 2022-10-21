package br.com.casellisoftware.bibbirthdaymanagerapi.infra.endpoints;

import br.com.casellisoftware.bibbirthdaymanagerapi.infra.dto.BirthdayBoyResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface FindAllBirthdayBoyEndpoint {

    @GetMapping
    List<BirthdayBoyResponseDto> execute();
}
