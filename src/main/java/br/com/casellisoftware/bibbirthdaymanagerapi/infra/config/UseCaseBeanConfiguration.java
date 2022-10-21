package br.com.casellisoftware.bibbirthdaymanagerapi.infra.config;

import br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.datasource.BirthdayBoyDsGateway;
import br.com.casellisoftware.bibbirthdaymanagerapi.business.usecases.BirthdayBoyDeleteByIdUseCase;
import br.com.casellisoftware.bibbirthdaymanagerapi.business.usecases.BirthdayBoyFindAllUseCase;
import br.com.casellisoftware.bibbirthdaymanagerapi.business.usecases.BirthdayBoySaveUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfiguration {


    @Bean
    public BirthdayBoyFindAllUseCase birthdayBoyFindAllUseCase(BirthdayBoyDsGateway birthdayBoyDsGateway){
        return new BirthdayBoyFindAllUseCase(birthdayBoyDsGateway);
    }

    @Bean
    public BirthdayBoySaveUseCase birthdayBoySaveUseCase(BirthdayBoyDsGateway birthdayBoyDsGateway){
        return new BirthdayBoySaveUseCase(birthdayBoyDsGateway);
    }

    @Bean
    public BirthdayBoyDeleteByIdUseCase birthdayBoyDeleteByIdUseCase(BirthdayBoyDsGateway birthdayBoyDsGateway){
        return new BirthdayBoyDeleteByIdUseCase(birthdayBoyDsGateway);
    }
}
