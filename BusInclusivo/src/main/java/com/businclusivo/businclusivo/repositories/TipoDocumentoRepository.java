package com.businclusivo.businclusivo.repositories;

import com.businclusivo.businclusivo.entities.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento,Integer> {

}
