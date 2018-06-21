package com.dianmei.web;
import com.dianmei.core.Result;
import com.dianmei.core.ResultGenerator;
import com.dianmei.model.Goods;
import com.dianmei.service.ScGoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by wangxianglu on 2018/06/21.
*/
@RestController
@RequestMapping("/sc/goods")
public class ScGoodsController {
    @Resource
    private ScGoodsService scGoodsService;

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
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Goods> list = scGoodsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
