package com.atiguigu.gulimall.member.dao;

import com.atiguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author leehao
 * @email leehao99@163.com
 * @date 2023-02-18 12:46:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
