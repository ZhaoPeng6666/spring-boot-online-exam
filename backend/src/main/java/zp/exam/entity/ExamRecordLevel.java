/***********************************************************
 * @Description : 考试得分级别
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023/4/6 17:46
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class ExamRecordLevel {
    @Id
    @GeneratedValue
    private Integer examRecordLevelId;
    private String examRecordLevelName;
    private String examRecordLevelDescription;
}
