package br.com.casellisoftware.bibbirthdaymanagerapi.infra.endpoints;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public interface DeleteByIdBirthdayBoyEndpoint {

    @DeleteMapping("/{id}")
    void execute(@PathVariable long id);

}
