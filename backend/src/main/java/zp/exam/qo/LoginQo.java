/***********************************************************
 * @Description : 登录的查询参数
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023/04/06 17:55
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.qo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginQo {
    /**
     * 1表示用户名，2表示邮箱
     */
    private Integer loginType;
    /**
     * 用户名/邮箱的字符串
     */
    private String userInfo;
    /**
     * 用户密码
     */
    private String password;
}
