package com.bootProject.bootProject.core.repository;

import com.bootProject.bootProject.core.model.ImsIndex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImsIndexRepository extends JpaRepository<ImsIndex, Long> {
    Optional<ImsIndex> findById(Long idx);

}
