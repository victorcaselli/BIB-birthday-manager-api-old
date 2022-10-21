package br.com.casellisoftware.bibbirthdaymanagerapi.infra.mappers;

import br.com.casellisoftware.bibbirthdaymanagerapi.domain.birthday.BirthdayBoy;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.gateway.entities.BirthdayBoyEntity;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.utils.ModelMapperUtils;

public class BirthdayBoyDomainEntityMapper {

    public BirthdayBoyEntity map(BirthdayBoy birthdayBoy){
        return ModelMapperUtils.map(birthdayBoy, BirthdayBoyEntity.class);
    }
}
