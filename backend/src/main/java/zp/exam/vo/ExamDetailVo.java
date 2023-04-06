/***********************************************************
 * @Description : 考试详情的实体类
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:08
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.vo;

import zp.exam.entity.Exam;
import lombok.Data;

@Data
public class ExamDetailVo {
    /**
     * 考试的基本信息对象
     */
    private Exam exam;

    /**
     * 单选题的id数组
     */
    private String[] radioIds;

    /**
     * 多选题的id数组
     */
    private String[] checkIds;

    /**
     * 判断题的id数组
     */
    private String[] judgeIds;

}
