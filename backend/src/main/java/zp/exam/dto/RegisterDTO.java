/***********************************************************
 * @Description : 注册接口参数
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 17:12
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.dto;

import lombok.Data;

@Data
public class RegisterDTO {
    private String email;
    private String password;
    private String password2;
    private String mobile;
    /**
     * 验证码
     */
    private String captcha;
}
