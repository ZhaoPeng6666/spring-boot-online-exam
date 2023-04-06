/***********************************************************
 * @Description : 
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023/04/06 17:58
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.repository;

import zp.exam.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExamRepository extends JpaRepository<Exam, String> {
    @Query("select e from Exam e order by e.updateTime desc")
    List<Exam> findAll();
}
