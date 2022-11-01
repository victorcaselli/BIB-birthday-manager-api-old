package br.com.casellisoftware.bibbirthdaymanagerapi.infra.utils;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class ModelMapperUtils {


    private final ModelMapper modelMapper;
    private static ModelMapper staticModelMapper;

    @PostConstruct
    public void initializer(){
        staticModelMapper = modelMapper;
    }


    public static <S, D> D map(S source, Class<D> destination){
        return staticModelMapper.map(source,destination);
    }

}
