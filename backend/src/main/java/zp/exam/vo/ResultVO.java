/***********************************************************
 * @Description : 响应结果的通用类
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:14
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL) // 避免返回NULL的字段
public class ResultVO<T> {


    public ResultVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultVO() {
    }

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg = "";

    /**
     * 具体内容
     */
    private T data;
}
