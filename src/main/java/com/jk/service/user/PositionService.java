package com.jk.service.user;

import com.jk.entity.position.AoaPosition;

import java.util.List;

public interface PositionService {

    public List<AoaPosition> findAll();

    public  void  addPosition(AoaPosition position);

    public void deletePosition(Long id);

    public  AoaPosition  fingOne(Long id);

    public  void  editPosition(AoaPosition position);
}
