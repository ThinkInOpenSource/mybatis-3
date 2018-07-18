package com.luo.demo;

import java.util.List;

/**
 * @author xiangnan
 */
public interface PersonDao {

    List<Person> selectAll();

    Person selectById(int id);

}
