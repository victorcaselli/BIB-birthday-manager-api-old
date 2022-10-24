package br.com.casellisoftware.bibbirthdaymanagerapi.infra.config;

import br.com.casellisoftware.bibbirthdaymanagerapi.infra.gateway.entities.BirthdayBoyEntity;
import br.com.casellisoftware.bibbirthdaymanagerapi.infra.gateway.repositories.BirthdayBoyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Configuration
public class Runner implements CommandLineRunner {

    private final BirthdayBoyRepository repository;

    @Override
    public void run(String... args) throws Exception {
        BirthdayBoyEntity b1 = new BirthdayBoyEntity();
        b1.setName("João");
        b1.setBirthday(LocalDate.of(1995,11,25));
        BirthdayBoyEntity b2 = new BirthdayBoyEntity();
        b2.setName("Victor");
        b2.setBirthday(LocalDate.of(2000, 10, 25));
        BirthdayBoyEntity b3 = new BirthdayBoyEntity();
        b3.setBirthday(LocalDate.of(2001, 9, 24));
        repository.saveAll(List.of(b1,b2,b3));


        var list = repository.findAll();
        list.sort((b11,b22) -> {
            if(b11.getBirthday().getMonth().getValue() < b22.getBirthday().getMonth().getValue() && b11.getBirthday().getDayOfMonth() < b22.getBirthday().getDayOfMonth()){
                return 0;
            }
            return -1;
        });
        System.out.println(list);

    }
}
