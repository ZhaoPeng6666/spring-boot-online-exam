/***********************************************************
 * @Description : 前端页面实体类
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 17:48
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Page {
    @Id
    @GeneratedValue
    private Integer pageId;

    private String pageName;

    private String pageDescription;

    private String actionIds;
}
