package com.fabiomirgo.compositepk.repository;

import com.fabiomirgo.compositepk.domain.movement.ManualMovementEntity;
import com.fabiomirgo.compositepk.domain.movement.MovementId;
import org.springframework.data.repository.CrudRepository;

public interface ManualMovementRepository extends CrudRepository<ManualMovementEntity, MovementId> {
}
