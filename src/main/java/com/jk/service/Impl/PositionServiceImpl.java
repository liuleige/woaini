package com.jk.service.Impl;

import com.jk.dao.Position.PositionDao;
import com.jk.entity.position.AoaPosition;
import com.jk.service.user.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService{

    @Autowired
    private PositionDao positionDao;

    public List<AoaPosition> findAll() {

        return positionDao.findAll();
    }

    @Override
    public void addPosition(AoaPosition Position) {
        positionDao.save(Position);

    }

    @Override
    public void deletePosition(Long id) {
        positionDao.delete(id);
    }

    @Override
    public AoaPosition fingOne(Long id) {
        return positionDao.findOne(id);
    }

    @Override
    public void editPosition(AoaPosition Position) {
        positionDao.save(Position);
    }
}
