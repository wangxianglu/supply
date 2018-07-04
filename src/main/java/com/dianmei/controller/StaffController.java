package com.dianmei.web;
import com.dianmei.core.Result;
import com.dianmei.core.ResultGenerator;
import com.dianmei.model.Staff;
import com.dianmei.service.StaffService;
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
@RequestMapping("/sm/staff")
public class StaffController {
    @Resource
    private StaffService smStaffService;

    @PostMapping("/add")
    public Result add(Staff smStaff) {
        smStaffService.save(smStaff);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        smStaffService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Staff smStaff) {
        smStaffService.update(smStaff);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Staff smStaff = smStaffService.findById(id);
        return ResultGenerator.genSuccessResult(smStaff);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Staff> list = smStaffService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
