/***********************************************************
 * @Description : 
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023/04/06 17:57
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.repository;

import zp.exam.entity.ExamRecordLevel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRecordLevelRepository extends JpaRepository<ExamRecordLevel, Integer> {
}
