/***********************************************************
 * @Description : 考试中的题目
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:09
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ExamQuestionSelectVo {
    @JsonProperty("id")
    private String questionId;

    @JsonProperty("name")
    private String questionName;

    /**
     * 这个问题是否被选为了考试中的题目.默认是false，经过前端修改后可能会变成true，
     * 传回来用于创建问题
     */
    @JsonProperty("checked")
    private Boolean checked = false;
}
