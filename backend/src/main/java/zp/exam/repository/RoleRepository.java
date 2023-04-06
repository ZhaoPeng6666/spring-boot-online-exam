/***********************************************************
 * @Description : 角色的数据库操作类
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:00
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.repository;

import zp.exam.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
