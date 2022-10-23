package br.com.casellisoftware.bibbirthdaymanagerapi.infra.endpoints.impl;

import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.boundary.BirthdayBoyDeleteByIdBoundary;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.endpoints.DeleteByIdBirthdayBoyEndpoint;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/bb/delete")
@RequiredArgsConstructor
public class DeleteByIdBirthdayBoyEndpointImpl implements DeleteByIdBirthdayBoyEndpoint {

    private final BirthdayBoyDeleteByIdBoundary useCase;

    @Override
    public void execute(long id) {
        useCase.execute(id);
    }
}
