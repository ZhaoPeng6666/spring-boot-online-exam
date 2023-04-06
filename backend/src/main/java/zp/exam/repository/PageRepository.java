/***********************************************************
 * @Description : 页面的数据库操作类
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023/04/06 17:58
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.repository;

import zp.exam.entity.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PageRepository extends JpaRepository<Page, Integer> {
}
