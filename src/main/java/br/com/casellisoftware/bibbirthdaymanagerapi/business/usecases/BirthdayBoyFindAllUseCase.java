package br.com.casellisoftware.bibbirthdaymanagerapi.business.usecases;

import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.datasource.BirthdayBoyDsGateway;
import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.model.BirthdayBoyBusiness;
import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.boundary.BirthdayBoyFindAllBoundary;
import br.com.casellisoftware.bibbirthdaymanagerapi.business.usecases.factories.BirthdayBoyDomainBusinessFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


public class BirthdayBoyFindAllUseCase implements BirthdayBoyFindAllBoundary {

    private final BirthdayBoyDsGateway dataSourceGateway;
    private final BirthdayBoyDomainBusinessFactory factory = new BirthdayBoyDomainBusinessFactory();

    public BirthdayBoyFindAllUseCase(BirthdayBoyDsGateway dataSourceGateway) {
        this.dataSourceGateway = dataSourceGateway;
    }

    @Override
    public List<BirthdayBoyBusiness> execute(){

        return dataSourceGateway.findAll()
                .stream()
                .map(factory::execute)
                .collect(Collectors.toList());
    }


}
