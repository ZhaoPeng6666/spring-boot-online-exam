/***********************************************************
 * @Description : 角色的实体类
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:14
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class RoleVo {
    @JsonProperty("id")
    private String roleName;

    @JsonProperty("name")
    private String roleDescription;

    @JsonProperty("describe")
    private String roleDetail;

    @JsonProperty("permissions")
    private List<PageVo> pageVoList;
}
