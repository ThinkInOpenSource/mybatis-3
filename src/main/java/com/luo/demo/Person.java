package com.luo.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiangnan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private int id;
    private String userId;
    private String name;
    private int    age;
}
