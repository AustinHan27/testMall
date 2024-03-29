package com.atguigu.gamll.manage.controller;

import org.apache.commons.lang3.StringUtils;
import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@CrossOrigin
public class FileController {
    @Value("${fileServer.url}")
    String fileServerUrl;
    @PostMapping("fileUpload")
    public String fileUpload(@RequestParam("file")MultipartFile multipartFile) throws IOException, MyException {
        String confPath = this.getClass().getResource("/tracker.conf").getFile();
        ClientGlobal.init(confPath);
        TrackerServer trackerServer = new TrackerClient().getConnection();
        StorageClient storageClient = new StorageClient(trackerServer,null);
        String originalFilename = multipartFile.getOriginalFilename();
        String extName = StringUtils.substringAfterLast(originalFilename,".");
        String[] upload_file = storageClient.upload_file(multipartFile.getBytes(),extName,null);
        String fileUrl = fileServerUrl;
        for (int i = 0; i < upload_file.length; i++){
            String s = upload_file[i];
            fileUrl+="/"+s;
        }
        return fileUrl;
    }
}
