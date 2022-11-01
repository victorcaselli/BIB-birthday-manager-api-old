package br.com.casellisoftware.bibbirthdaymanagerapi.infra.mappers;

import br.com.casellisoftware.bibbirthdaymanagerapi.infra.gateway.entities.BirthdayBoyEntity;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.utils.ModelMapperUtils;
import br.com.casellisoftware.bibbirthdaymanagerapi.domain.birthday.BirthdayBoy;

public class BirthdayBoyEntityBusinessMapper {

    public BirthdayBoy map(BirthdayBoyEntity entity){
        return ModelMapperUtils.map(entity, BirthdayBoy.class);
    }
}
