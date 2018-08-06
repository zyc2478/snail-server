package com.wanghuan.service.impl.sys;

import com.wanghuan.dao.VwBidListDao;
import com.wanghuan.model.sys.VwBidListEntity;
import com.wanghuan.service.sys.VwBidListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service(value="vwBidListServiceImpl")
public class VwBidListServiceImpl implements VwBidListService {

    @Autowired
    private VwBidListDao vwBidListDao;

    @Override
    public List<VwBidListEntity> getBidSummary(int diffDays) {
        List<VwBidListEntity> bidSummaryList = vwBidListDao.getVwBidSummary();
        List<VwBidListEntity> bidSummaryResult = new ArrayList<>();

        for(int i=0; i<bidSummaryList.size();i++){
           VwBidListEntity vwBidListEntity = bidSummaryResult.get(i);
           long current_time = new Date().getTime();
           long calc_time = current_time - diffDays * 3600 * 24;
           if(vwBidListEntity.getBid_date_time().getTime() > calc_time){
               bidSummaryList.add(bidSummaryResult.get(i));
           }
        }
        return bidSummaryList;
    }

    @Override
    public List<VwBidListEntity> getBidByDate(String bidDate) {
        return vwBidListDao.selectByBidDate(bidDate);
    }


}