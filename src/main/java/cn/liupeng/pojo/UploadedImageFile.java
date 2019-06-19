package cn.liupeng.pojo;

import org.springframework.web.multipart.MultipartFile;

public class UploadedImageFile {

    private MultipartFile multipartFile;

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }
}
