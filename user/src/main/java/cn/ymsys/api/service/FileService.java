package cn.ymsys.api.service;

import cn.hutool.core.io.FileTypeUtil;
import cn.hutool.core.util.IdUtil;
import cn.ymsys.api.common.enums.ExceptionEnum;
import cn.ymsys.api.common.util.Const;
import cn.ymsys.api.common.util.OwnException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class FileService {

    public String save(MultipartFile file) {
        if (file.isEmpty()) {
            throw new OwnException(ExceptionEnum.E_MODEL_DEFAULT_ERROR, "null exception");
        }
        String fileName = file.getOriginalFilename();
        String suffixName = FileTypeUtil.getTypeByPath(fileName);
        fileName = IdUtil.simpleUUID() + suffixName;
        File dest = new File(Const.ROOT + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IllegalStateException | IOException e) {
            new OwnException(ExceptionEnum.A_SYSTEM_DEFAULT_ERROR, e.getMessage());
        }
        return fileName;
    }
}
