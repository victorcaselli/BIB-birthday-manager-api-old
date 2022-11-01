package br.com.casellisoftware.bibbirthdaymanagerapi.business.usecases;

import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.boundary.BirthdayBoySaveBoundary;
import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.datasource.BirthdayBoyDsGateway;
import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.model.BirthdayBoyBusiness;
import br.com.casellisoftware.bibbirthdaymanagerapi.business.usecases.factories.BirthdayBoyBusinessDomainFactory;
import br.com.casellisoftware.bibbirthdaymanagerapi.business.usecases.factories.BirthdayBoyDomainBusinessFactory;
import br.com.casellisoftware.bibbirthdaymanagerapi.domain.birthday.BirthdayBoy;

public class BirthdayBoySaveUseCase implements BirthdayBoySaveBoundary {

    private final BirthdayBoyDsGateway gateway;
    private final BirthdayBoyDomainBusinessFactory factory = new BirthdayBoyDomainBusinessFactory();
    private final BirthdayBoyBusinessDomainFactory domainFactory = new BirthdayBoyBusinessDomainFactory();

    public BirthdayBoySaveUseCase(BirthdayBoyDsGateway gateway) {
        this.gateway = gateway;
    }


    @Override
    public BirthdayBoyBusiness execute(BirthdayBoyBusiness birthdayBoyBusiness) {
        generateMonthAndDayOfMonth(birthdayBoyBusiness);
        BirthdayBoy domain = domainFactory.execute(birthdayBoyBusiness);
        domain = gateway.save(domain);
        return factory.execute(domain);
    }


    private void generateMonthAndDayOfMonth(BirthdayBoyBusiness entity){
        int month = entity.getBirthday().getMonth().getValue();
        int dayOfMonth = entity.getBirthday().getDayOfMonth();
        entity.setMonthOfYear(month);
        entity.setDayOfMonth(dayOfMonth);
    }
}
