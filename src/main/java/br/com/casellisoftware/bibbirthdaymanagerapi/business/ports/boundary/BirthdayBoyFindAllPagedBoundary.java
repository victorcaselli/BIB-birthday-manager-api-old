package br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.boundary;

import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.model.BirthdayBoyBusiness;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface BirthdayBoyFindAllPagedBoundary {

    Page<BirthdayBoyBusiness> execute(PageRequest pageRequest);
}
