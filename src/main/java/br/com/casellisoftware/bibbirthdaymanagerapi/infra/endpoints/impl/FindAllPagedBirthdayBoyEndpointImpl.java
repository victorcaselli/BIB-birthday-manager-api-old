package br.com.casellisoftware.bibbirthdaymanagerapi.infra.endpoints.impl;

import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.boundary.BirthdayBoyFindAllBoundary;
import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.boundary.BirthdayBoyFindAllPagedBoundary;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.dto.BirthdayBoyResponseDto;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.endpoints.FindAllBirthdayBoyEndpoint;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.endpoints.FindAllPagedBirthdayBoyEndpoint;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.mappers.BirthdayBoyBusinessResponseDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/v1/bb/list/paged")
@RequiredArgsConstructor
public class FindAllPagedBirthdayBoyEndpointImpl implements FindAllPagedBirthdayBoyEndpoint {

    private final BirthdayBoyFindAllPagedBoundary useCase;
    private final BirthdayBoyBusinessResponseDtoMapper businessMapper = new BirthdayBoyBusinessResponseDtoMapper();


    @Override
    public Page<BirthdayBoyResponseDto> execute(Integer page, Integer linesPerPage, String orderBy, String direction) {

        if(checkLinePerPage(linesPerPage))
            throw new IllegalArgumentException("Invalid linesPerPage");

        return useCase.execute(pageRequestFactory(page,linesPerPage,orderBy,direction))
                .map(businessMapper::map);
    }


    private PageRequest pageRequestFactory(Integer page, Integer linesPerPage, String orderBy, String direction){
        return PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
    }

    private boolean checkLinePerPage(Integer linesPerPage){
        return linesPerPage > 10 || linesPerPage < 5;
    }
}
