/***********************************************************
 * @Description : 用户角色表
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023/04/06 17:51
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Role {
    @Id
    @GeneratedValue
    private Integer roleId;
    private String roleName;
    private String roleDescription;
    private String roleDetail;
    /**
     * 角色所能访问的页面的主键集合(用-连接起来字符串)
     */
    private String rolePageIds;
}
