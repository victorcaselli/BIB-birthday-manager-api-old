package br.com.casellisoftware.bibbirthdaymanagerapi.business.usecases;

import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.boundary.BirthdayBoyDeleteByIdBoundary;
import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.datasource.BirthdayBoyDsGateway;

public class BirthdayBoyDeleteByIdUseCase implements BirthdayBoyDeleteByIdBoundary {

    private final BirthdayBoyDsGateway gateway;

    public BirthdayBoyDeleteByIdUseCase(BirthdayBoyDsGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void execute(long id) {
        gateway.deleteById(id);
    }
}
