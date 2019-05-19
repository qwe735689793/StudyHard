package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author sch
 * @create 2019/5/19
 */
@Controller
@RequestMapping("/")
public class OperationController {
    /**
     * 跳转到作业页面
     */
    @RequestMapping("getMyTask")
    public String getMyTask(ModelMap map) {
        return "MyTask";
    }

    /**
     * 单文件上传
     */
    @RequestMapping("/fileUpload")
    public String upload(@RequestParam("file") MultipartFile file) {
        String flag = "MyTask";
        if (!file.isEmpty()) {
            /*获取文件名*/
            String fileName = file.getOriginalFilename();
            /*构建文件存放路径*/
            String path = "D:/test/download";
            File dest = new File(path, fileName);
            /*判断路径是否存在*/
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            /*保存文件到目录*/
            try {
                file.transferTo(new File(path + File.separator + fileName));
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            flag = "index";
        }
        return flag;
    }
}
