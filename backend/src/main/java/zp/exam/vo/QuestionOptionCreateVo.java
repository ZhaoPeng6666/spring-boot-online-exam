/***********************************************************
 * @Description : 问题选项的外层对象
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:12
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class QuestionOptionCreateVo {

    /**
     * 问题的内容
     */
    @JsonProperty("content")
    private String questionOptionContent;

    /**
     * 当前的选项是否是问题大答案
     */
    @JsonProperty("answer")
    private Boolean answer = false;

}
