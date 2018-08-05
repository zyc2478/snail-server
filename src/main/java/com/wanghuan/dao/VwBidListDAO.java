package com.wanghuan.dao;

import com.wanghuan.model.sys.VwBidListEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * VwBidListDAO继承基类
 */
@Repository
public interface VwBidListDAO {

    VwBidListEntity selectByPrimaryKey(long id);

    List<VwBidListEntity> getVwBidSummary();

    int updateByPrimaryKeySelective(VwBidListEntity record);

    int updateByPrimaryKey(VwBidListEntity record);
}