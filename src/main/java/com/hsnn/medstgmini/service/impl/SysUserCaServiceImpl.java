package com.hsnn.medstgmini.service.impl;

import com.hsnn.medstgmini.mapper.SysUserCaDao;
import com.hsnn.medstgmini.entity.SysUserCa;
import com.hsnn.medstgmini.service.SysUserCaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 64889 on 2017-10-20.
 */
@Service
public class SysUserCaServiceImpl implements SysUserCaService {
    @Autowired
    SysUserCaDao sysUserCaDao;

    @Override
    public List<SysUserCa> findAll() {
        return sysUserCaDao.findAll();
    }
}
