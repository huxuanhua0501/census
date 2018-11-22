package com.census.logdata.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hu_xuanhua_hua
 * @ClassName: ArkDaoMapper
 * @Description: TODO
 * @date 2018-04-11 18:13
 * @versoin 1.0
 **/
//@Repository
//@Mapper
public interface ArkDao {
    List<String> getMaterial();
}
