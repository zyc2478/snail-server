package com.wanghuan.controller.sys;

import com.wanghuan.model.sys.PageResult;
import com.wanghuan.model.sys.VwBidListEntity;
import com.wanghuan.service.sys.RoleService;
import com.wanghuan.service.sys.VwBidListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class VwBidListController {

    private Logger log = LoggerFactory.getLogger(RoleController.class);

    @Resource(name = "vwBidListServiceImpl")
    private VwBidListService vwBidListService;
/*
    @Resource(name = "roleServiceImpl")
    private RoleService roleService;*/

/*    @GetMapping("/vwbidlist")
    public List<VwBidListEntity> getBidList() {

        List<VwBidListEntity>  vwBidSummary = vwBidListService.getBidSummary(30);

        return vwBidSummary;
    }*/

/*    @GetMapping("/vwbidbydate")
    public VwBidListEntity getVwBid(@PathVariable int id){
        return vwBidListService.getBidList(id);
    }*/

    @GetMapping("/selectVwBidList")
    public PageResult selectVwBidList(){
        String bidDate = "2018-6-12";
        System.out.println("********  in getVwBid *******");
        PageResult pr = new PageResult();
        pr.setData(vwBidListService.getBidByDate(bidDate));
        return pr;
    }

    @GetMapping("/vwbidlist")
    public PageResult getBidList() {
        PageResult pageResult = new PageResult();
        pageResult.setData(vwBidListService.getBidSummary(20));
        return pageResult;
    }
/*    @GetMapping("/vwrolelist")
    public List<VwBidListEntity> getRoleList() {

        List<VwBidListEntity>  vwBidSummary = vwBidListService.getBidSummary(30);

        return vwBidSummary;
    }*/
/*    @RequestMapping(value="/getVwBidList/{diffDays}", produces = "text/json; charset=utf-8")
    @ResponseBody
    public List<VwBidList> getBidList(@PathVariable int diffDays) {

        List<VwBidList>  vwBidSummary = this.vwBidListService.getBidSummary(diffDays);

        return vwBidSummary;
    }*/
}