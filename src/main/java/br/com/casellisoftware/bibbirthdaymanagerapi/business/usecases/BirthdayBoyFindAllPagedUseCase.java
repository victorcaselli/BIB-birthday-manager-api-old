package br.com.casellisoftware.bibbirthdaymanagerapi.business.usecases;

import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.boundary.BirthdayBoyFindAllPagedBoundary;
import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.datasource.BirthdayBoyDsGateway;
import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.model.BirthdayBoyBusiness;
import br.com.casellisoftware.bibbirthdaymanagerapi.business.usecases.factories.BirthdayBoyDomainBusinessFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class BirthdayBoyFindAllPagedUseCase implements BirthdayBoyFindAllPagedBoundary {

    private final BirthdayBoyDsGateway dataSourceGateway;
    private final BirthdayBoyDomainBusinessFactory factory = new BirthdayBoyDomainBusinessFactory();

    public BirthdayBoyFindAllPagedUseCase(BirthdayBoyDsGateway dataSourceGateway) {
        this.dataSourceGateway = dataSourceGateway;
    }

    @Override
    public Page<BirthdayBoyBusiness> execute(PageRequest pageRequest, int month) {
        return dataSourceGateway.findAllPaged(pageRequest, month)
                .map(factory::execute);
    }
}
