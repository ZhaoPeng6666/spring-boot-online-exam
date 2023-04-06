/***********************************************************
 * @Description : 问题选项的自定义实体类
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:12
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class QuestionOptionVo {
    @JsonProperty("id")
    private String questionOptionId;

    @JsonProperty("content")
    private String questionOptionContent;

    @JsonProperty("answer")
    private Boolean answer = false;

    @JsonProperty("description")
    private String questionOptionDescription;
}
