package com.dianmei.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *  菜单树DTO
 *@ClassName TreeDto
 *@Description TODO
 *@Author lout
 *@Date 2018/7/3 13:36
 *@Version 1.0
 **/
@Getter
@Setter
public class TreeDto {

    private String text;

    private List<TreeDto> nodes;
}
