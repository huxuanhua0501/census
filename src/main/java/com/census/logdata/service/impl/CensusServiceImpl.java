package com.census.logdata.service.impl;

import com.census.logdata.dao.ArkDao;
import com.census.logdata.service.CensusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hu_xuanhua_hua
 * @ClassName: ArkServiceImpl
 * @Description: TODO
 * @date 2018-04-11 18:16
 * @versoin 1.0
 **/
@Service
public class CensusServiceImpl implements CensusService {
    @Autowired
    private ArkDao arkDao;

    @Override
    public void getMaterial() {
        List<String> materialList = arkDao.getMaterial();
        System.err.println(materialList.size());
    }
}
