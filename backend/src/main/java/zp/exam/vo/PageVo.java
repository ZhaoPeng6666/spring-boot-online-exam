/***********************************************************
 * @Description : Action的前端展示类
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:11
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PageVo {
    @JsonProperty("actionEntitySet")
    private List<ActionVo> actionVoList;

    @JsonProperty("permissionId")
    private String pageName;

    @JsonProperty("permissionName")
    private String pageDescription;
}
