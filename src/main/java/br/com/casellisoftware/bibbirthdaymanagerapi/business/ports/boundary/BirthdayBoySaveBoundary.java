package br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.boundary;

import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.model.BirthdayBoyBusiness;

public interface BirthdayBoySaveBoundary {

    BirthdayBoyBusiness execute(BirthdayBoyBusiness birthdayBoyBusiness);
}
