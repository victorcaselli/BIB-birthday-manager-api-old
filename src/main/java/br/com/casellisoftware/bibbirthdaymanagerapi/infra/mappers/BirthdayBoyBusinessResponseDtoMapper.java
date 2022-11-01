package br.com.casellisoftware.bibbirthdaymanagerapi.infra.mappers;

import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.model.BirthdayBoyBusiness;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.dto.BirthdayBoyResponseDto;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.utils.ModelMapperUtils;

public class BirthdayBoyBusinessResponseDtoMapper {

    public BirthdayBoyResponseDto map(BirthdayBoyBusiness business){
        return ModelMapperUtils.map(business, BirthdayBoyResponseDto.class);
    }
}
