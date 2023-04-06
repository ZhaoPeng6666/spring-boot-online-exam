/***********************************************************
 * @Description : 用户信息的展示类,通过JsonProperty来简化返回
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:14
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserVo {
    @JsonProperty("id")
    private String userId;

    @JsonProperty("username")
    private String userUsername;

    @JsonProperty("nickname")
    private String userNickname;

    @JsonProperty("role")
    private Integer userRoleId;

    @JsonProperty("avatar")
    private String userAvatar;

    @JsonProperty("description")
    private String userDescription;

    @JsonProperty("email")
    private String userEmail;

    @JsonProperty("phone")
    private String userPhone;
}
