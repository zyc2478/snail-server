package com.wanghuan.service.sys;

import com.wanghuan.model.sys.VwBidListEntity;

import java.util.List;

public interface VwBidListService {

    List<VwBidListEntity> getBidSummary(int lastDaysNum);
}