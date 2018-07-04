package com.dianmei.controller;
import com.dianmei.core.Result;
import com.dianmei.core.ResultGenerator;
import com.dianmei.model.UserPermission;
import com.dianmei.service.UserPermissionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by wangxianglu on 2018/07/03.
*/
@RestController
@RequestMapping("/permission")
public class UserPermissionController {
    @Resource
    private UserPermissionService smUserPermissionService;

    @PostMapping("/add")
    public Result add(UserPermission smUserPermission) {
        smUserPermissionService.save(smUserPermission);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        smUserPermissionService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(UserPermission smUserPermission) {
        smUserPermissionService.update(smUserPermission);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        List<UserPermission> smUserPermission = smUserPermissionService.findByUser(id);
        return ResultGenerator.genSuccessResult(smUserPermission);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserPermission> list = smUserPermissionService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
