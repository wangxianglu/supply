package com.dianmei.service.impl;

import com.dianmei.dao.GoodsMapper;
import com.dianmei.dto.TableViewDto;
import com.dianmei.model.Goods;
import com.dianmei.service.GoodsService;
import com.dianmei.core.AbstractService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by wangxianglu on 2018/06/21.
 */
@Service
@Transactional
public class GoodsServiceImpl extends AbstractService<Goods> implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    public List<Goods> findList(int start, int end) {
        PageHelper.offsetPage(start, end);
        return goodsMapper.selectGoods();
    }

    public TableViewDto<Goods> pageList() {
        return null;
    }
}
