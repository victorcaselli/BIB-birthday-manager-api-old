package br.com.casellisoftware.bibbirthdaymanagerapi.infra.endpoints.impl;

import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.boundary.BirthdayBoySaveBoundary;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.dto.BirthdayBoyRequestDto;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.dto.BirthdayBoyResponseDto;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.endpoints.SaveBirthdayBoyEndpoint;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.mappers.BirthdayBoyBusinessResponseDtoMapper;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.mappers.BirthdayRequestDtoBusinessMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bb/save")
@RequiredArgsConstructor
public class SaveBirthdayBoyEndpointImpl implements SaveBirthdayBoyEndpoint {

    private final BirthdayBoySaveBoundary useCase;
    private final BirthdayRequestDtoBusinessMapper requestMapper = new BirthdayRequestDtoBusinessMapper();
    private final BirthdayBoyBusinessResponseDtoMapper responseMapper = new BirthdayBoyBusinessResponseDtoMapper();

    @Override
    public BirthdayBoyResponseDto execute(BirthdayBoyRequestDto dto) {
        return responseMapper.map(
                useCase.execute(
                        requestMapper.map(dto)
                )
        );
    }
}
