/***********************************************************
 * @Description : 前端的操作
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 17:43
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Action {
    @Id
    @GeneratedValue
    private Integer actionId;

    private String actionName;

    private String actionDescription;

    private Boolean defaultCheck;
}
