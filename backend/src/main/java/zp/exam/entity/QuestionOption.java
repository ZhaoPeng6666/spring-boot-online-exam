/***********************************************************
 * @Description : 问题的选项，适用于单选、多选和判断
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023/04/06 17:50
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class QuestionOption {
    @Id
    private String questionOptionId;
    private String questionOptionContent;
    private String questionOptionDescription;
}
