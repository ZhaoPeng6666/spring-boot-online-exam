/***********************************************************
 * @Description : 用户接口
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:02
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.service;

import zp.exam.dto.RegisterDTO;
import zp.exam.entity.User;
import zp.exam.qo.LoginQo;
import zp.exam.vo.UserInfoVo;
import zp.exam.vo.UserVo;

public interface UserService {
    /**
     * 注册
     *
     * @param registerDTO 注册参数
     * @return 注册成功后的用户信息
     */
    User register(RegisterDTO registerDTO);

    /**
     * 登录接口，登录成功返回token
     *
     * @param loginQo 登录参数
     * @return 成功返回token，失败返回null
     */
    String login(LoginQo loginQo);

    /**
     * 根据用户id获取用户信息
     *
     * @return 用户实体
     */
    UserVo getUserInfo(String userId);

    /**
     * 获取用户详细信息(主要是权限相关的)
     * @param userId 用户的id
     * @return 用户信息组装的实体
     */
    UserInfoVo getInfo(String userId);
}
