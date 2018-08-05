package com.wanghuan.controller.sys;

import com.wanghuan.model.sys.VwBidListEntity;
import com.wanghuan.service.sys.VwBidListService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/vwBidList")
public class VwBidListController {

    @Resource
    private VwBidListService vwBidListService;

    @CrossOrigin(origins="*",maxAge=3600)
    @RequestMapping(value="/getVwBidList/{diffDays}", produces = "text/json; charset=utf-8")
    @ResponseBody
    public List<VwBidListEntity> getBidList(@PathVariable int diffDays) {

        List<VwBidListEntity>  vwBidSummary = this.vwBidListService.getBidSummary(diffDays);

        return vwBidSummary;
    }
/*    @RequestMapping(value="/getVwBidList/{diffDays}", produces = "text/json; charset=utf-8")
    @ResponseBody
    public List<VwBidList> getBidList(@PathVariable int diffDays) {

        List<VwBidList>  vwBidSummary = this.vwBidListService.getBidSummary(diffDays);

        return vwBidSummary;
    }*/
}