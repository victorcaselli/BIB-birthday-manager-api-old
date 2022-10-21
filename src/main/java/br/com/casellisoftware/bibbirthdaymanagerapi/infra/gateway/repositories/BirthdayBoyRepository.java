package br.com.casellisoftware.bibbirthdaymanagerapi.infra.gateway.repositories;

import br.com.casellisoftware.bibbirthdaymanagerapi.infra.gateway.entities.BirthdayBoyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BirthdayBoyRepository extends JpaRepository<BirthdayBoyEntity, Long>  {
}
