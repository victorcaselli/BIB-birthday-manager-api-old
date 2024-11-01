package br.com.casellisoftware.bibbirthdaymanagerapi.business.usecases.factories;

import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.model.BirthdayBoyBusiness;
import br.com.casellisoftware.bibbirthdaymanagerapi.domain.birthday.BirthdayBoy;

public class BirthdayBoyDomainBusinessFactory {


    public BirthdayBoyBusiness execute(BirthdayBoy domain){
        return BirthdayBoyBusiness
                .BirthdayBoyBusinessBuilder
                .aBirthdayBoyBusiness()
                .withName(domain.getName())
                .withId(domain.getId())
                .withBirthday(domain.getBirthday())
                .withDayOfMonth(domain.getDayOfMonth())
                .withMonthOfYear(domain.getMonthOfYear())
                .withJob(domain.getJob())
                .withInterestType(domain.getInterestType())
                .withEmail(domain.getEmail())
                .withPhone(domain.getPhone())
                .build();
    }
}
