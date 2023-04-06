/***********************************************************
 * @Description : 用户角色的枚举
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023/04/06 17:52
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.enums;

import lombok.Getter;

@Getter
public enum RoleEnum {

    /**
     * 用户角色，和数据库里面的role表相对应
     */
    ADMIN(1, "管理员"),
    TEACHER(2, "教师"),
    STUDENT(3, "学生");


    RoleEnum(Integer id, String role) {
        this.id = id;
        this.role = role;
    }

    private Integer id;
    private String role;
}
