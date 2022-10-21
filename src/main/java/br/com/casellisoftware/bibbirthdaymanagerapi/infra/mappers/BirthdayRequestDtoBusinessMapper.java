package br.com.casellisoftware.bibbirthdaymanagerapi.infra.mappers;

import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.model.BirthdayBoyBusiness;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.dto.BirthdayBoyRequestDto;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.utils.ModelMapperUtils;

public class BirthdayRequestDtoBusinessMapper {

    public BirthdayBoyBusiness map(BirthdayBoyRequestDto dto){
        return ModelMapperUtils.map(dto, BirthdayBoyBusiness.class);
    }
}
