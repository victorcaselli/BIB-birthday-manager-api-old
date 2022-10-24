package br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.datasource;

import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.model.BirthdayBoyBusiness;
import br.com.casellisoftware.bibbirthdaymanagerapi.domain.birthday.BirthdayBoy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;

public interface BirthdayBoyDsGateway {

    List<BirthdayBoy> findAll();
    BirthdayBoy save(BirthdayBoy birthdayBoy);
    void deleteById(long id);

    Page<BirthdayBoy> findAllPaged(PageRequest pageRequest);
}
