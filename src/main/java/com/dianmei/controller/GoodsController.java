package com.dianmei.controller;
import com.dianmei.core.Result;
import com.dianmei.core.ResultGenerator;
import com.dianmei.dto.TableViewDto;
import com.dianmei.model.Goods;
import com.dianmei.service.GoodsService;
import com.dianmei.vo.GoodsTableVo;
import com.dianmei.vo.TableViewVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by wangxianglu on 2018/06/21.
*/
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    private GoodsService scGoodsService;

    @PostMapping("/add")
    public Result add(Goods scGoods) {
        scGoodsService.save(scGoods);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        scGoodsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Goods scGoods) {
        scGoodsService.update(scGoods);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Goods scGoods = scGoodsService.findById(id);
        return ResultGenerator.genSuccessResult(scGoods);
    }

    @PostMapping("/list")
    public TableViewDto list(@RequestBody GoodsTableVo goodsTableVo) {

        goodsTableVo = goodsTableVo.getParams();
        List<Goods> list = scGoodsService.findList(goodsTableVo.getOffset(), goodsTableVo.getLimit());
        PageInfo pageInfo = new PageInfo(list);
        return new TableViewDto(list, pageInfo.getTotal());
    }
}
