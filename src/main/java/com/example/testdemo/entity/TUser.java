package com.example.testdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author author
 * @since 2023-07-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user")
@ApiModel(value="TUser对象", description="")
public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String userName;

    private String email;

    private String passWord;
    private Date birth;
    private Integer gender;

    private Integer type;

    public TUser(Integer id, String userName, String email, String passWord) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.passWord = passWord;
    }
    public TUser() {

    }
}
