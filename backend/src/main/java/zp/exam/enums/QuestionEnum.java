/***********************************************************
 * @Description : 问题类型的的枚举
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023/04/06 17:52
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.enums;

import lombok.Getter;

@Getter
public enum QuestionEnum {

    /**
     * 问题类型
     */
    RADIO(1, "单选题"),
    CHECK(2, "多选题"),
    JUDGE(3, "判断题");


    QuestionEnum(Integer id, String role) {
        this.id = id;
        this.role = role;
    }

    private Integer id;
    private String role;
}
