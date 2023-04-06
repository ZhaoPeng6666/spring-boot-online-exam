/***********************************************************
 * @Description : Action的前端展示类
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:08
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ActionVo {
    @JsonProperty("action")
    private String actionName;

    @JsonProperty("describe")
    private String actionDescription;

    @JsonProperty("defaultCheck")
    private Boolean defaultCheck;
}
