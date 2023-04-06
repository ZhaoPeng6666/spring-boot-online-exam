/***********************************************************
 * @Description : 考试记录VO
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:10
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.vo;

import zp.exam.entity.Exam;
import zp.exam.entity.ExamRecord;
import zp.exam.entity.User;
import lombok.Data;

@Data
public class ExamRecordVo {
    /**
     * 当前考试记录对应的考试
     */
    private Exam exam;

    /**
     * 当前考试对应的内容
     */
    private ExamRecord examRecord;

    /**
     * 参加考试的用户信息
     */
    private User user;
}
