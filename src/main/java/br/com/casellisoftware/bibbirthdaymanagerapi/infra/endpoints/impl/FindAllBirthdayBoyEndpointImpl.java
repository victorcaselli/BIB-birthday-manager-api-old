package br.com.casellisoftware.bibbirthdaymanagerapi.infra.endpoints.impl;

import br.com.casellisoftware.bibbirthdaymanagerapi.infra.endpoints.FindAllBirthdayBoyEndpoint;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.dto.BirthdayBoyResponseDto;
import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.boundary.BirthdayBoyFindAllBoundary;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.mappers.BirthdayBoyBusinessResponseDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bb/list")
@RequiredArgsConstructor
public class FindAllBirthdayBoyEndpointImpl implements FindAllBirthdayBoyEndpoint {

    private final BirthdayBoyFindAllBoundary useCase;
    private final BirthdayBoyBusinessResponseDtoMapper businessMapper = new BirthdayBoyBusinessResponseDtoMapper();

    @Override
    public List<BirthdayBoyResponseDto> execute() {
        return useCase.execute()
                .stream()
                .map(businessMapper::map)
                .toList();
    }
}
