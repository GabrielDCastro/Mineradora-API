package org.br.mineradora.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.br.mineradora.entity.ProposalEntity;

import java.util.Optional;

@ApplicationScoped
public class ProposalRepository implements PanacheRepository<ProposalEntity> {

    //como se fosse um select * from proposal where costumer
    public Optional<ProposalEntity> findByCustomer(String customer){
        return Optional.of(find("customer", customer).firstResult());
    }
}
