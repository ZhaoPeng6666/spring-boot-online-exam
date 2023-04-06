package zp.exam.qo;
 
/***********************************************************
 * @Description : 文件传输的实体类
 * @author      : 赵鹏
 * @date        : 2023/4/6 17:56
 * @version     : V1.0
 ***********************************************************/
 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;
 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UploadModel {
    /**
     * 要保存的文件
     */
    private MultipartFile[] files;
    /**
     * 文件要存储的文件夹
     */
    private String dir;
}
