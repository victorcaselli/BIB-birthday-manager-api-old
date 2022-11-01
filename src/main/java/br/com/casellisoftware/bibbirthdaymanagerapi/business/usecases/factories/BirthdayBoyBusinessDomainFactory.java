package br.com.casellisoftware.bibbirthdaymanagerapi.business.usecases.factories;

import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.model.BirthdayBoyBusiness;
import br.com.casellisoftware.bibbirthdaymanagerapi.domain.birthday.BirthdayBoy;

public class BirthdayBoyBusinessDomainFactory {


    public BirthdayBoy execute(BirthdayBoyBusiness business){
        return BirthdayBoy
                .BirthdayBoyBuilder
                .aBirthdayBoy()
                .withName(business.getName())
                .withId(business.getId())
                .withBirthday(business.getBirthday())
                .withMonthOfYear(business.getMonthOfYear())
                .withDayOfMonth(business.getDayOfMonth())
                .withJob(business.getJob())
                .withInterestType(business.getInterestType())
                .withEmail(business.getEmail())
                .withPhone(business.getPhone())
                .build();
    }
}
