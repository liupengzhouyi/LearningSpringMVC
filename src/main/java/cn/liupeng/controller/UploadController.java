package cn.liupeng.controller;

import cn.liupeng.pojo.UploadedImageFile;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @author liupeng
 */
@Controller
@RequestMapping(path = "/upload")
public class UploadController {

    @RequestMapping("/uploadImage")
    public ModelAndView upload(HttpServletRequest request, UploadedImageFile file) throws IllegalStateException, IOException {
        // 生成图片的随机名称
        String name = RandomStringUtils.randomAlphanumeric(10);
        String newFileName = name + ".jpg";
        System.out.println("随机名字: " + newFileName);
        String realPath = request.getSession().getServletContext().getRealPath("/image");
        System.out.println("长传文件" + realPath);
        File newFile = new File("/Users/liupeng/IdeaProjects/LearningSpringMVC/src/main/webapp/image", newFileName);
        newFile.getParentFile().mkdirs();
        file.getMultipartFile().transferTo(newFile);
        ModelAndView modelAndView = new ModelAndView("showUploadedFile");
        modelAndView.addObject("imageName", newFileName);
        return modelAndView;
    }
}
