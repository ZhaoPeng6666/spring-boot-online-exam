/***********************************************************
 * @Description : 考试卡片列表
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:08
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ExamCardVo {
    @JsonProperty("id")
    private String examId;
    @JsonProperty("title")
    private String examName;
    @JsonProperty("avatar")
    private String examAvatar;
    @JsonProperty("content")
    private String examDescription;
    @JsonProperty("score")
    private Integer examScore;
    /**
     * 考试限制的时间，单位为分钟
     */
    @JsonProperty("elapse")
    private Integer examTimeLimit;
}
