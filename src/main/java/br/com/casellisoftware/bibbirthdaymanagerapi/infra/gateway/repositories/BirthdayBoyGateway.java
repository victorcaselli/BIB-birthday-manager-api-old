package br.com.casellisoftware.bibbirthdaymanagerapi.infra.gateway.repositories;

import br.com.casellisoftware.bibbirthdaymanagerapi.infra.gateway.entities.BirthdayBoyEntity;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.mappers.BirthdayBoyDomainEntityMapper;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.mappers.BirthdayBoyEntityBusinessMapper;
import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.datasource.BirthdayBoyDsGateway;
import br.com.casellisoftware.bibbirthdaymanagerapi.domain.birthday.BirthdayBoy;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.mappers.BirthdayBoyEntityDomainMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
@RequiredArgsConstructor
public class BirthdayBoyGateway implements BirthdayBoyDsGateway {

    private final BirthdayBoyRepository birthdayBoyRepository;
    private final BirthdayBoyEntityBusinessMapper businessMapper = new BirthdayBoyEntityBusinessMapper();
    private final BirthdayBoyDomainEntityMapper  entityMapper = new BirthdayBoyDomainEntityMapper();
    private final BirthdayBoyEntityDomainMapper domainMapper = new BirthdayBoyEntityDomainMapper();
    @Override
    public List<BirthdayBoy> findAll() {
        System.out.println(birthdayBoyRepository.findAll());
        return birthdayBoyRepository.findAll()
                .stream()
                .map(businessMapper::map)
                .toList();
    }

    @Override
    public BirthdayBoy save(BirthdayBoy birthdayBoy) {
        BirthdayBoyEntity data = entityMapper.map(birthdayBoy);
        return domainMapper.map(
                birthdayBoyRepository.save(data)
        );
    }

    @Override
    public void deleteById(long id) {
        birthdayBoyRepository.deleteById(id);
    }
}