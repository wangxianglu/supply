package com.dianmei.web;
import com.dianmei.core.Result;
import com.dianmei.core.ResultGenerator;
import com.dianmei.model.Company;
import com.dianmei.service.CompanyService;
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
@RequestMapping("/bm/company")
public class CompanyController {
    @Resource
    private CompanyService bmCompanyService;

    @PostMapping("/add")
    public Result add(Company bmCompany) {
        bmCompanyService.save(bmCompany);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        bmCompanyService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Company bmCompany) {
        bmCompanyService.update(bmCompany);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Company bmCompany = bmCompanyService.findById(id);
        return ResultGenerator.genSuccessResult(bmCompany);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Company> list = bmCompanyService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
