package com.luo.demo;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xiangnan
 */
public interface PersonDao {

    List<Person> selectAll();

    Person selectById(@Param("id") int id);

}
