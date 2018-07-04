package com.dianmei.web;
import com.dianmei.core.Result;
import com.dianmei.core.ResultGenerator;
import com.dianmei.model.Store;
import com.dianmei.service.StoreService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by wangxianglu on 2018/07/04.
*/
@RestController
@RequestMapping("/bm/store")
public class StoreController {
    @Resource
    private StoreService bmStoreService;

    @PostMapping("/add")
    public Result add(Store bmStore) {
        bmStoreService.save(bmStore);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        bmStoreService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Store bmStore) {
        bmStoreService.update(bmStore);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Store bmStore = bmStoreService.findById(id);
        return ResultGenerator.genSuccessResult(bmStore);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Store> list = bmStoreService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
