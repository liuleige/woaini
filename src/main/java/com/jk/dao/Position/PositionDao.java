package com.jk.dao.Position;

import com.jk.entity.position.AoaPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionDao extends JpaRepository<AoaPosition,Long> {
}
