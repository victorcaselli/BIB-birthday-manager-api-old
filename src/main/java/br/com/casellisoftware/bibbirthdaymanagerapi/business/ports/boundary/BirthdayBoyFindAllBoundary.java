package br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.boundary;

import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.model.BirthdayBoyBusiness;

import java.util.List;

public interface BirthdayBoyFindAllBoundary {

    List<BirthdayBoyBusiness> execute();
}
