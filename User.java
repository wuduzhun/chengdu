package com.offcn.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="tb_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    //设置用户主键和自增
	//修改
    @Id
    @GeneratedValue
    private Long id;
    @Column(length = 200,nullable = false)
    private String name;
    @Column(length = 6,nullable = true)
    private Integer age;
}
