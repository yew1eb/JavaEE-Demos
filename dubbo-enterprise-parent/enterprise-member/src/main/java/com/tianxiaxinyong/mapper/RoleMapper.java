package com.tianxiaxinyong.mapper;

import com.tianxiaxinyong.enterprise.member.domain.Role;

public interface RoleMapper {

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Apr 05 14:32:47 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Apr 05 14:32:47 CST 2016
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Apr 05 14:32:47 CST 2016
     */
    Role selectByPrimaryKey(String id);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Apr 05 14:32:47 CST 2016
     */
    int updateByPrimaryKeySelective(Role record);
}