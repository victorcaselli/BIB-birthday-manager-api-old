package br.com.casellisoftware.bibbirthdaymanagerapi.infra.gateway.repositories;

import br.com.casellisoftware.bibbirthdaymanagerapi.infra.gateway.entities.BirthdayBoyEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BirthdayBoyRepository extends JpaRepository<BirthdayBoyEntity, Long>  {

    @Query("SELECT obj FROM BirthdayBoyEntity obj where obj.monthOfYear = :month")
    Page<BirthdayBoyEntity> findAllPaged(Pageable pageable, int month);
}
